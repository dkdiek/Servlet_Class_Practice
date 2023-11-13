package com.tjoeun.ilsan.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet을 상속 받아 doGet 메소드 오버라이딩
public class CalcServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("CalcServlet");
		//calc.html에서 submit하여 보낸 req에서 num1을 꺼낸다(num1은 calc.html 인풋에 지정되어 있는 name)
		String num1 = req.getParameter("num1");//getParameter는 값을 String으로 리턴한다
		String num2 = req.getParameter("num2");
		// 들어온 값들을 숫자로 변환해서 더하여 변수에 저장
		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		
		try {
			// 인코딩 utf-8로 변경
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset = UTF-8");
			
			//res.getWriter()를 호출하여 PrintWriter 객체를 얻습니다.
			//이 객체를 사용하여 클라이언트에게 텍스트 기반의 응답을 보낼 수 있습니다.
			PrintWriter printWriter = res.getWriter();
			//printWriter.write를 사용하면 CalcServlet에서 클라이언트가 볼수있게 직접 텍스트를 출력할 수 있습니다.
			printWriter.write("두 수의 합은 " + sum +"입니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
