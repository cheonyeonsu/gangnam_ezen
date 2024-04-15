package com.day11_0415;

class BindingTest{
	public static void main(String[] args) { 
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);  //100
		/*
		다형성 : 부모의 참조변수로는 부모의 멤버만 사용 가능
		 */
		p.method();
		System.out.println("c.x = " + c.x); 
		c.method();
	} 
}
class Parent {
	int x = 100; 
	void method() {
	} 
}
class Child extends Parent { 
	int x = 200;
	void method() {
		System.out.println("Child Method");  //오버라이딩  메서드 
	}
}



