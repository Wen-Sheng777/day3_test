<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>
<div data-role="page">
	<div data-role="header">
		<h1> SChool</h1>
	
	</div>
	
	
	<div data-role="content">
			<table width=50% align=center border=1>
		
			<tr>
			<td height=400>
			<form action="add" method="post">
				<table width=400 align=center>
					<tr>
						<td>姓名
						<td><input type="text" name="name">
					<tr>
						<td>國文
						<td><input type="text" name="chi">
				
					<tr>
						<td>英文
						<td><input type="text" name="eng">
						
					<tr>
						<td>數學
						<td><input type="text" name="math">
					<tr>
						<td colspan=2 align=center>
						<input type="submit" value="ok">
				

				</table>
			
			</form>
		
	
			</table>
	</div>
	
	<div data-role="footer">
		<h4>taipei</h4>
	</div>
</div>

<!-- <table width=600 align=center border=1>
		<tr align=center>
			<td><jsp:include page="title.jsp"/>
		<tr>
			<td height=400>
			<form action="add" method="post">
				<table width=400 align=center>
					<tr>
						<td>姓名
						<td><input type="text" name="name">
					<tr>
						<td>國文
						<td><input type="text" name="chi">
				
					<tr>
						<td>英文
						<td><input type="text" name="eng">
						
					<tr>
						<td>數學
						<td><input type="text" name="math">
					<tr>
						<td colspan=2 align=center>
						<input type="submit" value="ok">
				
				
				</table>
			
			</form>
				
			
		<tr align=center>
			<td><jsp:include page="end.jsp"/>
	
	</table> -->


</body>
</html>