package com.day3;

import java.util.Scanner;

public class Test60p {

	public static void main(String[] args) {
		//60p
		
		/* 산술연산자 중 하나를 선택하게 하고, 실수 두 개를 입력 받아서
		 +을 선택했으면 두 수 더하기
		 -을 선택했으면 두 수 빼기
		 *을 선택했으면 두 수 곱하기
 		 /을 선택했으면 두 수 나누기
  	 %을 선택했으면 두 수의 나머지를 구하여 결과값 출력하기
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("산술연산자를 입력하세요.<+,-,*,/,%>");
		String calcul = sc.nextLine();
		
		System.out.println("실수를 두 개 입력하세요.");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();

		double result=0; //자꾸 빼먹는 부분. 신경쓰기. 
		
		switch(calcul){
		case "+" :
			result=num1+num2;
			break;
		case "-" :
			result=num1-num2;
			break;
		case "*" :
			result=num1*num2;
			break;
		case "/" :
			result=num1/num2;
		case "%" :
			result=num1%num2;
			break;
		default:
			System.out.println("올바른 산술 연산자를 입력하세요.");
		}
		System.out.println("결과값: "+ result);
		sc.close();
		
		
		
	}}
