<!-- Directive 선언 없어도 돌아감 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<title>메인 페이지</title>
	<style>
		body {
			text-align: center;
		}

		div {
			margin-top: 20px;
			/* 위쪽 간격 조절 */
			margin-bottom: 20px;
			/* 아래쪽 간격 조절 */
		}
	</style>
</head>

<body>
	<div>
		<h1>원하는 메뉴를 선택하세요</h1>
	</div>
		<form id="moveToCalc" method="post" action="http://localhost/calc/moveToCalc.do">
		
		<div>
			<input type="button" id="btnCalc" value="계산기 프로그램">
		</div>
	</form>
	<script>

		// btnCalc 버튼을 찾기
		document.getElementById('btnCalc')
		// 이벤트 리스너 등록 - calc.html로 버튼 누르면 이동
		.addEventListener('click',function(){
			// location.href ='http://localhost/jsp/calc/calc_compute.jsp';
			document.getElementById('moveToCalc').submit();
		});
	</script>
</body>

</html>