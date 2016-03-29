<%@page import="java.util.List"%>
<html>
	<head></head>
	<body>
		<h1>Beer Recommendations JSP</h1>
		<p>
			<ul>
			<%
				List<String> brands = (List<String>)request.getAttribute("brands");
				for(String brand : brands) {
					out.println("<li>" + brand + "</li>");
				}
			%>
			</ul>
		</p>
	</body>
</html>