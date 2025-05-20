<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Créer un Objet</title>
</head>
<body>
<header>
    <h1>Création d'un Objet</h1>
</header>

<main>
    <form action="${pageContext.request.contextPath}/saveObjet" method="post">
        <div>
            <label for="nomObjet">Nom de l'objet :</label>
            <input type="text" id="nomObjet" name="nomObjet" required>
        </div>

        <div>
            <label for="descriptionObjet">Description :</label>
            <input type="text" id="descriptionObjet" name="descriptionObjet" required>
        </div>

        <div>
            <label for="user">Propriétaire (vous) :</label>
            <input type="text" id="user" name="user" value="${pageContext.request.userPrincipal.name}" readonly>
        </div>

        <div>
            <input type="submit" value="Enregistrer">
        </div>
    </form>

    <p style="color:green;">${messageJsp}</p>
</main>

<footer>
    <a href="${pageContext.request.contextPath}/ObjetsList">Voir la liste des objets</a>
</footer>
</body>
</html>
