package com.day5;

public class OverloaddingTest1 {

	/*
	 오버로딩 메서드 : 하나의 클래스 내에서 동일한 이름을 가진 메서드, 
	  			 단,매개변수의 개수나 자료형이 달라야 함. 
	 */
	
	
	public static int add(int a, int b) {	//호출하고싶으면 int 2개
		int c= a+b;
		return c;
	}
	
	public static int add(int a, int b, int c) {	//호출하고싶으면 int 3개
		int d= a+b+c;
		return d;
	}
	
	public static double add(double a,double b) {	//호출하고싶으면 double 2개
		double c= a+b;
		return c;
	}
	
	//오버로딩 메서드가 아님! >> 리턴타입으로 구별 안함
	/*
	 * public static String add(int a, int b) { 
	 * String c = Integer.toString(a+b);
	 * return c; }
	 */
	
	public static void main(String[] args) {
		int result = add(10,20);
		System.out.println(result);
		
		result = add(10,20,30);
		System.out.println(result);
		
		double res= add(3.14,5.6);
		System.out.println(res);
		
		

	}
}
