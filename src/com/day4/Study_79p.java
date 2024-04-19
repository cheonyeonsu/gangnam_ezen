package com.day4;

public class Study_79p {

	public static void main(String[] args) {
		/*
		 * for문을 이용하여 알파벳 소문자(a~z) 출력하기 */
		for(int i=97;i<=122;i++) {
			System.out.print((char)(i)+", ");
		}
		System.out.println();
		
		/*중첩 for문 이용, 구구단 가로로 출력 */
		//i랑 j랑 위치 바꾸는 이유 :그냥 하면 세로로. 가로로 출력해야하기때문에.
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.print(" "+j + "*" + i + "=" + i*j);
				
			}
			System.out.println();
		}
	}

}
