package com.day7_0408;

import java.util.Scanner;

public class Constructor_51p {
	/*
	 * 1. 명함정보를 지닐 수 있는 클래스 정의 
	NameCard Class
 멤버변수(필드) : 이름, 전화번호, 주소, 직급
 생성자- 멤버변수(필드) 초기화
 메서드 : 필드내용을 화면에 출력하는 메서드

 메인 클래스의 main()메서드에서
 사용자에게 입력 받고
 NameCard Class의 화면 출력 메서드 호출하여 화면에 출력하기
	 */
	//생성자 초기화
	//NameCard nameCard = new NameCard(name,phone,address,rank);


	//호출은 main에서. 메인 있는 곳에서 Test하는거라서 이름에 테스트 붙음. 
	public static void main(String[] args) {
		
		
		//[2]사용자에게 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();

		System.out.println("전화번호를 입력하세요");
		String phone = sc.nextLine();

		System.out.println("주소를 입력하세요");
		String address = sc.nextLine();

		System.out.println("직급을 입력하세요");
		String rank = sc.nextLine();

		/*이렇게 해도 됨!더 간단함.
		System.out.println("이름,전화번호,주소,직급을 입력하세요");
		String name = sc.nextLine();
		String phone = sc.nextLine();
		String address = sc.nextLine();
		String rank = sc.nextLine();
		
		*/
		
		//[1]객체 생성, 괄호 안에 자료형 쓸 필요없음 < 왜그런지 알기.
		//매개변수???
		NameCard nc = new NameCard(name,phone,address,rank); 
		
		//[3]매서드 호출
		nc.info();

	}
	
}
