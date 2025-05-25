<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Objets List</title>
</head>
<body>
<header>
    <h1>Objets List</h1>
</header>
<main>
    <table >
        <tr>
            <th>Objet Id</th><th>Objet Name</th><th>Description d'objet</th>
        </tr>
        <c:forEach var = "Objet" items="${ObjetList}">
            <%--            <c:out value = "${i}"/>--%>
        <tr>
            <td>${Objet.idObjet}</td>
            <td>${Objet.nomObjet}</td>
            <td>${Objet.descriptionObjet}</td>
            <td>
                <a onclick="return confirm('Voulez-cous vraiment suprimer cet objet???')"
                   href="delateObjet?id=${Objet.idObjet}">
                    Delate
                </a>
            </td>
            <td>
                <a href="displayObjet?id=${Objet.idObjet}">
                    Modifier
                </a>
            </td>

        <tr>
            </c:forEach>

    </table>
</main>
<footer>
    <a href="createObjet">Objet Creation</a>
</footer>
</body>
</html>



