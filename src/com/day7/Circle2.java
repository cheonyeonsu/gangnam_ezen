package com.day7;


public class Circle2 {
//메모리에 올라가는 애들.
	
	//1. 멤버변수 
	int radius;//반지름 10

	//2. 생성자 - 멤버변수의 값 초기
	public Circle2(int r) {
		radius=r;
	}
	
	
	//3.메서드
	public double findArea() { //넓이 구하는 메서드, 관련된 변수 매개변수로 빼기.
		double area = radius*radius*3.14;
		return area;
		
	}
	
	public double findGirth() { //둘레 
		double girth= 2*radius*Math.PI;//math.pi안쓰고 3.14 해도 
		return girth;
	}
	
	
	
	
	


}
