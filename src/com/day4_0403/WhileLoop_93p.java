package com.day4_0403;

import java.util.Scanner;

public class WhileLoop_93p {

	public static void main(String[] args) {
		
		/*
		//[1]while 이용 - 0~100사이에 존재하는 짝수의 합 구하기
		int num =0; //값을 계산 할 변수 num
		int sum =0; // 짝수의 합 저장할 변수 sum
		
		//0~100 짝수 찾아서 합산
		while (num<=100) { //num이 100을 초과할 때까지 반복
			if(num%2==0) {
				sum+=num; //짝수인경우 sum에 현재 num을 더함
			}
			num++; //다음 숫자로 이동
		}
		
		System.out.println("0~100사이에 존재하는 짝수의 합 : " + sum);
		
		*/
		
		//[2]while 이용 - 사용자로부터 입력받은 숫자에 해당하는 구구단을 역순으로 출력. 
		 Scanner sc = new Scanner(System.in);
	        int num1 = 0;
	        
	        while (num1 <= 9) {
	            for (int i = 1; i < 10; i++) {
	                for (int j = 2; j < 10; j++) {
	                    System.out.println(j + " * " + i + " = " + i * j);
	                  
	                }
	            }
	            num1++;
	        }
	        
	    }
	
	}


