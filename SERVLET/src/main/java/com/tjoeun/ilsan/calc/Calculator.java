package com.tjoeun.ilsan.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator {

	private static Calculator cal;

	// 싱글톤
	private Calculator() {

	}

	// 칼큘레이터 인스턴스 전달
	public static Calculator getInstance() {
		// 칼큘레이터가 null이면 생성
		if (null == cal) {
			cal = new Calculator();
		}
		return cal;
	}

	// 더하기
	public int add(HttpServletRequest req) {

		// calc.html에서 submit하여 보낸 req에서 num1을 꺼낸다(num1은 calc.html 인풋에 지정되어 있는 name)
		// getParameter는 값을 String으로 리턴한다
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		// 들어온 값들을 숫자로 변환해서 더하여 변수에 저장
		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);

		return sum;
	}

	// 빼기
	public int substract(HttpServletRequest req) {

		// calc.html에서 submit하여 보낸 req에서 num1을 꺼낸다(num1은 calc.html 인풋에 지정되어 있는 name)
		// getParameter는 값을 String으로 리턴한다
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		// 들어온 값들을 숫자로 변환해서 더하여 변수에 저장
		int substract = Integer.parseInt(num1) - Integer.parseInt(num2);

		return substract;
	}

	// 곱하기
	public int multiply(HttpServletRequest req) {

		// calc.html에서 submit하여 보낸 req에서 num1을 꺼낸다(num1은 calc.html 인풋에 지정되어 있는 name)
		// getParameter는 값을 String으로 리턴한다
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		// 들어온 값들을 숫자로 변환해서 더하여 변수에 저장
		int mulitply = Integer.parseInt(num1) * Integer.parseInt(num2);

		return mulitply;
	}

	// 나누기
	public int divide(HttpServletRequest req) {
		int divide = 0;
		// calc.html에서 submit하여 보낸 req에서 num1을 꺼낸다(num1은 calc.html 인풋에 지정되어 있는 name)
		// getParameter는 값을 String으로 리턴한다
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");

		// 들어온 값들을 숫자로 변환해서 둘 다 0이 아니라면 나누기 아니면 0리턴
		if(0 != Integer.parseInt(num1) && 0 != Integer.parseInt(num2)) {
			divide = Integer.parseInt(num1) / Integer.parseInt(num2);
		}
		return divide;
	}
}
