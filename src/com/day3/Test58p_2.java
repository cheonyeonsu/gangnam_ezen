package com.day3;

import java.util.Scanner;

public class Test58p_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id = sc.nextLine();

		System.out.println("비밀번호를 입력하세요");
		String pw = sc.nextLine();

		if(id.equals("hong") && pw.equals("1234")) {
			System.out.println("로그인되었습니다.");
		} else {
			System.out.println("아이디나 비밀번호가 틀렸습니다.");
		}
}
	}


