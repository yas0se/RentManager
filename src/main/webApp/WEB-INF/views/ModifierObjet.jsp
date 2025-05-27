<%@ page import="java.security.Principal" %>
<%
    Principal user = request.getUserPrincipal();
    String username = (user != null) ? user.getName() : "Invité";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Objet Creation</title>
</head>
<body class="bg-light">
<jsp:include page="navbar.jsp" />
<div class="container py-5">
    <header class="mb-5 text-center">
        <h1 class="display-4">Objet Modification</h1>
    </header>

    <main class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
            <form action="modifierObjet" method="post" class="bg-white p-4 rounded shadow-sm">
                <!-- Hidden ID field -->
                <div class="mb-3 d-none">
                    <label for="idObjet" class="form-label">Objet id:</label>
                    <input type="text" class="form-control" id="idObjet" name="idObjet" value="${ObjetDisplay.idObjet}">
                </div>

                <div class="mb-3">
                    <label for="nomObjet" class="form-label fw-bold">Objet Name:</label>
                    <input type="text" class="form-control" id="nomObjet" name="nomObjet" value="${ObjetDisplay.nomObjet}" required>
                </div>

                <div class="mb-3" >
                    <label for="username" class="form-label fw-bold">Objet Owner:</label>
                    <input type="text" class="form-control" id="username" name="username" value="<%= username %>" readonly>

                </div>

                <div class="mb-4">
                    <label for="descriptionObjet" class="form-label fw-bold">Description:</label>
                    <input type="text" class="form-control" id="descriptionObjet" name="descriptionObjet" value="${ObjetDisplay.descriptionObjet}" required>
                </div>

                <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                    <a href="objetList" class="btn btn-outline-secondary me-md-2">Cancel</a>
                    <button type="submit" class="btn btn-primary">Update</button>
                </div>
            </form>
        </div>
    </main>

    <footer class="mt-5 text-center">
        <a href="objetList" class="btn btn-link">
            <i class="bi bi-arrow-left"></i> Back to Objets List
        </a>
    </footer>
</div>

</body>
</html>


