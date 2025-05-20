<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<header><h1>User Login</h1></header>
<main>
    <form method="post" action="${pageContext.request.contextPath}/login">
        <div>
            <label>Username :</label>
            <input type="text" name="username" required>
        </div>
        <div>
            <label>Password :</label>
            <input type="password" name="password" required>
        </div>
        <div><button type="submit">Login</button></div>
    </form>
    <p style="color: red;">${param.error != null ? 'Invalid username or password.' : ''}</p>
    <p style="color: green;">${param.logout != null ? 'You have been logged out.' : ''}</p>
</main>
<footer>
    <a href="${pageContext.request.contextPath}/register">Not registered? Create an account</a>
</footer>
</body>
</html>
