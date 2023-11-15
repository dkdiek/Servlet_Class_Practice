package com.tjoeun.ilsan.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcModel {

	private static CalcModel cm;

	// 싱글톤
	private CalcModel() {

	}

	// 칼큘레이터 인스턴스 전달
	public static CalcModel getInstance() {
		// 칼큘레이터가 null이면 생성
		if (null == cm) {
			cm = new CalcModel();
		}
		return cm;
	}

	// 더하기
	public int compute(HttpServletRequest req) {
		int result = 0;
		// calc.html에서 submit하여 보낸 req에서 num1을 꺼낸다(num1은 calc.html 인풋에 지정되어 있는 name)
		// getParameter는 값을 String으로 리턴한다
		String num1 = req.getParameter("num1");
		String operator = req.getParameter("operator");
		String num2 = req.getParameter("num2");
		
		if("add".equals(operator) ) {
			result = Integer.parseInt(num1) + Integer.parseInt(num2);
		} else if("del".equals(operator) ) {
			result = Integer.parseInt(num1) - Integer.parseInt(num2);
		} else if("mul".equals(operator) ) {
			result = Integer.parseInt(num1) * Integer.parseInt(num2);
		} else if("div".equals(operator) ) {
			if(0 != Integer.parseInt(num1) && 0 != Integer.parseInt(num2)) {
				result = Integer.parseInt(num1) / Integer.parseInt(num2);
			} else {
				result = 0;
		}
	}

		return result;
	}
}
