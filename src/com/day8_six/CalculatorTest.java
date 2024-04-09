package com.day8_six;

class Calculator{
	//static 메서드
	public static int add(int a, int b) {
		return a+b;
	}
	
	//instance메서드
	public int minus(int a, int b) {
		return a-b;
	}
}


public class CalculatorTest {

	public static void main(String[] args) {
		
		//static메서드 호출 > 클래스명.메서드()
		int result = Calculator.add(25,30);
		System.out.println("합 : "+result);
		
		// int a = Integer.parseInt("123");
		
		// 2.instance 메서드 호출 > 객체 생성 후 참조변수.메서드()
		Calculator c = new Calculator();; //객체 생성
		result = c.minus(40,7);
		System.out.println("차 : "+result);
	}
}//class
