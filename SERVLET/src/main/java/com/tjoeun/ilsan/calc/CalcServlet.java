package com.tjoeun.ilsan.calc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet을 상속 받아 doGet, doPost 메소드 오버라이딩
public class CalcServlet extends HttpServlet {

	// 포스트 방식
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("CalcServelt - POST");
		// 계산 결과
		int result = 0;
		// 라디오 버튼 이름
		String operation = req.getParameter("operation");

		if ("sum".equals(operation)) {
			result = Calculator.getInstance().add(req);
		} else if ("substract".equals(operation)) {
			result = Calculator.getInstance().substract(req);
		} else if ("multiply".equals(operation)) {
			result = Calculator.getInstance().multiply(req);
		} else if ("divide".equals(operation)) {
			result = Calculator.getInstance().divide(req);
			if (0 == result) {
				// 나누기는 0으로 나누기 불가 나누기 메소드 실행 후 return으로 아래 소스 스킵
				CalcDisplay.getInstance().addDivideDisplay(res, result);
				return;
			}
		}
		// 결과 값 화면 출력
		CalcDisplay.getInstance().addDisplay(res, result);

	}

	// 겟 방식
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("CalcServlet - Get");

		// 계산 결과
		int result = 0;
		// 라디오 버튼 이름
		String operation = req.getParameter("operation");

		if ("sum".equals(operation)) {
			result = Calculator.getInstance().add(req);
		} else if ("substract".equals(operation)) {
			result = Calculator.getInstance().substract(req);
		} else if ("multiply".equals(operation)) {
			result = Calculator.getInstance().multiply(req);
		} else if ("divide".equals(operation)) {
			result = Calculator.getInstance().divide(req);
			if (0 == result) {
				// 나누기는 0으로 나누기 불가 나누기 메소드 실행 후 return으로 아래 소스 스킵
				CalcDisplay.getInstance().addDivideDisplay(res, result);
				return;
			}
		}
		// 결과 값 화면 출력
		CalcDisplay.getInstance().addDisplay(res, result);

	}
}
