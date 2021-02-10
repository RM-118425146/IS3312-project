<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Product"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Murnane & Co. Hair Products</title>

        <!-- Bootstrap core CSS -->
        <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="resources/css/4-col-portfolio.css" rel="stylesheet">

        <!-- Custom style for columns -->
        <link rel="stylesheet" href="resources/css/custom-css.css">
        <link href="resourcescss/shop-homepage.css" rel="stylesheet">


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
                        </li>
                        <li class="nav-item">
                            <c:if test="${not empty SKUSER.firstName}">
                                <a class="nav-link" href="./login.jsp">Hi ${SKUSER.firstName} (LogOut)
                                    <span class="sr-only">(current)</span>
                                </a>
                            </c:if>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container">

            <!-- Page Heading -->
            <h1 class="my-4">Add New Product</h1>

            <div class="row">
                <c:url value="./ProductAdminServlet" var="insertProductUrl">
                    <c:param name="action" value="insertProduct"/>
                </c:url>

                <form action="${insertProductUrl}" method="POST">
                    <div class="form-group row">
                        <label for="name" class="col-4 col-form-label">Name</label> 
                        <div class="col-8">
                            <input id="name" name="name" type="text" class="form-control" required="required">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="itemCode" class="col-4 col-form-label">Item Code</label> 
                        <div class="col-8">
                            <input id="itemCode" name="itemCode" type="text" class="form-control" required="required">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="description" class="col-4 col-form-label">Description</label> 
                        <div class="col-8">
                            <input id="description" name="description" type="text" class="form-control" required="required">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="category" class="col-4 col-form-label">Category</label> 
                        <div class="col-8">
                            <input id="category" name="category" type="text" class="form-control" required="required">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="price" class="col-4 col-form-label">Price</label> 
                        <div class="col-8">
                            <input id="price" name="price" type="text" class="form-control" required="required">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="imageLocation" class="col-4 col-form-label">Image Location</label> 
                        <div class="col-8">
                            <input id="imageLocation" name="imageLocation" type="text" class="form-control" required="required">
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="offset-4 col-8">
                            <button name="submit" type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </div>
                </form> 
            </div>
        </div>
    </body>
    <footer class="py-5 bg-dark">
        <div class="container">
            <p class="m-0 text-center text-white">Copyright &copy; Murnane &AMP; Co. 2020</p>
        </div>
    </footer>
</html>


