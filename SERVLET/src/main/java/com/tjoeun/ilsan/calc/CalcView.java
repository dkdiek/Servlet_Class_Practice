package com.tjoeun.ilsan.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcView {

	// 클래스 인스턴스
	private static CalcView cv;

	// 생성자 private
	private CalcView() {

	}

	// 클래스 인스턴스 리턴
	public static CalcView getInstance() {
		if (null == cv) {
			cv = new CalcView();
		}
		return cv;
	}

	// 계산 결과 출력
	public void display(HttpServletRequest req, HttpServletResponse res, int result) {
		try {
			// 인코딩 utf-8로 변경
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset = UTF-8");

			// res.getWriter()를 호출하여 PrintWriter 객체를 얻습니다.
			// 이 객체를 사용하여 클라이언트에게 텍스트 기반의 응답을 보낼 수 있습니다.
			PrintWriter printWriter = res.getWriter();
			// printWriter.write를 사용하면 CalcServlet에서 클라이언트가 볼수있게 직접 텍스트를 출력할 수 있습니다.
			String operator = req.getParameter("operator");
			String operKor = "";

			if ("add".equals(operator)) {
				operKor = "더하기";
			} else if ("del".equals(operator)) {
				operKor = "빼기";
			} else if ("mul".equals(operator)) {
				operKor = "곱하기";
			} else if ("div".equals(operator)) {
				operKor = "나누기";
			}

			printWriter.write("두 수의 " + operKor + "는 " + result + "입니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
