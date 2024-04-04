package com.day5_0404;

import java.util.Scanner;


public class MethodTest3 {

	public static int minus(int a,int b) { //자료형 꼭 써주기
		int c=a-b;
		return c;
	}
	
	public static void main(String[] args) {
		
		//메서드 호출
		//1. 직접 값을 넘겨준다.
		int result = minus(30,10);
		System.out.println(result);
		
		//2.변수에 값을 넣어서 넘겨준다
		int n1=50, n2=20;
		result = minus(n1,n2); // ***minus(a,b)아닌 이유 : main에 없어. main에 있는 변수 넣어줘야함.***
		
		//3. 사용자 입력을 받아서 넣어준다. 
		//2)
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		
		//1)
		result = minus(num1,num2);
		System.out.println(result);
		
		//int.parseInt(String s)
		int a = Integer.parseInt("123"); 
		
		String str="4567";
		a=Integer.parseInt(str);
		
	}

}
