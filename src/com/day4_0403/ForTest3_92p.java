package com.day4_0403;

import java.util.Scanner;

public class ForTest3_92p {

	public static void main(String[] args) {
		//실습[1] 사용자로부터 하나의 숫자를 입력받아 그 수만큼 3의 배수를 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("3의 배수의 갯수를 입력하세요.");
		int n = sc.nextInt();


		for(int i=1; i<=n ;i++) {
			//현재 순서의 3의 배수를 계산하여 출력
			System.out.print(3*i+"\t");
		}//for
		System.out.println();

		//실습[2] 계승을 계산하는 프로그램. 
		//n입력받아 n!을 계산해서 출력해준다. 
		int k=0;
		for(int i=0; i<n; i++){
			k+=3;
			System.out.print(k + "\t");
		}//for
		System.out.println();

		for(int i=3; i<=n*3; i+=3){
			System.out.print(i+ "\t");
		}//for

		System.out.println("\n\nn의 계승 구하기 : n을 입력하세요");
		n = sc.nextInt();

		//sum+=i

		int result=1;
		for(int i=1; i<=n; i++){
			result *= i;
		}
		System.out.println("1~" + n + "까지의 곱(계승, factorial):" + result);
	}


}


