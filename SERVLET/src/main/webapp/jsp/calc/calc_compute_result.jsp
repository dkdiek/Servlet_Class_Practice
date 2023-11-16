<!-- Directive 선언 없어도 돌아감 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!-- 변수 가져오기 -->
<%
	String operKor = (String) request.getAttribute("operKor");
	int result = (Integer) request.getAttribute("result");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>계산 결과</title>
	</head>
	<body>
		두 수의 <%= operKor %>는 <%= result %>입니다.
	</body>
</html>