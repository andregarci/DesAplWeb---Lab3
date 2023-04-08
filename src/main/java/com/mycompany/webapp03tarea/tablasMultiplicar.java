/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.webapp03tarea;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andga
 */
@WebServlet(name = "tablasMultiplicar", urlPatterns = {"/tablasMultiplicar"})
public class tablasMultiplicar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public ArrayList<String>[] tablasMultiplicar(int n) {
        ArrayList<String>[] tablas = new ArrayList[n];
        for(int k = 1; k<n; k++){
            ArrayList<String> tabla = new ArrayList<String>();
            for (int i = 1; i <= 10; i++) {
                String operacion = k + " * " + i + " = " + (k*i) + "  ";
                tabla.add(operacion);
                tablas[k] = tabla;
                }
            }
        return tablas;
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int n = Integer.parseInt(request.getParameter("tablas"));
        ArrayList<String>[] tablas = tablasMultiplicar(n + 1);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet tablasMultiplicar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet tablasMultiplicar at " + request.getContextPath() + "</h1>");
            out.println("<p>");
            for (int i = 1; i < tablas.length; i++) {
                out.println("<h2>" + "Tabla del " + i + "</h2>");
                out.println(tablas[i]);
                if (i != tablas.length - 1) {
                    out.print("<br> ");
                    }
                }
            out.println("</p>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
