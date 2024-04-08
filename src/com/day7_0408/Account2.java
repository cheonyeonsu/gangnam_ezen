package com.day7_0408;

public class Account2 {
		//멤버변수 선언 
			String accId;//계좌번호 
			String name; //이름 
			int balance; //잔액
			
			
		//생성자
		public Account2(String p_accId, String p_name,int p_balance) {
			accId=p_accId;
			name = p_name;
			balance=p_balance;
			
		}
		
		/*
		 *생성자 - 멤버변수의 초기화를 목적으로 정의된 메서
		 * 객체가 생성될 때 자동호출되어 가장 먼저 실행되는 메서드
		 * 클래스 이름과 동일함, 매개변수는 가질 수 있으나 반환값은 가질 수 없음.
		 * */
			
			//매서드 선언 
			public void deposit(int money) {
				balance += money; //입금하다
				//리턴값이 없으니 결과값 바로 선언하면 안됨 .
			}
			
			public void withdraw(int money) {
				balance -= money; //출금하다 
			}
			
			public void showBalance() { //추가된 메서드
			System.out.println("=========계좌정보==========");
			System.out.println("계좌번호 : "+ accId);
			System.out.println("이름  : "+name);
			System.out.println("잔액  : "+balance + "\n");
			
			
			}
			

		}



