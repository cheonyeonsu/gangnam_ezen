package com.day8_six;

class GrandFather{
	GrandFather() {
		System.out.println("생성자 : GrandFather");
	}
	
}//class

class Father extends GrandFather{
	Father(){
		System.out.println("생성자 : Father");
	}
	
}//class

class Child2 extends Father{
	
	Child2(){
		System.out.println("생성자 : Child2");
	}
	
	public void showChild() {
		System.out.println("Child2의 매서드 입니다. ");
	}
}//class

public class Inheritance3 {

	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.showChild();

		/*
		 단계별 상속
		 - 메모리는 최상위 클래스부터 차례대로 생성됨 (할아버지 → 아부지 → 나)
		 - 모든 상위 레벨의 생성자가 차례대로 호출되어지고, 제일 마지막에 자신의 것이 호출됨
		 
		 GrandFather → Father → Child2 순으로 생성자가 호출됨. 
		 */
		
	}

}//class
