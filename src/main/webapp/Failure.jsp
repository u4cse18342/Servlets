<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Failure</title>

<style>
body {
    margin: 0;
    font-family: Arial;
    background: linear-gradient(135deg, #ff416c, #ff4b2b);
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.card {
    background: white;
    padding: 40px;
    border-radius: 12px;
    text-align: center;
    box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
}

h1 {
    color: #dc3545;
}

p {
    font-size: 18px;
    color: #333;
}

a {
    display: inline-block;
    margin-top: 20px;
    padding: 10px 20px;
    background: #dc3545;
    color: white;
    text-decoration: none;
    border-radius: 6px;
}

a:hover {
    background: #a71d2a;
}
</style>

</head>

<body>

<div class="card">

    <h1>❌ Registration Failed</h1>

    <p>Something went wrong. Please try again.</p>

    <a href="index.html">Try Again</a>

</div>

</body>
</html>