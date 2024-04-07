package com.study;

public class ArrayApp {

	public static void main(String[] args) {
		// data 타입이 String인 users라는 변수 만듦 >> String users = "연수,승철";
		//문자열로 이루어져있는 배열 데이터 타입을 값으로 하는 users라는 변수 만듦.
		String[] users = new String [3]; //배열 생성. 
		users[0] = "연수 " ; //0번째 자리
		users[1] = "승철";
		
	System.out.println(users[1]);
	System.out.println(users.length); //3개의 값이 담겨있다. 
	
	int[] scors = {10,20};
		
	}

}
