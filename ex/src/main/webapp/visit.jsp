<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="ex.*" %>
    
   <% 
  
   Connection conn = null;
   conn = visitjava.getConnection();
   
   
   
   String sql = "CREATE table visits("
         + "memo    varchar(50),"
         + "primary key(memo))";

      PreparedStatement pstmt = null;
      pstmt = conn.prepareStatement(sql);
   
   // 5.SQL Execute
      pstmt.executeUpdate();

   // 6. ResultSet Object
      // 미 실시 (sql 실행 결과 수신)
      
   // 7. Connection Close
      pstmt.close();
      conn.close();
      

   
         
   
   %>