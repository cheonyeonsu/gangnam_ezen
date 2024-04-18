package com.day14.thirteen;

class Person{
	public void showInfo() {
		System.out.println("this = " + this);
	}
	
}

public class ObjectTest {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.toString()); //toString은 object꺼.
		System.out.println("p="+p);
		System.out.println(p);
		
		p.showInfo();
		
		/*
		toString () 메서드의 결과 : 클래스명 @16진수 해시코드 
		 */

	}

}
