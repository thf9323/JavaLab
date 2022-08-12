<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	int i = 1;
%>

<%

	for(i=1; i<=10; i++){
		if(i % 2 == 0){
			out.print(i);
		}
	}

%>
<!-- 표현문 태그 - 매서드를 호출하여 그 결과를 문자열 형태로 출력  -->
<%= "짝수" %>




</body>
</html>