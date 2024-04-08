package com.day7_0408;

import java.util.Scanner;

public class ScoreTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		Score obj = new Score(kor, eng, math);
		System.out.println("obj="+obj);

		int sum = obj.findSum();
		float average = obj.findAverage();

		System.out.println("총점=" +sum+ ", 평균=" + average);
		
		Score2 s = new Score2(kor,eng,math);
		s.findSum();
		s.findAverage();
		
		System.out.println("\n 총점="+s.sum+", 평균="+s.average); 
	}
}
