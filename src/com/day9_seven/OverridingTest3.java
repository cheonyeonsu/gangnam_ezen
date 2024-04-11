package com.day9_seven;

import java.util.Scanner;

/* Shape 클래스 (부모 클래스)
 메서드 : findArea()
 면적을 구한다. => return 0;

 Circle 클래스 (자식 클래스)
 멤버변수 : 반지름
 메서드 : findArea() => 부모 클래스의 메서드 오버라이딩
 원의 면적을 구해서 return (원의 면적 : 3.14 * 반지름 * 반지름)

 Rectangle 클래스 (자식 클래스)
 멤버변수 : 가로, 세로
 메서드 : findArea() => 부모 클래스의 메서드 오버라이딩
 사각형의 면적을 구해서 return (가로*세로)*/
class Shape2{
	public double findArea() {
		return 0;
	}
}

class Circle2 extends Shape2{
	private int radius; //반지름
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	
	 //오버라이딩 매서드
	public double findArea() { 
		return radius*radius*3.14;

	}
}

class Rectangle extends Shape2{
	private int width;
	private int height;
	
	public void setWidth(int width) {
		this.width=width;
	} 
	
	public int getWidth() {
		return width;
	} 
	
	public void setHeight(int height) {
		this.height=height;
	} 
	
	public int getHeight() {
		return height;
	} 
	
	//부모는 0리턴, 자식에 맞게 내용 변경 : 오버라이딩. 
	public double findArea() {
		return width*height;
	}
	
	
}

public class OverridingTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//원의 넓이
		System.out.print("원의 반지름을 입력하세요: ");
	    int radius = sc.nextInt();
	    
		Circle2 c = new Circle2();
		c.setRadius(radius);
		System.out.println("원의 면적: " + c.findArea());
		
		//사각형의 넓이
        System.out.print("사각형의 가로를 입력하세요: ");
        int width = sc.nextInt();
        System.out.print("사각형의 세로를 입력하세요: ");
        int height = sc.nextInt();
        
		Rectangle r = new Rectangle(); //변수 r은 소문자로. 
		 r.setWidth(width);
	     r.setHeight(height);
	     System.out.println("사각형의 면적: " + r.findArea());
		
		
		
	}

}
