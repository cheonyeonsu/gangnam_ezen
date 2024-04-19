package com.day7;

import java.util.Scanner;

class Triangle{
	//멤버변수가 없는 클래스
	public int findArea(int w,int h) {
		return w*h/2;
	}
}

//집중 연습 
class Triangle2{
	//맴버변수가 있는 클래스
	
	//맴버변수
	int width;//밑변
	int height;//높이
	
	//생성자
	Triangle2(int w, int h){
		width = w;
		height = h;
	}
	
	//매서드
	public int findArea() {
		return width*height/2;
	}
}


public class TriangleTest3 {

public static int findArea(int w,int h) {
	return w*h/2;
}
	
	public static void main(String[] args) {
		//[3] 매서드만 만들어서  삼각형 면적 구하기 
		
		
		//사용자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형 밑변, 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//로직처리 - 클래스 객체 생성 후 메서드 호출
		Triangle tr = new Triangle();
		int area = findArea(w,h);
		
		//결과 출력 
		System.out.println("삼각형 면적 : " +area);
		
		//[4] 멤버변수가 있는 클래스 만들어서 처리
		System.out.println("삼각형 밑변, 높이 다시 입력!");
		Triangle2 t = new Triangle2(w,h);
		
		area = t.findArea();
		System.out.println("\n삼각형 면적 : "+ area);
	}

}
