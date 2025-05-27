<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Transactions List</title>
</head>
<body class="bg-light">
<jsp:include page="navbar.jsp" />
<div class="container mt-5">
    <header class="mb-4">
        <h1 class="text-center">Transactions List</h1>
    </header>

    <main>
        <table class="table table-striped table-bordered">
            <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Objet</th>
                <th>Utilisateur</th>
                <th>Date début</th>
                <th>Date fin</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="t" items="${transactions}">
                <tr>
                    <td>${t.id}</td>
                    <td>${t.objet.nomObjet}</td>
                    <td>${t.username}</td>
                    <td>${t.dateDebut}</td>
                    <td>${t.dateFin}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </main>

    <footer class="mt-4 text-center">
        <a href="createTransaction" class="btn btn-primary">Create New Transaction</a>
    </footer>
</div>
</body>
</html>