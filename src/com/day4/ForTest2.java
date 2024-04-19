package com.day4;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		/*
		 1~4까지의 합
		 sum = 0

		 i	sum
		 	0
		 1	0	+1
		 2	0	+1	+2
		 3	0	+1+2	+3
		 4  0	+1+2+3	+4

		 sum=sum+i (기존 sum에 i를 더한다) 
		 > sum+=i

		 */
		int sum =0;
		for(int i=1;i<=4;i++) {
			sum+=i;
			//syso를 for문 안에 넣으면 과정이 다찍히고, 밖에 찍으면 결과만 찍힘
			System.out.println("i="+i+", sum="+sum);
		}
		System.out.println("1~4까지의 합: "+sum); 
	
		//1~10까지 짝수의 합 찍기
		for(int i=0; i<=10; i++) {
			if(i%2==0) {
				sum+=i;
			} 
				
		}System.out.println("1~10까지 짝수의 합: "+sum);
		
		
		//1~n까지의 짝수의 합
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		sum=0;
		for(int i=0;i<=num;i+=2) {
			sum+=i;
		}System.out.println("1~"+num+"까지 짝수의 합: "+sum);
	}
}
	


