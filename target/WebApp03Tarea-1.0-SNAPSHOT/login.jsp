<%-- 
    Document   : login
    Created on : 07/04/2023, 10:24:19 PM
    Author     : andga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" 
              href="webjars/bootstrap/5.1.0/css/bootstrap.min.css" type="text/css" />
    </head>
    <body>
    <section class=" text-center text-lg-start">
      <div class="card mb-3">
        <div class="row g-0 d-flex align-items-center">
          <div class="col-lg-4 d-none d-lg-flex">
            <img src="https://i.pinimg.com/736x/80/9e/f0/809ef0e083be61263091fadc95171623--tampons-stencils.jpg"
              class="w-100" />
          </div>
          <div class="col-lg-8">
            <div class="card-body py-5 px-md-5">

              <form name="form" action="/WebApp03Tarea/verificar" method="post">
                <div class="form-outline mb-4">
                  <input type="text" name="xusu" class="form-control" />
                  <label class="form-label">Usuario</label>
                </div>
                <div class="form-outline mb-4">
                  <input type="password" name="xpas" class="form-control" />
                  <label class="form-label">Contraseña</label>
                </div>
                <div class="row mb-4">
                  <div class="col d-flex justify-content-center">
                  </div>
                </div>
                <button type="submit" class="btn btn-primary btn-block mb-4">Ingresar</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>
    </body>
</html>
