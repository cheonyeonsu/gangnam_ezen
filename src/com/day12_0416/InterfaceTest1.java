package com.day12_0416;

import java.util.Scanner;

/*
	인터페이스(InterFace)
	- 일종의 추상 클래스
	- 추상 메서드와 상수만을 멤버로 가질 수 있다.
	- 메서드 목록만을 가지는 특별한 타입
	- 자식클래스가 구현해야 할 기능을 나열해 놓은 것
	- 미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는 데 사용됨
	- 인터페이스는 계약, 일종의 약속으로 최소한의 계약사항을 명시할 뿐 
	  
	 #인터페이스 선언
	 interface 인터페이스이름{
	 	public static final 타입 상수이름 = 값;
	 	public abstract 반환타입 메서드 이름(매개변수);
	 } 
	 
	 >> 모든 상수는 public static final이어야 하며, 이를 생략할 수 있다. 
	 >> 모든 메서드는 public abstract이어야 하며, 이를 생략할 수 있다
	 
	 
	 #인터페이스의 구현
	 class 클래스이름 implements 인터페이스이름{
	 
	 } 
	 - 인터페이스도 객체생성 불가
	 - 인터페이스의 메서드 중 일부만 구현한다면, 자식도 추상클래스로 선언해야 함

	 */

interface IAnimal{
	public abstract void sound();
	void showInfo(); //public abstract 생략 가능
}

class Cat2 implements IAnimal{
	public void sound() {
		System.out.println("야옹");
	}
	
	/*void showInfo() {
		Cannot reduce the visibility of the inherited method from IAnimal
		부모 메서드를 오버라이딩 할 때 접근제한자는 부모보다 넓어야 하므로.
	}*/
	
	public void showInfo() {
		System.out.println("Cat의 showInfo()");
	} //class
}

abstract class Dog2 implements IAnimal{
	public void sound() {
		System.out.println("멍멍");
		
	}
	public void showInfo() {
		System.out.println("Dog2의 showInfo()");
	}	
	//showInfo()는 구현하지 않았으므로 자식도 추상클래스
}

class Cow implements IAnimal{
	public void sound() {
		System.out.println("음메");
	}
	public void showInfo() {
		System.out.println("Cow의 showInfo()");
	}
}//class




public class InterfaceTest1 {

	public static void main(String[] args) {
	/* IAnimal ani = new IAnimal(); error > 인터페이스 생성 불가
	 * Dog d = new Dog(); error> 추상클래스*/
		Cat2 c = new Cat2();
		c.sound();
		c.showInfo();
		
		//다형성
		System.out.println("\n==========================");
		IAnimal an = new Cat2();
		an.sound();
		an.showInfo();
		
		an = new Cow();
		an.sound();
		an.showInfo();		

		//사용자에게 입력받아 강아지 고양이 소 선택
		Scanner sc = new Scanner(System.in);
		System.out.println("동물을 선택하세요. 1.고영 2.음머");
		int type=sc.nextInt();
		IAnimal ani = null;
		if(type==1) {
			ani = new Cat2();
		} else if(type==2) {
			ani = new Cow();
		} else {
			System.out.println("잘못 입력했습니다.");
			return;
		}
		ani.sound();
		ani.showInfo();
		
	}

}
