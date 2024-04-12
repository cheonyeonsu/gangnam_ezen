package com.day10_0412;

import java.util.Scanner;

class Person{
	protected String name;
	protected int age;

	Person(String name,int age){
		//super(); object 생성자 실행.  
		this.name= name;
		this.age= age;
	}

	public void showInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
	}

}

class Student extends Person{
	private String major;

	Student(String name,int age,String major){
		super(name, age); //부모 생성자 셋팅 
		this.major=major; //내 생성자 셋팅
	}

	public void showInfo() { //오버라이딩 메서드
		super.showInfo();// 부모메서드 showInfo 호출 : 이름, 나이 불러옴
		System.out.println("전공 : " + major + "\n"); //내꺼 추가 > 이름,나이,전공 출력
		
	}

}

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 전공 입력!");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String major = sc.nextLine();
		System.out.println("=====================");
		Student st = new Student(name,age,major);
		st.showInfo();
	}
}
