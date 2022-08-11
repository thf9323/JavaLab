<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<%

String driverClass = "com.mysql.jdbc.Driver";
Class.forName(driverClass);

//3.Connection Object
Connection conn = null;

String url = "jdbc:mysql://localhost:3306/exam";
String id = "root";
String pw = "0000";

conn = DriverManager.getConnection(url, id, pw);

//4.Statement Object
PreparedStatement pstmt = null;

	String sql = "SELECT * FROM visit";
	pstmt = conn.prepareStatement(sql);
	
	ResultSet rset = null;
	rset = pstmt.executeQuery();
%>
<div class="container">
<div class="alert alert-primary" role="alert" >
 memo
</div>
</div>
<div class="container">

<table class="table table-hover">
  <thead>
    <tr class="alert alert-dark" role="alert">
      <th scope="col">#</th>
      <th scope="col">memo</th>
    </tr>
  </thead>
  <tbody>
  
<%
	int i=1;
	while (rset.next())
	{
		String memo = rset.getString("memo");
		
		
%>
    <tr class= "alert alert-warning" role="alert" >
      <th scope="row"  ><%=i %></th>
      <td class="table-secondary"><%=memo %></td>
     
    </tr>
<% 
i++;
	}
%>  
  
  </tbody>
</table>		
		
</div>		
		
<%
rset.close();
pstmt.close();
conn.close();
%>





<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>