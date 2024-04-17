package com.day13.exception;

import java.util.Scanner;

public class TryTest3 {
	//두 수의 나머지를 구하는 메서드 만들기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("두 수를 입력하세요.");
			for(int i=0;i<2;i++) {
				int n1= sc.nextInt();
				int n2= sc.nextInt();
				int result=n1%n2;	
				System.out.println("나머지 : "+ result);
				
			}
			
		} catch (Exception e) {
			System.out.println("예외 : "+e);
		}

	}

}
