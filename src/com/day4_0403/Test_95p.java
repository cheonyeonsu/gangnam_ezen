package com.day4_0403;

public class Test_95p {

	public static void main(String[] args) {
		//[1] 트리
		for(int i=1;i<=5;i++) { //1에서부터 증가
			for(int j=0;j<i;j++) { //i만큼 별 반복
				System.out.print("*");
			}
			System.out.println();
		}
		// [2]
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i-1;j--) { //5에서부터 감소
				System.out.print("*");
			}
			System.out.println();
		}
		
		//[3] 1부터 10까지의 합
		System.out.println("1부터 10까지의 합");
		for(int i=1;i<=10;i++) {
			////여기부터 시작하면 도비니다.
		}
	}

}