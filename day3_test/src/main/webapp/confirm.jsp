<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.student"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>
<%

	student s=(student)session.getAttribute("S");

%>
<body>
<div data-role="page">
	<div data-role="header">
		<h1> SChool</h1>
	
	</div>
	
	
	<div data-role="content">
			<table width=50% align=center border=1>
		
			<tr>
			<td height=400>
			<form action="ok" method="post">
				<table width=400 align=center>
					<tr>
						<td>姓名
						<td><%=s.getName() %>
					<tr>
						<td>國文
						<td><%=s.getChi() %>
				
					<tr>
						<td>英文
						<td><%=s.getEng() %>
						
					<tr>
						<td>數學
						<td><%=s.getMath() %>
					<tr>
						<td colspan=2 align=center>
					
				<input type="button" value="提交" onclick="this.disabled=true;this.form.submit()">
				
				</table>
			</form>
	
			</table>
	</div>
	
	<div data-role="footer">
		<h4>taipei</h4>
	</div>
</div>
	<!--  <table width=600 align=center border=1>
		<tr align=center>
			<td><jsp:include page="title.jsp"/>
		<tr>
			<td height=400>
			<table width=400 align=center>
					<tr>
						<td>姓名
						<td><%=s.getName() %>
					<tr>
						<td>國文
						<td><%=s.getChi() %>
				
					<tr>
						<td>英文
						<td><%=s.getEng() %>
						
					<tr>
						<td>數學
						<td><%=s.getMath() %>
					<tr>
						<td colspan=2 align=center>
						<a href="ok">確定</a>
				
				
				</table>
		<tr align=center>
			<td><jsp:include page="end.jsp"/>
	
	</table>-->
	
</body>
</html>