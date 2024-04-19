package com.day9;
//#2+1
public class Circle {

	//1. 멤버변수 
	int radius;//반지름 10

	//생성자
	public Circle(int radius) {
		this.radius=radius;
	}


	//2.메서드
	public double findArea() { //넓이 구하는 메서드, 관련된 변수 매개변수로 빼기.
		double area = radius*radius*3.14;
		return area;

	}

	public double findGirth() { //둘레 
		double girth= 2*radius*Math.PI;//math.pi안쓰고 3.14도 가능.
		return girth;
	}

}