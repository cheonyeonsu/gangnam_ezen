package com.day10;

public class SuperTest1 {
	public static void main(String args[]) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x=10;
	int y=30;
}

class Child extends Parent {
	int y=40;
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x+"\n");
		
		
		System.out.println("y=" + y); //40
		System.out.println("this.y=" + this.y); //40
		System.out.println("super.y="+ super.y); //부모변수의 멤버변수인 y > 30
	}
}

