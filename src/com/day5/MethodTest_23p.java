package com.day5;

public class MethodTest_23p {
	//매개변수, 반환값이 모두 없는 경우
	public static void fun1() {
		System.out.println("집에 가고싶어요");
	}
	//매개변수가 있는 경우
	public static void fun2(int a) {
		for(int i=0;i<a;i++) {
			System.out.print("피곤해");
		}
		System.out.println();
	}
	//반환값이 있는 경우
	public static double fun3() {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		double avg=sum/5;
		return avg;
	}
	
	//매개변수, 반환값이 모두 있는 경우 
	public static int fun4(int a, int b) {
		int c = a+b;
		return c;
	}

	public static void main(String[] args) {
		fun1();
		
		fun2(2);
		
		double d = fun3();
		System.out.println(d);
		
		int n = fun4(10,20);
		System.out.println(n);
	}

}
