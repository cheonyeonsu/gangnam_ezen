package com.day14;

public class FinallyTest2 {
	public static boolean divider(int n1, int n2) {
		try {
			int result =n1/n2;
			System.out.println("나눗셈 결과" +result);
			return true; // 중간에 return을 하더라도 finally는 실행된다. 
		} catch (ArithmeticException e) {
			System.out.println("예외 발생 : " +  e.getMessage());
			return false;
		}finally {
			System.out.println("finally영역 실행!");
		}
	}
	
	public static void main(String[] args) {
		boolean bool = divider(7,3);
		
		if(bool) {
			System.out.println("연산 성공\n");
		}else {
			System.out.println("연산 실패\n");
		}
		
		if (divider(7,0)) {
			System.out.println("연산 성공\n");
		}else {
			System.out.println("연산 실패\n");
		}
		
	}

}
