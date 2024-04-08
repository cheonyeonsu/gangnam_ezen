package com.day7_0408;
//#2, #1과 세트 
public class AccountTest2 {

	public static void main(String[] args) {
	
	//Account2 = new Account2(); 
	
	//생성자에 의해 멤버변수 초기화 
	Account2 acc2 = new Account2("101-3000-003","김 길동 ", 200000);
		
	acc2.showBalance();
	
	//멤버변수의 값 변경하기 
	acc2.balance = 300000;
	acc2.name="이길수";
	acc2.showBalance();
	

	//기본생성자(매개변수가 없는 생성)
	public Account2() {
		
		
	}
	
	/*
	 * 생성자
	 - 멤버변수의 초기화를 목적으로 정의된 메서드
	 - 객체가 생성될 때 자동호출되어 가장 먼저 실행되는 메서드
	 - 클래스 이름과 동일함, 매개변수는 가질 수 있으나 반환값은 가질 수 없다. 
	 - 기본생성자는 컴파일러에 의해 자동으로 만들어짐
	 	그러나 다른 생성자가 있으면 컴파일러에 의해 기본생성자가 만들어지지 않음. 
	 * */
	
	
}
}
