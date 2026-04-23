<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>

<style>
body {
	margin: 0;
	font-family: Arial;
	background: linear-gradient(135deg, #11998e, #38ef7d);
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
	color: #28a745;
}

p {
	font-size: 18px;
	color: #333;
}

a {
	display: inline-block;
	margin-top: 20px;
	padding: 10px 20px;
	background: #28a745;
	color: white;
	text-decoration: none;
	border-radius: 6px;
}

a:hover {
	background: #1e7e34;
}
</style>

</head>

<body>

	<div class="card">

		<h1>✔ Registration Successful</h1>

		<%
		String name = (String) session.getAttribute("uname");
		%>

		<p>
			Welcome, <b><%=name%></b> 🎉
		</p>

		<a href="index.html">Go Back</a>

	</div>

</body>
</html>