package com.day9_0411;

import java.util.Scanner;

//국영수 총점, 평균 구하기
public class ScoreTest {
	public static void main(String[] args) {
		int[] arr = new int[3]; //배열생성
	
		
		//사용자에게 입력받고, for문, for문 안에서 초기화.
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		Score s = new Score(arr);
		int sum =s.findSum();
		double avg = s.findAverage();
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
	}
}
