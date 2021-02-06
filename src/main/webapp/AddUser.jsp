<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.User"%>
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
                                <a class="nav-link" href="./login.jsp">Hi ${SKUSER.firstName}
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
            <h1 class="my-4">Add New User</h1>

            <div class="row">
                <c:url value="./UserAdminServlet" var="insertUserUrl">
                    <c:param name="action" value="insertUser"/>
                </c:url>

                <form action="${insertUserUrl}" method="POST">
                    <div class="form-group row">
                        <label for="email" class="col-4 col-form-label">Email</label> 
                        <div class="col-8">
                            <input id="email" name="email" type="text" class="form-control" required="required">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="password" class="col-4 col-form-label">Password</label> 
                        <div class="col-8">
                            <input id="password" name="password" type="text" class="form-control" required="required">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="firstName" class="col-4 col-form-label">First Name</label> 
                        <div class="col-8">
                            <input id="firstName" name="firstName" type="text" class="form-control" required="required">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="lastName" class="col-4 col-form-label">Last Name</label> 
                        <div class="col-8">
                            <input id="lastName" name="lastName" type="text" class="form-control" required="required">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-4">User Type</label> 
                        <div class="col-8">
                            <select id="userType" name="userType">
                                <option value="ADMIN">Administrator</option>
                                <option value="GENUSER">Customer</option>
                            </select>
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
    <footer class="py-5-cust bg-dark">
        <div class="container">
            <p class="m-0 text-center text-white">Copyright &copy; Murnane &amp; Co. 2020</p>
        </div>
    </footer>
</html>

