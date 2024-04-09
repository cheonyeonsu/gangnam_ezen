package com.day8_six;
//상속. ppt 41p

/*객체지향 언어의 3대 특징
 1. 캡슐화(은닉성)
 2. 상속성
 3. 다형성
 
 #상속 ☆★[자식 [부모]]☆★
 부모 클래스의 멤버들을 물려받아 자식클래스를 정의하는 기법
 자식 클래스는 부모 클래스의 멤버들을 사용할 수 있다.
 공통되는 부분을 부모클래스에서 관리하고, 자식클래스는 자신에 정의된 멤버들만 관리한다. 
 
 상위(super)클래스 - 기본(base)클래스, 부모클래스, 조상클래스
 하위(sub)클래스 - 파생(derived)클래스, 자식클래스, 자손클래스
 
 자식 클래스의 멤버개수는 부모 클래스와 같거나 많다.
 
 형식
 class 클래스이름 extends 부모클래스 
 */

class Parent{
	protected String name;
	protected int age;
	protected int money=10000;
}//class

class Son extends Parent{
	Son(){
		this.name="아들"; //this 생략 가능
		this.age=35;
	}
	
	public void printInfo() {
		System.out.println("나는 " + this.name);
		System.out.println("나이는 " + this.age + "살");
		System.out.println("물려받은 유산은 " + this.money + "원" +"\n");
	}
}//class

class Daughter extends Parent{
	Daughter(){
		name = "딸";
		age=30;
	}
	
	public void printInfo() {
		System.out.println("나는 " + this.name);
		System.out.println("나이는 " + this.age + "살");
		System.out.println("물려받은 유산은 " + this.money + "원"+"\n");
	}
}

class GrandChild extends Son{
	GrandChild(){ //할아버지 상속받은 아빠를 상속받음 > 다 내꺼^^! 아빠로부터 이름,나이 물려받고 할아버지로부터 유산 물려받음
		name = "손자"; 
		age =2;			
		
	}
}

public class Inheritance1 {
	public static void main(String[] args) {
		Son hong = new Son();
		hong.printInfo();
		
		Daughter d = new Daughter();
		d.printInfo();
		
		/* 
		   Son과 Daughter간에는 서로 아무런 관계도 성립되지 않음                   ↗   [부모]   ↖
		   Son과 Daughter 클래스에 공통적으로 추가되어야 하는 멤버가 있다면 		[Son]	≠	[Daughter] 
		   부모인 Parent클래스에 추가.								상속 때문에 부모,자식이라 그렇지 자식간에는 아무관계도 X
		*/
		
		GrandChild g= new GrandChild();
		g.printInfo(); 
		
		//자식 클래스의 인스턴스를 생성하면 부모 클래스의 맴버와 자식 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성됨. 
		
	}
} //class
