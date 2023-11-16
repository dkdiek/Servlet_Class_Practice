	package com.tjoeun.ilsan.calc;
	
	import java.io.IOException;
	
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	// HttpServlet을 상속 받아 doGet, doPost 메소드 오버라이딩
	public class CalcController extends HttpServlet {
	
		private static CalcController cc;
	
		// 싱글톤
		private CalcController() {
	
		}
	
		// 칼큘레이터 인스턴스 전달
		public static CalcController getInstance() {
			// 칼큘레이터가 null이면 생성
			if (null == cc) {
				cc = new CalcController();
			}
			return cc;
		}
	
		// 포스트 방식
		public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			// 컨트롤러는 어느 동작을 수행할지 확인
			String uri = req.getRequestURI();
			if("/calc/calcResult.do".equals(uri)) {
				// (모델)
				int result = CalcModel.getInstance().compute(req);
				// 결과 값 화면 출력(뷰)
				CalcView.getInstance().display(req, res, result);
				// 포워딩 타겟 설정
				RequestDispatcher rd = req.getRequestDispatcher("/jsp/calc/calc_compute_result.jsp");
				// 포워딩 설정
				rd.forward(req, res);
			} else if ("/calc/moveToCalc.do".equals(uri)) {
	            // run.do에 대한 처리 추가
	            // 포워딩 타겟 설정
	            RequestDispatcher rd = req.getRequestDispatcher("/jsp/calc/calc_compute.jsp");
	            // 포워딩 설정
	            rd.forward(req, res);
	        } 
		}
	}
