package com.day3;

import java.util.Scanner;

public class Test29p {

	public static void main(String[] args) {
	
		//1.음수인지 양수인지 (A<0)
		int a=-25;
		String result1=(a<0)?"음수":"양수";
		System.out.println("num="+a+" > "+result1);
		
		//2.홀수인지 짝수인지 "2로 나눠서 1이 되면 홀수."
		int b=17;
		String result2=(b%2==1)?"짝수":"홀수";
		System.out.println("num="+b+" > "+result2);
		
		//3.키보드 입력으로 홀수인지 짝수인지
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int c = sc.nextInt();
		String result3=(c%2==1)?"짝수":"홀수";
		System.out.println("num="+c+" > "+result3);
	
		
	}

}
