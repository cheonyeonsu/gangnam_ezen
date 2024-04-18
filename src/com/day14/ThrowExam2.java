package com.day14;

import java.util.Scanner;

class MyException extends Exception{
	private final int errorCode=101;
	
	MyException(String msg){
		super(msg);
	}
	
	public int getCode() {
		return errorCode;
	}
}

public class ThrowExam2 {

	public static void method() throws MyException{
		throw new MyException("사용자 정의 예외 발생");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("주민등록번호를 입력하세요.(-포함)");
			String num = sc.nextLine();
			
			if(num.length()!=14) {
				throw new Exception("-을 포함해 다시 입력해주세요");
			}
			System.out.println("주민등록번호 : " + num);
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("\n=========next========");
	}

	//예외 클래스 만들기.
	
}
