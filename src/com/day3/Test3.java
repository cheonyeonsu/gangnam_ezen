package com.day3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//평균을 입력받아 학점 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력하세요");
		int avg = sc.nextInt();

		//********학점 저장********* < 뺴먹은 부분. 
		String grade; 

	
		if (avg >= 90 && avg<=100) {
            grade = "A";
        } else if (avg >= 80 && avg<90) {
            grade = "B";
        } else if (avg >= 70 && avg<80) {
            grade = "C";
        } else if (avg >= 50 && avg<70) { 
            grade = "D";				
        }  else if (avg >= 0 && avg<50) {
        	grade = "F";
        }  else{   
           grade = "잘못입력함!";
        }
		
		//중첩if
		/*
		 if문이 중복으로 사용된 것.
		 바깥쪽 if문이 참이 되어야 안쪽 if문을 수행함.

		 if(조건식){
		 	if(조건식){
		 		명령문1
		 	}else{
		 		명령문2
		 	}
		 }
		 *
		 */

	
	
		 System.out.println("평균: "+avg); System.out.println("학점: "+grade);
		 



	}



}
