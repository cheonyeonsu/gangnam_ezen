package com.day5;

import java.util.Scanner;

public class MethodTest3_26p {

	//두 수 중 더 큰 수를 구하는 메서드 정의
	public static int fun1(int a, int b) {
		int result = (a>b)? a:b; //삼항연산자로 비교
		return result; 
	}
	
	//두 정수의 나머지를 구하는 메서드 정의
	public static int fun2(int c, int d) {
		int rest = c%d;
		return rest;
	}
	
	public static void main(String[] args) {
		//두 수 중 더 큰 수를 구하는 메서드 호출
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 숫자를 입력하세요.");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		int result = fun1(a,b);
		System.out.println("더 큰 수는"+result);
		System.out.println();
		
		
		//두 정수의 나머지를 구하는 메서드 호출 : 프린트 > if문 > 무한루프니까 while
		while (true) {
			
			System.out.println("두개의 숫자를 입력하세요.");
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			if(c==0||d==0) {
				break;
			}
			int e= fun2(c,d);
			System.out.println("나머지 연산 결과 "+e);
				
		}
		System.out.println("계속하려면 아무 키나 누르세요.");
	}

}
