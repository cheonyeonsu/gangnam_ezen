package com.day2.op;

public class RelationOp {

	public static void main(String[] args) {
		/*
		 비교연산자
		  >, >=, <, <=, ==, != [=는 무조건 오른쪽~ 방향 헷갈리지않기!]
		  
		*/
		
		int a = 7;
		int b = 3;
		boolean bool = (a>=b); //true
		
		System.out.println("a : " + a + ", b : " + b);
		System.out.println("a >= b : " + bool);
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a <= b : " + (a <= b));
	}

}
