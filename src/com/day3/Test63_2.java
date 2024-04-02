package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test63_2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 2. 임의의 값을 입력 받아서, 입력한 값이 0~9사이의 값이면 "숫자입니다", 입력한 값이 A~Z, a~z이면 "알파벳 문자입니다" 그외
		 * 문자이면 "기타 문자입니다"를 출력하기  System.in.read() 이용
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		char number = (char)System.in.read();
		
/*		0~9 : 48~57
		A~Z : 65~90
		a~z : 97~122*/ 
		
		if(number>=48 && number<=57) {
			System.out.println("숫자입니다.");
		}else if(number>=65 && number<=90) {
			System.out.println("알파벳 문자입니다.");
		}else if(number>=97 && number<=122) {
			System.out.println("알파벳 문자입니다.");
		}else {
			System.out.println("기타 문자입니다");
		}
		
	}

}
