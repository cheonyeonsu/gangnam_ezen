package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test63_3 {

	public static void main(String[] args) throws IOException {
		/*
		 * 3. java.lang.Character 클래스의 메소드를 이용하여 숫자인지, 알 파벳인지, 기타문자인지 확인하여 출력하기  
		 * API문서에서 숫자인지 여부를 확인하는 메서드, 알파벳인지 여부를 확인하는 메서드 2개 찾아서 이용 (is로 시작하는 메서드)
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		char number = (char)System.in.read();
		
/*		0~9 : 48~57
		A~Z : 65~90
		a~z : 97~122*/ 
		
		if(Character.isDigit(number)) {
			System.out.println("숫자입니다.");
		}else if(Character.isAlphabetic(number)) {
			System.out.println("알파벳 문자입니다.");
		}else {
			System.out.println("기타 문자입니다");
		}
	}

}
