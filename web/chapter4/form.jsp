<html>
<head>
</head>
<body>
	<form method="post" action="servletLifeCycle">
		Select beer characteristics: POST <br>
		color: 
		<select name="color" size="1">
			<option>light</option>
			<option>amber</option>
			<option>brown</option>
			<option>dark</option>
		</select>
		<br>
		body: 
		<select name="body" size="1">
			<option>light</option>
			<option>medium</option>
			<option>heavy</option>
		</select>
		<br>
		Can Sizes:<br>
		<input type="checkbox" name="sizes" value="12oz"> 12 oz.<br>
		<input type="checkbox" name="sizes" value="16oz"> 16 oz.<br>
		<input type="checkbox" name="sizes" value="22oz"> 22 oz.<br>
		<br>
			<input type="submit">
	</form>
	
	<!-- ########## -->
	
	<form action="servletLifeCycle">
		Select beer characteristics: GET
		<p>
			<select name="color" size="1">
				<option>light</option>
				<option>amber</option>
				<option>brown</option>
				<option>dark</option>
			</select>
			<input type="submit">
	</form>
</body>
</html>