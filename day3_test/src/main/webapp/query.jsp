<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.*"
    import="DAO.studentDao"
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
<body>
<div data-role="page">
	<div data-role="header">
		<h1> SChool</h1>
	
	</div>
	
	
	<div data-role="content">
			<table width=50% align=center border=1>
		
				<tr>
				<td height=400 align=center>
				<%
						ResultSet rs=new studentDao().query();
				
				out.println("<table width=600 align=center border=1>");
				
				out.println("<tr align=center><td>id<td>name<td>chi<td>eng<td>math");
				
				while(rs.next())
				{
					out.println("<tr align=center><td>"+rs.getInt("id")+
									"<td>"+rs.getString("name")+
									"<td>"+rs.getInt("chi")+
									"<td>"+rs.getInt("eng")+
									"<td>"+rs.getInt("math"));
				}
				
				out.println("</table>");
				
				%>
				<br>
				<a href="index.jsp">home</a>
		
	
			</table>
	</div>
	
	<div data-role="footer">
		<h4>taipei</h4>
	</div>
</div>

</body>
</html>