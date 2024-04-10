package com.day8_0409;

import java.util.Scanner;

class human{
	/* Human 클래스 (부모 클래스) 
	  이름, 나이
	  getter/setter 만들기 */
	
	String name;
	int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	
}

/* Teacher 클래스 (자식 클래스)
 필드 : 과목
 getter/setter 만들기
 메서드 : 하는 일-work()
 가르친다(System.out.println으로 가르친다는 내용을 화면 출력) */

class Teacher extends human{
	String subject;
	
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	
	public void work() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("과목 : "+subject);
		System.out.println("가르치는 일을 합니다. ");
		//System.out.println(subject+"를() 가르칩니다.");
	}
	
}

/*
 Programmer (자식 클래스)
 필드 : 개발경력
 getter/setter 만들기 
 메서드:하는일
 프로그래밍한다. */
class Programmer extends human{
	int career;
	
	public void setCarrer() {
		this.career=career;
	}
	public int getCarrer(int career) {
		return career;
	}
	public void work() {
		System.out.println("프로그래밍을 합니다.");
	}
}

public class Inheritance_51p {
	/*

	 main()에서는
	 (1) 이름, 나이, 과목을 입력 받아
	 Teacher 객체 생성 후 값을 넣어준 후, 화면 출력 (getter/setter 이용) 
	 하는일메서드호출
	 (2) 이름, 나이, 개발경력을 입력 받아 처리 
	 Programmer 객체 생성 후 처리
	  */
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("이름, 나이, 과목을 입력하세요.");
	String name = sc.nextLine();
	int age = sc.nextInt();
	String subject = sc.nextLine();


	Teacher t = new Teacher();
	t.setSubject(subject);
	t.setName(name);
	t.setAge(age);
	
	System.out.println("===========================");
	
	t.work();
	
	
}
}
