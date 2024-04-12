package com.day10_0412;

/*
#클래스를 재사용하는 방법
[1] 상속이용
	is a 관계가 성립하면 상속을 이용한다.
	~ is a ~ > ~는 일종의 ~이다. 예) SportsCar is a Car
[2] 포함관계이용
	has a 관계가 성립하면 포함관계를 이용한다.
	~ has a ~ > ~는 ~를 가지고 있다. 예) Circle has a Point
	
*/

class Circle2{ //포함관계 이용
	private Point p; //Point 클래스를 멤버변수로 포함시킨다.
	private int r; //반지름
	

	Circle2(Point p, int r){
		this.p = p;
		this.r = r;
	}

	public void printInfo() {
		System.out.println("x="+p.x);
		System.out.println("y="+p.y);
		System.out.println("r="+r+"\n");
	}
	
	
}


public class HasaTest {

	public static void main(String[] args) {
		//1번째 방법
		Circle2 c = new Circle2(new Point(7, 9),10);		
		c.printInfo();

		//2번째 방법
		Point p = new Point(7,9);
		Circle2 c2 = new Circle2(p,10);
		c.printInfo();

	}

}
