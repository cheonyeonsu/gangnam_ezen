package com.day8;

import java.util.Scanner;

class Person{
	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}//class

class Student extends Person{
	private String major; //전공
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	
	
}//class

public class Inheritance2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 전공 입력!");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine(); // 개행 문자 소비. nextInt() 메서드는 정수를 읽고 개행 문자를 제거하지 않기때문에.
		String major = sc.nextLine();
		
		
		Student st = new Student();
		st.setName(name);
		st.setAge(age);
		st.setMajor(major);
		
		

	}

}
