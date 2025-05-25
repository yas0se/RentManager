<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Objet Creation</title>
</head>
<body>
<header>
    <h1>Objet Modification</h1>
</header>
<main>
    <form action="modifierObjet" method="post">
        <div>
            <label hidden for="idObjet">Objet id : </label>
            <input hidden type="text" id="idObjet" name="idObjet" value="${ObjetDisplay.idObjet}">
        </div>
        <div>
            <label for="nomObjet">Objet Name : </label>
            <input type="text" id="nomObjet" name="nomObjet" value="${ObjetDisplay.nomObjet}">
        </div>
        <div>
            <label for="descriptionObjet">Description : </label>
            <input type="text" id="descriptionObjet" name="descriptionObjet" value="${ObjetDisplay.descriptionObjet}">
        </div>
        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="objetList">Objets List</a>
</footer>
</body>
</html>


