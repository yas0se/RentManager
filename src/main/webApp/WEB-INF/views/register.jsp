<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
</head>
<body>
<header>
    <h1>User Registration</h1>
</header>

<main>
    <form action="${pageContext.request.contextPath}/register" method="post">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
        </div>

        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>

        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>

        <div>
            <input type="submit" value="Register">
        </div>
    </form>

    <p style="color: green;">${messageJsp}</p>
</main>

<footer>
    <a href="${pageContext.request.contextPath}/login">Already have an account? Login</a>
</footer>
</body>
</html>
