package com.day3;

import java.util.Scanner;

public class Test58p_1 {

	public static void main(String[] args) {
		/*
		 [if 문 이용]
 		1. 정수를 입력 받아서 0보다 크면 "양수입니다." 나머지는 "0 입니다." 출력하기

		*/
		
		//1
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		String result="";
		
		if(num>0){
			result= "양수";
		}else if(num<0){
			result="음수";
		}else{  
			result="0";
		}
		
		System.out.println(result+"입니다.");
	}
	
		

	
}
