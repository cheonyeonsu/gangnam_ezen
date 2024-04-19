package com.day10;

//main메서드랑 클래스 분리해서 만들기!

class Account{
	protected String countNo; //계좌번호
	protected int balance; //잔액

	//생성자
	Account(String countNo,int balance) {
		this.countNo=countNo;
		this.balance=balance;
	}

	//출력 매소드
	public void display() {
		System.out.println("계좌번호 : "+ countNo);
		System.out.println("잔액 : "+ balance);
	}
}

class KBAccount extends Account{
	protected int limit; //이체한도

	//생성자
	KBAccount(String countNo,int balance,int limit){
		super(countNo,balance); //부모생성자
		this.limit=limit; //내가 추가할 생성자
	}

	//출력 메소드
	public void display() {
		super.display();
		System.out.println("이체한도 : "+ limit);
	}


}


