package com.day7_0408;
//#2, #1과 세트 
public class AccountTest {

	public static void main(String[] args) {
	
		/*클래스를 작성한 다음, 클래스로부터 객체를 생성해서 사용
		 * 객체를 사용한다는 것 - 객체가 가지고잇는 속성과 기능을 사용한다는 뜻. 
		 * */
		
	//1. 객체 생성 - 해당 클래스의 멤버변수와 메서드를 메모리에 할당 
	Account acc; //클래스명 참조변수;
	acc = new Account(); //변수는~~ >> 메모리에 올라가서 사용 가능. 
	
	//2. 메서드 사용. "참조변수."
	acc.showBalance(); //멤버변수는 자동으로 디폴트값으로 초기화됨
	
	//두번째 객체(또다른 객체) 생성 
	Account acc2 = new Account();
	
	//멤버변수 사용 - 값 할당 
	acc2.accId="100-2000-001";
	acc2.name="홍길동";	
	acc2.balance=100000;
	
	//메서드 사용
	acc2.withdraw(30000); //3만원 출금
	acc2.showBalance(); 
	
	acc2.deposit(50000); //5만원 입금
	
	System.out.println("현재 잔액: " +acc2.balance); //멤버변수
	
	
}
}
