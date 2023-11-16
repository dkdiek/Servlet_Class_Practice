<!-- Directive 선언 없어도 돌아감 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>계산기 페이지</title>
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
		<h1>계산기</h1>
		<h3>계산 정보를 입력하고 완료 버튼을 누르세요</h3>
	</div>

	<div>
		<!-- 인풋타입들을 폼 태그로 감싸고 폼을 전송할 주소를 action으로 정의 -->
		<form id="frmCalc" method="post" action="http://localhost/calc/calcResult.do">
			<!-- 숫자 입력 인풋 1 -->
			<div>
				<input type="number" name="num1" id="num1" placeholder="숫자1"><br>
			</div>
			<!-- 라디오 버튼 -->
			<div>
				<input type='radio' name='operator' value='add' checked />+
				<input type='radio' name='operator' value='del' />-
				<input type='radio' name='operator' value='mul' />*
				<input type='radio' name='operator' value='div' />/
				<br>
			</div>
			<!-- 숫자 입력 인풋 2 -->
				<input type="number" name="num2" id="num2" placeholder="숫자2"><br>
			</div>
			<!-- 확인 버튼 -->
			<div>
				<input type="button" id="btnConfirm" value="확인">
			</div>
		</form>
	</div>

	<script>
		// id가 btnConfirm인 엘레멘트를 찾는다
		document.getElementById('btnConfirm')
			// 이벤트리스너 추가해서 클릭되면 펑션 실행
			.addEventListener('click', function () {

/*
				// 폼 안에 있는 모든 입력 필드에 대해 값을 입력안하면 0으로 처리 반복
				let formInputs = document.getElementById('frmCalc').elements;
				for (let i = 0; i < formInputs.length; i++) {
					// 숫자 입력 필드인 경우에만 처리
					if (formInputs[i].type === 'number') {
						// 값이 비어있을 경우 0으로 설정
						if (formInputs[i].value === '') {
							formInputs[i].value = '0';
						}
					}
				}
*/
				let num1 = document.getElementById('num1').value;
				let num2 = document.getElementById('num2').value;
				
				if (''== num1){
					alert('숫자 1은 필수 입력입니다.');
					document.getElementById('num1').focus();
					// 밑에 버튼 submit이 안되도록
					return;
				} else if ('' == num2){
					alert('숫자 2는 필수 입력입니다.');
					document.getElementById('num2').focus();
					return;
				}
				
				// id가 frmCalc인 폼(숫자 정보 인풋 포함)을 찾아 (폼에 정의된 action 주소로)submit 	
				document.getElementById('frmCalc').submit();
			});
	</script>
</body>

</html>