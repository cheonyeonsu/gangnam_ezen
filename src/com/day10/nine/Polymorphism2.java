package com.day10.nine;

import java.util.Scanner;

class Shape{
	public void draw() {
		System.out.println("도형을 그리는 메서드");
	}
	
	public void delete() {
		System.out.println("도형을 지우는 메서드");
	}
	
	public void parentFunc() {
		System.out.println("부모 메서드");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그립니다.");
	}
	
	public void delete() {
		System.out.println("원을 지웁니다. ");
	}
	
	public void sayCircle() {
		System.out.println("원 메서드");
	}
	
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}
	
	public void delete() {
		System.out.println("삼각형을 지웁니다. ");
	}
	public void sayTriangle() {
		System.out.println("삼각형 메서드!");
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		//기본 사용법
		Circle c = new Circle();
		c.draw();
		c.delete();
		c.sayCircle();
		
		//다형성 이용
		System.out.println("\n==========다형성 이용==========");
		Shape sh = new Circle(); //부모에 자식을 넣는다. 
		sh.draw(); //부모 참조변수로 자식의 오버라이딩 메서드 호출
		sh.delete();
		
		sh.parentFunc(); //부모 메서드 접근 가능
		//sh.sayCircle(); //자식의 멤버는 접근 불가.
		
		System.out.println("\n============================");
		sh=new Triangle();
		sh.draw(); //자식의 오버라이딩 메서드 호출
		sh.delete();
		
		//사용자로부터 원, 삼각형 중 입력받아서 해당 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요 ( 1.원 2.삼각형 )" );
		int type = sc.nextInt();
		
		if(type==1) {
			Circle c2 = new Circle();
			c2.draw();
			c2.delete();
		}else if(type==2) {
			Triangle tr = new Triangle();
			tr.draw();
			tr.delete();
		}else {
			System.out.println("잘못선택함!");
		}
		
		//다형성 이용
		System.out.println("\n======다형성 이용======");
		Shape s = null;
		if(type==1) {
			s=new Circle();
		}else if(type==2) {
			s=new Triangle();
		}else {
			System.out.println("잘못선택!");
			return;
		}
		
		s.draw();
		s.delete();
	}

}
