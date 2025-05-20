<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Objects List</title>
</head>
<body>
<h1>Objects List</h1>
<table border="1">
    <tr>
        <th>Name</th><th>Description</th><th>Owner</th>
    </tr>
    <c:forEach var="objet" items="${objets}">
        <tr>
            <td>${objet.name}</td>
            <td>${objet.description}</td>
            <td>${objet.owner.username}</td>
        </tr>
    </c:forEach>
</table>
<footer><a href="createObjet">Create New Object</a></footer>
</body>
</html>
