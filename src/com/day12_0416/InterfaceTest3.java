package com.day12_0416;

/*
직접적인 관계의 두 클래스(A-B)
클래스 A와 B는 직접적인 관계에 있다.
단점 : 한쪽(Provider)이 변경되면 이를 사용하는 다른 한쪽(user)도 변경되어야 함. 
A(user) -> B(Provider)
 */

class A{ //b클래스를 매개변수로 가지고 있다. a클래스 찍으면 b 클래스 나옴. 
/*
	public void method(B b) {
		b.methodB();
	}
	
	*/
	
	public void method(C c) {
		c.methodB();
	}
}

/*
class B{
	public void methodB() {
		System.out.println("B클래스의 메서드");
	}
}
*/
class C{
	public void methodB() {
		System.out.println("B클래스의 메서드");
	}
}


public class InterfaceTest3 {

	public static void main(String[] args) {
		A a = new A();
		//메서드 a를 호출하기
		//a.method(new B());
		a.method(new C());
		
	}

}
