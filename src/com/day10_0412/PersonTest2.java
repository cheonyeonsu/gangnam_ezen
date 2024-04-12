package com.day10_0412;

import java.util.Scanner;

class Person2{
	protected String name;
	protected int age;

	Person2(String name,int age){
		//super(); object 생성자 실행.  
		this.name= name;
		this.age= age;
	}

	public void showInfo() {
		System.out.println("\n이름 : "+ name);
		System.out.println("나이 : "+ age);
	}

}

class Student2 extends Person2{
	protected String stNo;

	Student2(String name,int age,String stNo){
		super(name, age); //부모 생성자 셋팅 
		this.stNo=stNo; //내 생성자 셋팅
	}

	public void showInfo() { //오버라이딩 메서드
		super.showInfo();// 부모메서드 showInfo 호출 : 이름, 나이 불러옴
		System.out.println("학번 : " + stNo); //내꺼 추가 > 이름,나이,학번 출력
		
	}

	public void study() {
		System.out.println("공부합니다. ");
	}
	
}

	class Graduate extends Student2{
		private String major;
		
		Graduate(String name,int age,String stNo,String major){
			super(name,age,stNo);
			this.major=major;
		}
		
		public void showInfo() { //오버라이딩 메서드
			super.showInfo(); //코드 재사용 > 코딩의 양 줄어듦
			System.out.println("전공 : " +  major+"\n");
		}
		
		public void writeThesis() {
			System.out.println("논물을 씁니다. ");
		}
	}

public class PersonTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 학번, 전공 입력!");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String stNo = sc.nextLine();
		String major = sc.nextLine();

		Student2 st = new Student2(name,age,stNo); 
		st.showInfo();
		st.study();
	
		Graduate gr = new Graduate(name,age,stNo,major);
		gr.showInfo();
		gr.writeThesis();
	}
}
