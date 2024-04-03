package com.day4_0403;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		/*
		 * While문
		 - 반복횟수가 가변적인 처리에 적합
		 
		  while(조건){
		  	반복명령;
		  }
		  > 조건을 만족하는 동안 반복명령을 반복수행함. 
		 
		 * */
		
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
		
		System.out.println("\n=====while문 이용=====");
		int k=0; //초기식
		while(k<3) { //조건식
			System.out.println(k);
			k++; //증감식 
		} //while
		
		Scanner sc = new Scanner("\n\n가나다 하나둘 \n\n라\n\n");
		String str="";
		
		//hasNext : boolean타입. 
		while(sc.hasNext()) {
			str=sc.nextLine();
			System.out.println("출력: " + str);
		}
		
		str=sc.nextLine();
		System.out.println("while문 탈출 후 1 : "+str);
		// str=sc.nextLine(); error
		System.out.println("while문 탈출 후 2 : "+str);
	}
	

}
