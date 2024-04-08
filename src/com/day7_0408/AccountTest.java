package com.day7_0408;
//#2, #1과 세트 
public class AccountTest {

	public static void main(String[] args) {
	
		/*클래스를 작성한 다음, 클래스로부터 객체를 생성해서 사용
		 * 객체를 사용한다는 것 - 객체가 가지고잇는 속성과 기능을 사용한다는 뜻. 
		 * */
		
	//1. 객체 생성 - 해당 클래스의 멤버변수와 메서드를 메모리에 할당 
	// [클래스의 속성을 구현] 	
	Account acc; //클래스명 참조변수;
	
	//값을 저장. 클래스는 틀이므로 객체화 시켜 사용.
	acc = new Account(); 
	//new >객체 생성을 명령. 클래스로부터 만들어진 객체 >> =인스턴스. 메모리에 올라가서 사용가능한 실체.
	//new > 객체 생성 > 메모리에 저장 >그 메모리에 저장된 주소값 반환 > 참조변수에 저장 
	
	
	/*
	 #객체 생성 방법 
	 클래스이름 변수명 = new 클래스이름();
	 예)Acount acc = new Acount();
	 acc는 참조변수. 주소가 들어간다는 의미. 
	 
	 비교 )
	int a; 변수선언. 스택에 메모리 할 
	int[] arr = new int[3]; //배열 선언, 메모리 할당
	Scanner sc = new Scanner(System.in); 스캐너 객체 생
	 */
	
	//2. 메서드 사용. "참조변수."
	acc.showBalance(); //멤버변수는 자동으로 디폴트값으로 초기화됨
	
	//두번째 객체(또다른 객체) 생성. 실제 메모리 공간에 할당.  
	Account acc2 = new Account();
	
	//멤버변수 사용 - 값 할당 [속성 ]
	acc2.accId="100-2000-001";
	acc2.name="홍길동";	
	acc2.balance=100000;
	
	//메서드 사용 [객체의 기능 ]
	acc2.withdraw(30000); //3만원 출금
	//.연산자를 이용, 객체의 변수나 메서드에 접
	acc2.showBalance(); 
	
	acc2.deposit(50000); //5만원 입금
	
	System.out.println("현재 잔액: " +acc2.balance); //멤버변수
	
	
}
}
