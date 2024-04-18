package com.day14;

	/*
	#예외 클래스의 계층구조
	thowable > exception > RuntimeException
						 > 나머지 예외 클래스
			 > Error
		
	[1] RuntimeException 클래스와 그 자식 클래스들 
	- 예외처리를 해주지 않아도 됨
	
	[2] Exception 클래스와 그 자식 클래스들(RuntimeException이 아닌 클래스들)
	- 반드시 예외처리를 해주어야 함. 그렇지 않으면 컴파일 에러 발생.
	
	#예외를 처리하는 방법
	1) try~catch문 사용
	2) throws를 이용한 예외떠넘기기 (예외 전달, 예외를 메서드에 선언) 
		void method() throws Exception, Exception2, ...{
		}
	  - 메서드 선언부에 throws를 사용해서 메서드 내에서 발생할 수 있는 
	  예외를 적어주기만 하면 됨
	  - 자신을 호출한 메서드에게 예외를 전달하여 예외처리를 떠맡기는 것
	*/

public class ThrowsTest1 {
	public static void method1() throws Exception{
		method2();
	}
	
	public static void method2() throws Exception {
		throw new Exception("고의로 예외 발생시켰음");
	}
	
	public static void main(String[] args)throws Exception {
		method1();
	}

}
