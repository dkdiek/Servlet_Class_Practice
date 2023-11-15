package com.tjoeun.ilsan;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tjoeun.ilsan.calc.CalcController;

// 톰캣을 건드리는 순간 MainServlet이 모두 감지한다
public class MainServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("MainServlet - doPost");
		
		String uri = req.getRequestURI();
		System.out.println("uri:" + uri);
		String url = req.getRequestURL().toString();
		System.out.println("url:" + url);
		// 서블릿이 어느 컨트롤러인지 확인
		if(uri.startsWith("/calc/")) {
			// (모델)
			CalcController.getInstance().service(req,res);

		}
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("MainServlet - doPost");
		
		String uri = req.getRequestURI();
		System.out.println("uri:" + uri);
		String url = req.getRequestURL().toString();
		System.out.println("url:" + url);
		// 서블릿이 어느 컨트롤러인지 확인
		if(uri.startsWith("/calc/")) {
			// (모델)
			CalcController.getInstance().service(req,res);

		}
		
	}
}
