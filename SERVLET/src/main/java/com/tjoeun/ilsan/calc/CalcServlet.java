package com.tjoeun.ilsan.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("CalcServlet");
		//num1을 꺼낸다 인풋에 지정한 name
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		
		
		try {
			// 인코딩 변경
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset = UTF-8");
			// 값 출력
			PrintWriter printWriter = res.getWriter();
			printWriter.write("두 수의 합은 " + sum +"입니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
