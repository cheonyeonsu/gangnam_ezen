package com.day3;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		
		//3. 날짜 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜(일)를 입력하세요<1~31>");
		int date=sc.nextInt();
		
		String date2; //날짜 저장
		
		if (date<=10) {
			date2 = "초순";
        } else if (date >= 11 && date<=20) {
        	date2 = "중순";
        } else if (date >= 21 && date<=31) {
        	date2 = "하순";
        }  else{   
        	date2 = "잘못입력함!";
        }
		
		System.out.println(date2);
		
	}

}
