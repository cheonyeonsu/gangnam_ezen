package com.day14;

public class ThrowsTest3 {
	public static void method1() throws Exception{
		method2();
	}

	public static void method2(){ //throw를 try/catch문에 넣어버림
		try {
			throw new Exception("고의로 예외 발생시켰음");
		} catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}

	}

	public static void main(String[] args)throws Exception {
		method1();
	}

}
