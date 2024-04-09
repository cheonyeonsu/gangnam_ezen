package com.day8_six;

class Child extends Parent{
	public void putData() {
		//num1=10; //private- 다른 클래스이므로 접근 불가
		//num2=10; //default - 다른 패키지 이므로 접근 불가
		num3=10; //protected - 상속 관계이므로 다른 패키지여도 접근 가능
		num4=10; //public - 어디서든 접근 가능
	}
}

public class ProtectedTest {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.putData();
		ch.showInfo();
		
		
		//System.out.println("private num1="+num1); 에러
		//System.out.println("default num2="+num2); 에러
		//System.out.println("protected num1="+num3); 에러
		System.out.println("public num4="+num4+"\n");

		
		//protected : 클래스 외부에서 보면 default로 보이고 상속의 관계에서 보면 public으로 보임. 
	}

}//class
