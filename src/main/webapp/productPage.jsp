<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Product"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Motivational Posters</title>

        <!-- Bootstrap core CSS -->
        <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="resources/css/shop-item.css" rel="stylesheet">

    </head>

    <body>

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">
                <a class="navbar-brand" href="./index.html">Murnane & Co. Hair Products</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="./index.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="./productServlet">Products</a>
                            <span class="sr-only">(current)</span>

                        </li>
                        <li class="nav-item">
                        <c:if test="${empty SKUSER.firstName}">
                            <a class="nav-link" href="./login.jsp">Login
                            </a>
                        </c:if>
                        <c:if test="${not empty SKUSER.firstName}">
                            <a class="nav-link" href="./login.jsp">Hi ${SKUSER.firstName} (LogOut)
                            </a>
                        </c:if>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="./cart.jsp">Cart</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <!-- Page Content -->
        <div class="container">

            <div class="row">

                <!-- /.col-lg-3 -->

                <div class="col-lg-9">

                    <div class="card mt-4">
                        <img class="card-img-top img-fluid" src="resources/images/${products.imageLocation}" alt="">
                        <div class="card-body">
                            <h3 class="card-title">${products.name}</h3>
                            <h4>€${products.price}</h4>
                            <p class="card-text">${products.description}</p>
                            <span class="text-warning">&#9733; &#9733; &#9733; &#9733; &#9734;</span>
                            4.0 stars
                            <hr>
                            <a href="CartServlet?itemCode=${products.itemCode}" class="btn btn-success">Add to Basket</a>
                        </div>
                    </div>
                    <!-- /.card -->

                    <div class="card card-outline-secondary my-4">
                        <div class="card-header">
                            Product Reviews
                        </div>
                        <div class="card-body">
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
                            <small class="text-muted">Posted by Anonymous on 3/1/17</small>
                            <hr>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
                            <small class="text-muted">Posted by Anonymous on 3/1/17</small>
                            <hr>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
                            <small class="text-muted">Posted by Anonymous on 3/1/17</small>
                            <hr>
                            <a href="#" class="btn btn-success">Leave a Review</a>
                        </div>
                    </div>
                    <!-- /.card -->

                </div>
                <!-- /.col-lg-9 -->

            </div>

        </div>
        <!-- /.container -->

        <!-- Footer -->
        <footer class="py-5 bg-dark">
            <div class="container">
                <p class="m-0 text-center text-white">Copyright &copy; Murnane &AMP; Co. 2020</p>
            </div>
        </footer>

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/popper/popper.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    </body>

</html>
