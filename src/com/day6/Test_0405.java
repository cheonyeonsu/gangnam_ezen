package com.day6;

import java.util.Scanner;

public class Test_0405 {
	public static void main(String[] args) {

		/*
		 * 월을 입력 받아 해당하는 사분기를 리턴하는 메서드를 만들고,
		main() 에서 호출하고, 결과를 출력하시오.
		1 ~ 3월 : 1사분기, 4 ~ 6월 : 2사분기, 
		7 ~ 9월 : 3사분기, 10 ~ 12월 : 4사분기
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		
		String month2; //날짜 저장

		if(month<=3) {
			month2 = "1사분기";
		}else if(month<=4 && month<=6) {
			month2 = "2사분기";
		}else if(month<=7 && month<=9) {
			month2 = "3사분기";
		}else if(month<=10 && month<=12) {
			month2 = "4사분기";
		}else {
			month2 = "올바른 숫자를 입력해주세요.";
		}
		System.out.println(month+"월은 "+month2+" 입니다.");
		

		
	}
	}
