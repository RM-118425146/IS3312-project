<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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

        <link rel="stylesheet" href="styles/cart.css" type="text/css"/>


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
                            <span class="sr-only">(current)</span>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container">

            <!-- Page Heading -->
            <h1 class="my-4">Thank You!
                <small>Your items have been added to your cart, click to check out!</small>
            </h1>

            <div class="row-error">
                <div >
                    <h1>Your cart</h1>

                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th scope="col">Quantity</th>
                                <th scope="col">Description</th>
                                <th scope="col">Price</th>
                                <th scope="col">Amount</th>
                            </tr>
                        </thead>
                        <tbody>

                            <%@ taglib uri="WEB-INF/murach.tld" prefix="mma" %>
                            <mma:cart>
                                <tr>
                                    <td>${quantity}</td>
                                    <td>${productDescription}</td>
                                    <td>${productPrice}</td>
                                    <td>${total}</td>
                                </tr>
                            </mma:cart>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td><a href="./productServlet"> Continue Shopping</a> | <a href="./Payment.jsp">checkout</a></td>
                            </tr>
                        </tbody>
                    </table>


                </div>
            </div>
        </div>

        <footer class="py-5 bg-dark">
            <div class="container">
                <p class="m-0 text-center text-white">Copyright &copy; Murnane &AMP; Co. 2020</p>
            </div>
        </footer>

    </body>
</html>


