package com.day10;

/*
 final(변결될 수 없는)
 - 변수에 사용 : 값을 변경할 수 없는 상수가 됨
 - 메서드에 사용 : 오버라이딩을 할 수 없게 됨
 - 클래스에 사용 : 자식 클래스를 정의하지 못하게 됨 > 불임!
 
 final이 사용될 수 있는 곳 : 클래스, 메서드, 멤버변수, 지역변수
 
  */

final class Parent2{
	public void func() {
		System.out.println("Parent2의 메서드");
	}
}

//The type Child cannot subclass the final class Parent2
//class Child extends Parent2{ // error
//	
//}

class Parent3{
	public void func() {
		System.out.println("Parent3");
	}
	
	public final void finalFunc() {
		System.out.println("final 메서드");
}

	class Child2 extends Parent3{
		public void func() {
			System.out.println("Child2");
		}
		

//	public void finalFunc() {
//		
//	}
		
	}
	}
	
	
public class FinalTest {

	public static void main(String[] args) {
		

	}

}
