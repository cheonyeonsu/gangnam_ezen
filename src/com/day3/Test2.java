package com.day3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//1.사용자로부터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요 (M/F)");
		String gender=sc.nextLine();
		
		//2.로직처리
		
		
		String result=""; //결과값을 담을 변수
		if(gender.equals("M")){
			result="남자";
	  	 }else if(gender.equals("F")){
	  		result="여자";
	  	 }else{
	  		result="잘못 입력했어요!";
	  	 }
		
		
		//equalsIgnoreCase > 대소문자 구분 안함.
		//String result="";
		if(gender.equalsIgnoreCase("M")){
			result="남자";
	  	 }else if(gender.equalsIgnoreCase("F")){
	  		result="여자";
	  	 }else{
	  		result="잘못 입력했어요!";
	  	 }
	  	 
	  	 //= toUperCase 매서드로도 가능
	  	/*
		String Gernder=gender.toUpperCase();

		if(ugender.equals ("M")){
			result="남자";
	  	 }else if(ugender.equals ("F")){
	  		result="여자";
	  	 }else{
	  		result="잘못 입력했어요!";
	  	 }
	  	 
	  	 */
		/*
		//조건식 이용, 둘 중 하나만 참이어도 참. 대소문자 구분 X
		String result = "";
		if (gender.equals("M") || gender.equals("m")) {
		    result = "남자";
		} else if (gender.equals("F") || gender.equals("f")) {
		    result = "여자";
		} else {
		    result = "잘못 입력했어요!";
		}
		
		/*
		 public boolean equals(Object anObject)
		 기본자료형에서 등가연산자(==)는 값을 비교
		 참조형에서 등가연산자는 주소를 비교.
		 문자열의 값을 비교하려면 String클래스의 equals()매서드를 이용. 
		 Object에는 모든 참조형을 담을 수 있다. 
		 */
		
		
		//결과 출력
		System.out.println(result);
		

	}

}
