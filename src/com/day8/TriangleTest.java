package com.day8;
//어제꺼 복습
import java.util.Scanner;

public class TriangleTest {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변, 높이 입력!");
		int w=sc.nextInt();	
		int h=sc.nextInt();	
		
		//생성자를 이용한 멤버변수 초기화
		Triangle tr = new Triangle(w,h);
		int area = tr.findArea();
		System.out.println("삼각형 면적 : " + area);
		
		//setter를 이용해 멤버변수 값 변경
		System.out.println("\n새로운 밑변, 높이 입력!");
		w=sc.nextInt();	
		h=sc.nextInt();	
		tr.setWidth(w);
		tr.setHeight(h);
		
		area=tr.findArea();
		System.out.println("변경된 밑변 :" + tr.getWidth());
		System.out.println("변경된 밑변 :" + tr.getHeight());
		System.out.println("면적 : " + area);
	}
}
