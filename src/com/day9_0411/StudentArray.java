package com.day9_0411;
//#5 + Student
import java.util.Scanner;

public class StudentArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 학번을 입력하세요");
		String name = sc.nextLine();
		int idNo = sc.nextInt();
		System.out.println("================");
		
		Student s = new Student(name, idNo);
		s.setName(name);
		s.setIdNo(idNo);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("학번 : " + s.getIdNo());
		System.out.println("================");

		Student[] studentList = new Student[3];
		studentList[0] = new Student("연우",20140354);
		studentList[1] = new Student("수연",20140355);
		studentList[2] = new Student("수진",20140356);
		
		for(int i=0;i<studentList.length;i++) {
			studentList[i].display();
			System.out.println("================");
		}
	}

}
