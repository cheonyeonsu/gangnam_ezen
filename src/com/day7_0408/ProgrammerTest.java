package com.day7_0408;

import java.util.Scanner;

public class ProgrammerTest {
	/* main()에서는  (1) 이름, 개발언어, 개발경력을 입력 받아 Programmer 객체 생성 후 값을 넣어준 후, 화면 출력
	 * (getter/setter 이용) 하는 일 메서드 호출 */
	public static void main(String[] args) {
		
		
		//화면 출력 게터세터말고 매서드 이용.
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String language = sc.nextLine();
		int career= sc.nextInt();
		
		//settr로 변경하고 getter로 출력
		Programmer pg = new Programmer(name,language,career);
		
		pg.info();

	}

}
