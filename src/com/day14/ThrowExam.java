package com.day14;

import java.util.Scanner;

public class ThrowExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("주민등록번호 13자리를 입력하세요.(-제외)");
			String num = sc.nextLine();
			
			if(num.length()!=13) { //13자리가 되지 않으면 잘못입력했습니다. 출력
				throw new Exception("잘못입력했습니다.");
			}
			System.out.println("주민등록번호 : " + num);
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
			
		}
		System.out.println("\n=========next========");
	}

}
