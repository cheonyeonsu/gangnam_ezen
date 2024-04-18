package com.day14;

import java.util.Scanner;

public class UserExceptionTest2 {
	
	public static int readAge() throws AgeInputException {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age=sc.nextInt();
		if(age<0) {
			throw new AgeInputException("유효하지 않은 나이임!"); //(1)예외 발생
		}
		
		return age;
	}
	
	public static void main(String[] args) {
		try {
			int age = readAge(); //(2)예외 던짐
			System.out.println("나이 : " + age);
		} catch (AgeInputException e) {
			System.out.println("예외 발생 : " + e.getMessage()); //(3)예외 넘어감
		}
	}

}
