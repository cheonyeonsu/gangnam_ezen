package com.day7;
//#4
public class CircleTest {

	public static void main(String[] args) {
		//객체 생성 
		Circle c = new Circle();
		
		//멤버변수에 값을 직접 할당. >>값 안넣으면 디폴트값 0이라서 계산 안됨<<
		c.radius=10;
		
		//메서드 호출 
		double area = c.findArea();
		System.out.println("원의 넓이 : "+ area);
		
		double girth = c.findGirth(); //변수처리 안하고 직접 결과값 받아와도 됨. 
		System.out.println("원의 둘레: "+ girth);
		// || 같음.
		System.out.println("원의 둘레: "+ c.findGirth());
		

	}

}
