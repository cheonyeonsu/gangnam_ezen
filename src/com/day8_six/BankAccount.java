package com.day8_six;

public class BankAccount {

	//1.멤버변수
	private int balance; //원금, 잔액
	public static final double INTEREST=0.03; //이자율
	private static int totalBalance; //각 계좌의 원금의 합계
	
	//2.생성자
	public BankAccount(int balance) {
		this.balance=balance;
	}
	
	//3.getter/setter
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public static int getTotalBalance(){
		return totalBalance;
	}	
	public static void setTotalBalance(int totalBalance){
		BankAccount.totalBalance=totalBalance;
	}	
	
	//4. 메서드
	public void findTotal() {
		totalBalance += balance;
	}
	
}
