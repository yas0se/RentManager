<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>

    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css">
    <meta charset="utf-8">
    <title>Objets List</title>
</head>
<body>
<div class="container mt-5">
    <header class="mb-4">
        <h1 class="text-center">Objets List</h1>
    </header>

    <main>
        <table class="table table-striped table-bordered">
            <thead class="table-dark">
            <tr>
                <th>Objet Id</th>
                <th>Objet Name</th>
                <th>Description d'objet</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="Objet" items="${ObjetList}">
                <tr>
                    <td>${Objet.idObjet}</td>
                    <td>${Objet.nomObjet}</td>
                    <td>${Objet.descriptionObjet}</td>
                    <td>
                        <a href="displayObjet?id=${Objet.idObjet}" class="btn btn-sm btn-warning me-2">
                            Modifier
                        </a>
                        <a href="delateObjet?id=${Objet.idObjet}"
                           onclick="return confirm('Voulez-vous vraiment supprimer cet objet ?')"
                           class="btn btn-sm btn-danger">
                            Delete
                        </a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </main>

    <footer class="mt-4 text-center">
        <a href="createObjet" class="btn btn-primary">Objet Creation</a>
    </footer>
</div>
</body>
</html>



