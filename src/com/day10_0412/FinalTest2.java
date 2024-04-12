package com.day10_0412;

class AAA{
	final public static double PI=3.141592; //final : 변경되지 않는 값 > 여러군데에서 쓸 수 있음. 수정할 때 용이함.
	public final int DELIVERY=3000; 
	int age = 10;
}


public class FinalTest2 {
	public static void main(String[] args) {
		final double INTEREST_RATE=0.03; 
		
		AAA obj = new AAA();
		
		System.out.println("PI : " + AAA.PI);
		System.out.println("배송비 : " + obj.DELIVERY);
		System.out.println("이자율 : " + INTEREST_RATE);
		
		obj.age=15; //변수는 값 변경 가능
		//obj.DELIVERY=5000; //error : 상수는 값 변경 불가
		//AAA.PI = 3.14; //error 
		//INTEREST_RATE=0.04; //error
	}

}
