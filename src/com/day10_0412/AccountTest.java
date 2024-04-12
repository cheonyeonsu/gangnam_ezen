package com.day10_0412;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      System.out.println("계좌번호, 잔액, 이체한도를 입력하세요");
	      String countNo = sc.nextLine();
	      int balance = sc.nextInt(); 
	      int limit = sc.nextInt();
	      
	      KBAccount kb = new KBAccount(countNo,balance,limit);
	      kb.display();
	      
	      //여러개 받아서 저장, 출력하기
	      
	      //KBAcccount 배열
	      KBAccount[] accList = new KBAccount[3];
	      int account =0;
	      //for문에서 초기화
	      for(int i=0; i<accList.length; i++) {
	    	  System.out.println("계좌번호, 잔액, 이체한도를 입력하세요");
	    	  sc.nextLine();
	    	  countNo = sc.nextLine();
	    	  balance = sc.nextInt();
	    	  limit = sc.nextInt();
	    	  
	    	  accList[i] = new KBAccount(countNo, balance, limit);
	    	  
	      }
	      //전 계좌정보 출력 : 확장 for.
	      for(KBAccount acc : accList) {
	    	  acc.display();
	      }
	      
	}

}
