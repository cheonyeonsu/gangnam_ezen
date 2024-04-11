package com.day8_0409;

import java.util.Scanner;

class Person2{	
	protected String name;
	protected int age;

	public void setName(String name)	{
			this.name = name;
	}

	public String getName(){
			return this.name;
	}

	public int getAge()	{
		return this.age;
	}

	public void setAge(int age)	{
			this.age = age;			
	}
}//

class Student2 extends Person2{	
	protected int sNo;
	
	public int getSNo()	{
		return this.sNo;
	}

	public void setSNo(int sNo)	{
		this.sNo = sNo;			
	}

	public void study()	{
		System.out.println("공부한다");
	}
}//

class Graduate extends Student2{	
	private String major;

	public String getMajor()	{
		return this.major;
	}

	public void setMajor(String major)	{
			this.major = major;			
	}

	public void writeThesis()	{
		System.out.println("논문쓴다");
	}
}//

class ExamPerson{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 학번, 전공을 입력하세요");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		int sNo =sc.nextInt();
		sc.nextLine();
		String major = sc.nextLine();

		System.out.println("====================================");

		Graduate s = new Graduate();
		s.setName(name);
		s.setAge(age);
		s.setSNo(sNo);
		s.setMajor(major);

		System.out.println("이름:"+s.getName());
		System.out.println("나이:"+s.getAge());
		System.out.println("학번:"+s.getSNo());
		System.out.println("전공:"+s.getMajor());
		s.writeThesis();
	}
}