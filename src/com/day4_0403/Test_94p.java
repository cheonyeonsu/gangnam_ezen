package com.day4_0403;

public class Test_94p {

	public static void main(String[] args) {
		/*
		  1~99 사이에 있는 정수 중에서 7의 배수이거나 9의 배수인 정수를 출력하는 프로그램 작성
        7의 배수이자 9의 배수인 수는 한번만 출력되면 됨. 가로로 5개씩만 출력하기*/
		int count = 0;
		System.out.println("7의 배수이거나 9의 배수");
		for(int i=1;i<=99;i++) {
			if(i%7==0 || i%9 ==0) {
				System.out.print(i+"\t");
				 count++;
				 if(count%5==0) {
					 System.out.println();
				 }
			}
		}
		System.out.println();
		System.out.println();
	}

}