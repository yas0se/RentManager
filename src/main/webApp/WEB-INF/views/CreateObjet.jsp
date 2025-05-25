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
            <h1>Objet Creation</h1>
        </header>
        <main>
            <form action="saveObjet" method="post">
                <div>
                    <label for="nomObjet">Objet Name : </label>
                    <input type="text" id="nomObjet" name="nomObjet">
                </div>
                <div>
                    <label for="descriptionObjet">Description : </label>
            	     <input type="text" id="descriptionObjet" name="descriptionObjet">
                </div>
                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
            ${messageJsp}
        </main>
        <footer>
            <a href="objetList">Objets List</a>
        </footer>
    </body>
</html>


