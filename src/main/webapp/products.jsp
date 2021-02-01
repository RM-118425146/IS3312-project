<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Murnane & Co. Hair Products</title>

        <!-- Bootstrap core CSS -->
        <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="resources/css/heroic-features.css" rel="stylesheet">

        <!-- Custom style for columns -->
        <link rel="stylesheet" href="resources/css/custom-css.css">

        <script type="text/javascript" src="resources/javascript/slide.js"></script>

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
                        <li class="nav-item active">
                            <a class="nav-link" href="./ProductServlet">Products
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="./login.jsp">Login</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>


        <h1 class="my-4-products">
            <small>Available products:</small>
        </h1>

        <!-- Page Content -->
        <div class="container-products">

            <!-- Page Features -->
            <div class="row text-center">

                <c:forEach items="${products}" var="topProducts">
                    <div class="col-lg-3 col-md-6 mb-4">
                        <div class="card">
                            <a href="#"><img class="card-img-top" src="resources/images/${topProducts.imageLocation}" alt=""></a>
                            <div class="card-body">
                                <h4 class="card-title">${topProducts.name}</h4>
                                <p class="card-text">${topProducts.description}</p>
                            </div>
                            <div class="card-footer">
                                <form action="CartServlet" method="post">
                                    <input type="hidden" name="itemCode" value="${topProducts.itemCode}">
                                    <input type="hidden" name="action" value="cart">
                                    <input type="submit" value="€${topProducts.price} - Add to Basket!" class="btn btn-primary">
                                </form>
                            </div>
                        </div>
                    </div>
                </c:forEach> 

                <!-- /.row -->

            </div>
            <!-- /.container -->

            <!-- Footer -->
            <footer class="py-5 bg-dark">
                <div class="container">
                    <p class="m-0 text-center text-white">Copyright &copy; Murnane &AMP; Co. 2020</p>
                </div>
                <!-- /.container -->
            </footer>

            <!-- Bootstrap core JavaScript -->
            <script src="resources/vendor/jquery/jquery.min.js"></script>
            <script src="resources/vendor/popper/popper.min.js"></script>
            <script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    </body>

</html>

