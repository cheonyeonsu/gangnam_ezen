package com.day10.nine;

/*
 다형성(Polymorphism)
 -여러가지 형태를 가질 수 있는 능력
 - 부모클래스 타입의 참조변수로 자식 클래스의 인스턴스를 참조할 수 있도록함으로써 다형성을 구현
 - 하나의 부모 클래스로 여러개의 자식 클래스를 통합 관리
 */

class Parent{
	public void parentFunc() {
		System.out.println("부모 메서드-parentFunc");
	}
	
	public void showInfo() {
		System.out.println("부모 showInfo()메서드!");
	}
	
	
}

class Child extends Parent{
	public void showInfo() {
		System.out.println("자식의 오버라이딩 메서드!");
	}
	
 
	public void childFunc() {
		System.out.println("자식만의 메서드");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		//부모참조변수가 자식 인스턴스를 참조
		Parent p = new Child(); //***부모에 자식을 넣는다>> 부모참조변수로 자식의 오버라이딩 매서드가 호출된다.*** 
		p.parentFunc(); //원래는 부모 멤버만 사용가능
		p.showInfo(); //자식의 오버라이딩 메서드 호출 **다형성의 핵심.**
	//	p.childFunc();> error : 부모크래스에 정의되지 않은 멤버 사용 불가. 
	//	자식이 추가한 자식만의 메서드는 호출 할 수가 없음.> 자식만의 메서드 사용 불가
		
		/*
		 #다형성
		 -부모의 참조변수에 자식의 인스턴스를 대입했을 때
		 - 부모의 참조변수로는 부모의 멤버들만 사용할 수 있다. 
		 - 단, 자식클래스에서 오버라이딩을 했다면, 자식의 오버라이딩 메서드가 실행됨.
		 
		 >> 부모타입이 모든 자식 타입을 가리킬 수 있으므로 부모타입의 변수로 모든 자식타입을 일관되게 관리할 수 있다.
		 
		 */
	}

}
