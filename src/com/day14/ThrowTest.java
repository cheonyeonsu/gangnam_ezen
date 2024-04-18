package com.day14;

import java.util.Scanner;

/*
사용자 정의 예외 클래스 만들기
- 새로운 예외클래스를 정의하여 사용할 수 있다.

class 예외클래스이름 extends Exception{
	생성자(String msg){
		super(msg); > 부모인 Exception 클래스의 생성자 호출
	}
}
*/

//Exception(String msg)
//String값을 받아서 메시지로 저장 > getMessage()로 메시지를 얻어옴

//예외 상황에 맞는 예외 클래스 생성
class AgeInputException extends Exception{
	AgeInputException(String msg){
		super(msg);
	}
}

public class ThrowTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("나이 입력!");
		int age = sc.nextInt();
		if(age<0) {
			throw new AgeInputException("유효하지 않은 숫자입니다. "); //내가 만든 Exception을 삽입. 
		}
		
		System.out.println("나이 : " + age);
		} catch (AgeInputException e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		System.out.println("\n============next============");
	}
	
}
