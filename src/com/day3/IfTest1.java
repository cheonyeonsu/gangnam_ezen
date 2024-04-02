package com.day3;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		/*
		 제어문 - 프로그래밍의 실행순서나 흐름을 제어

		  1. 조건문 : if,switch
		  2. 반복문 : for,while,do~while

		  1)if문
		  	if(조건식){
		  		문장
		  	} 

		  	> 조건식을 만족하면 문장을 실행하고 만족하지 않으면 수행 X

		  	 if(조건식){
		  	 	문장1
		  	 }else{
		  	 	문장2
		  	 }

		  	 > 조건식을 만족하면 문장1을 수행하고 만족하지 않으면 문장 2를 수행

		  	 if(조건1){
		  	 	문장1
		  	 }else if(조건2){
		  	 	문장2
		  	 }else{
		  	 	문장3
		  	 }

		  	 >	조건1이 참이면 문장1을 수행, 거짓이면 조건2가 참인지 거짓인지 검사해서
		  	 	참이면 문장2를 수행, 거짓이면 문장 3을 수행. 


		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();

		//[1]If
		if(num>0){
			System.out.println("양수");
		} 
		System.out.println("단독 if문 수행");

		//[2]If~else if
		if(num>0){
			System.out.println("양수");
		}else{
			System.out.println("음수");
		}

		//[3]if~else if~else
		if(num>0){
			System.out.println("양수");
		}else if(num<0){
			System.out.println("음수");
		}else{ //else에는 조건 붙으면 안됨. 
			System.out.println("0 입니다.");
		}
		
		System.out.println("if~else if~else 수행\n");
		
		// syso중복 제거
		String result=""; //맨처음에 초기화 해야 사용할 수 있음.{}빠져나가면 죽으니까.
		if(num>0){
			result= "양수";
		}else if(num<0){
			result="음수";
		}else{  
			result="0 입니다.";
		}
		
		System.out.println(result);

	}
}
