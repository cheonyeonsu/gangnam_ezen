package com.day9_0411;

import java.util.Scanner;

public class StudentArray2 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stList = new Student[100];
		int idx=0;

		while(true) {
			System.out.println("1.저장\n2.전체학생 조회\n3.종료 선택\n");
			int type=sc.nextInt();

			switch (type) {
			case 1:
				System.out.println("이름, 학번을 입력하세요");
				String name = sc.nextLine();
				int idNo = sc.nextInt();

				stList[idx++]=new Student(name, idNo);	
				break;
			case 2:
				System.out.println("\n=====학생 리스트=======");
				for(int i=0;i<idx;i++) {
					stList[i].display();
				}
				break;
			case 3:
				System.out.println("종료합니다.");
				System.exit(0);
			default:
				System.out.println("다시 입력");
				continue;
			}
		}//while

	}//main



}
