<%@ page import="java.security.Principal" %>

<%
    Principal user = request.getUserPrincipal();
    String username = user.getName();
%>

<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/objetList">Mes Objet</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/transactionList">Mes Transaction</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Bienvenue, <%= username %></a>
                </li>
                <li class="nav-item ms-auto">
                    <a class="nav-link text-danger" href="/logout" style="font-weight: bold;">Logout</a>
                </li>
            </ul>
        </div>
    </nav>
</header>