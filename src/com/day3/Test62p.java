package com.day3;

import java.util.Scanner;

public class Test62p {

	public static void main(String[] args) {
		/*
		 국어, 영어, 수학 점수를 입력 받아서, 평균을 구한 후, "합격", "불합격" 출력하기
 		 평균이 70 이상이고, 모든 과목이 50 이상이어야 합격
 		 불합격의 경우는 과락과 불합격으로 구분
		 과락 : 평균이 70 이상이더라도, 한 과목이라도 50미만이면 과락
		 불합격 : 나머지는 불합격
       평균으로 학점 구하기 – switch 문 이용 > 90 이상이면 "A", 80 이상이면 "B", …
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요.");
		int korean = sc.nextInt(); 
		int math = sc.nextInt(); 
		int english = sc.nextInt(); 
		
		double avg = (korean+math+english)/3; //소수점이므로.자료형신경쓰기
		
		
		String grade=null;
		
		switch((int)avg/10) {
		case  10 :
			grade="A";
			break;
		case 9 :
			grade="A";
			break;
		case 8 :
			grade="B";
			break;
		case 7 :
			grade="C";
			break;
		case 6 :
			grade="D";
			break;
		default:
			grade="F";
		}
		
		System.out.print("평균: "+avg);
		System.out.println(", 학점: "+grade);
	
		

		if(avg>=70 && korean>=50 && math>=50 && english>=50) {
			System.out.println("합격 여부 :합격");
		} else if(avg>=70 && korean<50 || math<50 || english<50 ) {
			System.out.println("합격 여부 :과락");
		}else {
			System.out.println("합격 여부 :불합격");
		} 
		

		
	}

}
