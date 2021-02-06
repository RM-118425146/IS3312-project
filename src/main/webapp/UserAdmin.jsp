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
            <h1 class="my-4">User Administration</h1>

            <div class="row">

                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">First Name</th>
                            <th scope="col">Last Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${users}" var="user">
                            <c:url value="./UserAdminServlet" var="editUserUrl">
                                <c:param name="action" value="edit"/>
                                <c:param name="id" value="${user.id}"/>
                            </c:url>
                            <c:url value="./UserAdminServlet" var="deleteUserUrl">
                                <c:param name="action" value="delete"/>
                                <c:param name="id" value="${user.id}"/>
                            </c:url>
                            <tr>
                                <td scope="row">${user.id}</th>
                                <td>${user.firstName}</td>
                                <td>${user.lastName}</td>
                                <td>${user.email}</td>
                                <td><a href="${editUserUrl}"> Edit</a> <a href="${deleteUserUrl}">Delete</a></td>
                            </tr>
                        </c:forEach>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <c:url value="./UserAdminServlet" var="addUserUrl">
                                <c:param name="action" value="add"/>
                            </c:url>
                            <td><a href="${addUserUrl}" > Add </a></td>

                        </tr>
                    </tbody>
                </table>      
            </div>
        </div>
    </body>
    <footer class="py-5-cust bg-dark">
        <div class="container">
            <p class="m-0 text-center text-white">Copyright &copy; Murnane &amp; Co. 2020</p>
        </div>
    </footer>
</html>

