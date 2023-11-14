package com.tjoeun.ilsan.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class CalcDisplay {

	// 클래스 인스턴스
	private static CalcDisplay caldis;

	// 생성자 private
	private CalcDisplay() {

	}

	// 클래스 인스턴스 리턴
	public static CalcDisplay getInstance() {
		if (null == caldis) {
			caldis = new CalcDisplay();
		}
		return caldis;
	}
	
	// 계산 결과 출력
	public void addDisplay(HttpServletResponse res, int result) {
		try {
			// 인코딩 utf-8로 변경
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset = UTF-8");

			// res.getWriter()를 호출하여 PrintWriter 객체를 얻습니다.
			// 이 객체를 사용하여 클라이언트에게 텍스트 기반의 응답을 보낼 수 있습니다.
			PrintWriter printWriter = res.getWriter();
			// printWriter.write를 사용하면 CalcServlet에서 클라이언트가 볼수있게 직접 텍스트를 출력할 수 있습니다.
			printWriter.write("계산 결과는 " + result + "입니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 계산 결과 출력 나누기용
	public void addDivideDisplay(HttpServletResponse res, int result) {
		try {
			// 인코딩 utf-8로 변경
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset = UTF-8");
			
			// res.getWriter()를 호출하여 PrintWriter 객체를 얻습니다.
			// 이 객체를 사용하여 클라이언트에게 텍스트 기반의 응답을 보낼 수 있습니다.
			PrintWriter printWriter = res.getWriter();
			// printWriter.write를 사용하면 CalcServlet에서 클라이언트가 볼수있게 직접 텍스트를 출력할 수 있습니다.
			if(0 == result) {
				printWriter.write("0으로 나눌 수 없습니다");
			} else {
				printWriter.write("계산 결과는 " + result + "입니다");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
