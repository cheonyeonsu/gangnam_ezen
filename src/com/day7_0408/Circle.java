package com.day7_0408;
//#3

/*
 * 클래스란
 * [1] 객체 지향 이론의 관점에서 클래스는 객체를 생하기 위한 틀이며, 속성과 기능으로 구성되어 있다. 
 * [2] 프로그래밍 관점에서 틀래스는 자료형을 정의하는 것으로,관련된 변수와 메서드들을 함께 정의하는 것.
 * (사용자 정의 자료형, 참조) 
 * */
public class Circle {
//메모리에 올라가는 애들.
	
	//1. 멤버변수 
	int radius;//반지름 10

	
	//2.메서드
	public double findArea() { //넓이 구하는 메서드, 관련된 변수 매개변수로 빼기.
		double area = radius*radius*3.14;
		return area;
		
	}
	
	public double findGirth() { //둘레 
		double girth= 2*radius*Math.PI;//math.pi안쓰고 3.14 해도 
		return girth;
	}
	
	
	
	
	


}
