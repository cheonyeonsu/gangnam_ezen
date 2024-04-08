package com.day7_0408;

import java.util.Scanner;

//#4
public class CircleTest2 {

	public static void main(String[] args) {
		//객체 생성 
		Circle2 c = new Circle2(10); //생성자에 의해 멤버변수값 초기화 
	
		//메서드 호출
		double area = c.findArea();
		System.out.println("원의 면적 : " + area);
		
		//멤버변수 값 변경
	Scanner sc = new Scanner(System.in);
	System.out.println("반지름 입력!");
	c.radius=sc.nextInt();//생성자가 아니라 멤버변수에 직접 접근. 
	
	System.out.println("변경 후 원의 면적: " + c.findArea());
	}

}
