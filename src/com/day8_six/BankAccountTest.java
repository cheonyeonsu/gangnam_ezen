package com.day8_six;

public class BankAccountTest {

	private static final int INTEREST = 0;

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(50000);
		ba1.findTotal();
		
		BankAccount ba2 = new BankAccount(100000);
		ba1.findTotal();
		
		BankAccount ba3 = new BankAccount(200000);
		ba1.findTotal();
		

		System.out.println("계좌 1의 원금 : " + ba1.getBalance());
		System.out.println("계좌 2의 원금 : " + ba2.getBalance());
		System.out.println("계좌 3의 원금 : " + ba3.getBalance());
		
		System.out.println("모든 계좌의 이율 : " + (BankAccount.INTEREST)*100 +"%"); //static 변수 - 클래스명.변수
		System.out.println("모든 계좌의 원금의 합계 : " + BankAccount.getTotalBalance() + "원");
		//static 메서드 호출 - 클래스명.메서드();
	}

}
