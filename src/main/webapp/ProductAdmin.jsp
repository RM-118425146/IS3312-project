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

    </head>
    <body>

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">
                <a class="navbar-brand" href="./index.jsp">Murnane & Co. Hair Products</a>
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
            <h1 class="my-4">Product Administration</h1>

            <div class="row">

                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th scope="col">Item Code</th>
                            <th scope="col">Name</th>
                            <th scope="col">Description</th>
                            <th scope="col">Price</th>
                            <th scope="col">Image Location</th>
                            <th scope="col">Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${Products}" var="Products">
                            <c:url value="./ProductAdminServlet?itemCode=${Products.itemCode}" var="editProductUrl">
                                <c:param name="action" value="edit"/>
                                <c:param name="id" value="${Products.id}"/>
                            </c:url>
                            <c:url value="./ProductAdminServlet" var="deleteProductUrl">
                                <c:param name="action" value="delete"/>
                                <c:param name="id" value="${Products.id}"/>
                            </c:url>
                            <tr>
                                <td scope="row">${Products.itemCode}</th>
                                <td>${Products.name}</td>
                                <td>${Products.description}</td>
                                <td>${Products.price}</td>
                                <td>${Products.imageLocation}</td>
                                <td><a href="${editProductUrl}"> Edit</a> <a href="${deleteProductUrl}">Delete</a></td>
                            </tr>
                        </c:forEach>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <c:url value="./ProductAdminServlet" var="addProductUrl">
                                <c:param name="action" value="add"/>
                            </c:url>
                            <td><a href="${addProductUrl}" > Add </a></td>

                        </tr>
                    </tbody>
                </table>

            </div>
        </div>
    </body>
    <footer class="py-5 bg-dark">
        <div class="container">
            <p class="m-0 text-center text-white">Copyright &copy; Murnane &AMP; Co. 2020</p>
        </div>
    </footer>
</html>

