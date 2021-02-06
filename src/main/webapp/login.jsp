<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
        <link href="resources/css/4-col-portfolio.css" rel="stylesheet">

        <!-- Custom style for columns -->
        <link rel="stylesheet" href="resources/css/custom-css.css">

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
                        <li class="nav-item active">
                            <a class="nav-link" href="./login.jsp">Login
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="Cust-row-login">
            <div class="Cust-column-login">
                <center>
                    <table>
                        <tr><td><h4 class="card-title"><a href="#">Login</a></h4></td></tr>
                        <tr>
                            <td><p>To login, enter</p></td>
                            <td><p> your email address and password below.</p></td>
                        </tr>
                        <form action="LoginServlet" method="post">
                            <input type="hidden" name="action" value="add">

                            <tr style="padding-top: 0.25em;">
                                <td><label style="padding-top: 0.25em;">Email:</label></td>
                                <td><input type="email" name="email" value="${user.email}"><br></td>
                            </tr>
                            <tr style="padding-top: 0.25em;">
                                <td><label style="padding-top: 0.25em;">Password:</label></td>
                                <td><input type="password" name="password" value="${user.password}"><br></td>        
                            <label>&nbsp;</label>
                            </tr>
                    </table>
                </center>
                <div style="padding-top: 0.25em;">            
                    <input type="submit" value="Login" class="margin_left">
                </div>
                </form>    
            </div>
            <div class="Cust-column-login">
                <h4 class="card-title">
                    <a href="#">Sign up</a>
                </h4>
                <p class="card-text">We stock 10's of products here at Murnane & co. ranging from shampoo and conditioner to hair brushes and hair gel. Whatever you want for your hair needs, we got it, probably. Browse our products now and take a look for yourself, we guarantee you won't be disappointed!</p>
            </div>
        </div>

        <footer class="py-5-cust bg-dark">
            <div class="container">
                <p class="m-0 text-center text-white">Copyright &copy; Murnane &amp; Co. 2020</p>
            </div>
        </footer>

    </body>
</html>
