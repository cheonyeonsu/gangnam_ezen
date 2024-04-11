package com.day8_0409;

import java.util.Scanner;

class human{
	/* Human 클래스 (부모 클래스) 
	  이름, 나이
	  getter/setter 만들기 */
	
	//protected 빼먹지말기. 
	protected String name;
	protected int age;
	
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
	private String subject;
	
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	
	public void work() {
		System.out.println("가르치는 일을 합니다. ");
		//여기에서 결과 찍는게 아니었다. 
	}
	
}

/*
 Programmer (자식 클래스)
 필드 : 개발경력
 getter/setter 만들기 
 메서드:하는일
 프로그래밍한다. */
class Programmer extends human{
	private int career;
	
	public void setCarrer(int career) {
		this.career=career;
	}
	public int getCarrer() {
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
	int age = Integer.parseInt(sc.nextLine()); 
	/*
	int age = sc.nextInt(); 
	nextInt매서드 호출 뒤 nextLine 하면 먼저 입력된 정수 값이 있어서 안됨. (개행문자 존재.)
	그래서 Line으로 문자를 소비해주고, 문자 변환. 
	(개행 문자 : 컴퓨터에서 새로운 줄로 넘어가는 것을 나타내는 특수 문자)
	*/
	String subject = sc.nextLine();

	System.out.println("===========================");
	
	Teacher t = new Teacher();
	t.setName(name);
	t.setAge(age);
	t.setSubject(subject); 
	
	//set으로 받아온 값 get으로 보여줌
	System.out.println("이름 : "+t.getName());
	System.out.println("나이 : "+t.getAge());
	System.out.println("과목 : "+t.getSubject());
	t.work();
	
	System.out.println("이름, 나이, 개발경력을 입력하세요.");
	name  = sc.nextLine();
	age = Integer.parseInt(sc.nextLine());
	int career = sc.nextInt();
	
	System.out.println("===========================");
	
	Programmer p = new Programmer();
	p.setName(name);
	p.setAge(age);
	p.setCarrer(career);
	System.out.println("이름 : "+p.getName());
	System.out.println("나이 : "+p.getAge());
	System.out.println("개발경력 : "+p.getCarrer());
	p.work();
	
	
}
}
