package com.day3;

import java.util.Scanner;

public class Test59p {
	public static void main(String[] args) {
		/* switch문 이용
		 직업을 입력 받아서
		 A 이면 "회사원이시군요"
 		 B 이면 "학생이시군요"
       C 이면 "주부이시군요"
       D 이면 "기타를 선택했어요"
 		 나머지 "잘못 입력했어요" 출력하기
		  */
		Scanner sc = new Scanner(System.in);
		System.out.println("직업을 입력하세요");
		String job = sc.nextLine();
		
		String result="";
		switch(job) {
		case "A" :
			result = "회사원이시군요";
			break;
		case "B" :
			result="학생이시군요";
			break;
		case "C" :
			result="주부이시군요";
			break;
		case "D" :
			result="기타를 선택했어요";
			break;
		default:
			result="잘못 입력했어요";
		}
		System.out.println(result);
		}
	}

