package com.day11_0415;

import java.util.Scanner;

//#1
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
public class Polymorphism {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 입력하세요. 1.원 2.삼각형");
		int type = sc.nextInt();
		Shape s=createShape(type); //메서드 이름에 리턴된 값이 들어온다. 부모에 자식 넣기
		s.draw(); //오버라이딩으로 불러오기
		s.delete();
		sc.close();
		
		//Circle 배열
		Circle[] cArr = new Circle[2];
		//cArr[0]=new Circle();
		for (int i=0; i<cArr.length;i++) {
		cArr[i] = new Circle();
		cArr[i].draw(); 
		cArr[i].delete();
		}
		
		//Shape 배열
		Shape[] shArr = new Shape[3];
		//shape배열에 shape 넣는다. 부모니까 자식객체 넣는다. 
		shArr[0] = new Circle(); 
		shArr[1] = new Triangle();
		shArr[2] = new Circle();
		
		System.out.println("\n==========다형성 이용 - 배열==========");
		for (int i=0; i<shArr.length;i++) {
			shArr[i].draw(); //부모배열에 자식을 넣어서 일괄적으로 관리
			shArr[i].delete();
			
		}
	}

	public static Shape createShape(int type) { 
		Shape s = null; //다형성 없으면 사용 불가. Shape가 부모 > 자식이 리턴됨
		//type error > 매개변수이므로 , int type
		if(type==1) {
			s=new Circle();
		}else if(type==2) {
			s=new Triangle();
		}
		return s; //최종결과를 리턴해주면 에러 사라짐. s를 리턴하니까 반환타입은 Shape가 됨
	}





}
