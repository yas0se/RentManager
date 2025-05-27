<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Transaction</title>
</head>
<body class="bg-light">
<jsp:include page="navbar.jsp" />
<div class="container py-5">
    <header class="mb-5 text-center">
        <h1 class="display-4">Create Transaction</h1>
    </header>

    <main class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
            <form action="saveTransaction" method="post" class="bg-white p-4 rounded shadow-sm">
                <div class="mb-3">
                    <label for="objet" class="form-label fw-bold">Objet:</label>
                    <select class="form-select" name="objetId" id="objet" required>
                        <c:forEach var="objet" items="${objets}">
                            <option value="${objet.idObjet}">${objet.nomObjet}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="mb-3">
                    <label for="dateDebut" class="form-label fw-bold">Date début:</label>
                    <input type="date" class="form-control" id="dateDebut" name="dateDebut" required>
                </div>

                <div class="mb-4">
                    <label for="dateFin" class="form-label fw-bold">Date fin:</label>
                    <input type="date" class="form-control" id="dateFin" name="dateFin" required>
                </div>

                <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                    <a href="transactionList" class="btn btn-outline-secondary me-md-2">Cancel</a>
                    <button type="submit" class="btn btn-primary">Create Transaction</button>
                </div>
            </form>
        </div>
    </main>

    <footer class="mt-5 text-center">
        <a href="transactionList" class="btn btn-link">Back to Transactions List</a>
    </footer>
</div>
</body>
</html>