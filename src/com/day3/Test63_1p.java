package com.day3;

import java.util.Scanner;

public class Test63_1p {

	public static void main(String[] args) {
		
		/*
		 * 1. 정수를 입력 받아서, 짝수인지 홀수인지 화면에 출력하기
		 if~else문을 삼항 연산자로 바꿔 작성하기
	
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt(); 
		String result=(num%2==0)?"짝수":"홀수";
		System.out.println(result);
		
	

	}

}
