package com.day6;

import java.util.Scanner;

public class ArrayArgs {
//배열을 매개변수로 받는 메서드
//국,영,수 점수를 배열로 받아와서 평균 구하는 메서드
	
									//국영수 점수 들어있음. 
	public static double findAvg(int[] score) {
		int sum=0;
		for(int i=0; i<score.length;i++) { //score의 배열의 크기 만큼.
			sum+=score[i];
		}
		
		//평균
		double avg = (double) sum/score.length;
		
		score[0]++; //매개변수의 값 변경
		return avg; //리턴 자료형이 더블이니까 반환타입 더블. 
	}
	
	//두수의 합 구하는 매서드
	public static int add(int a, int b) {
		int c=a+b;
		
		a++; //매개변수 값 변경
		return c;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[3];//여기에 사용자 입력값 넣음 
		Scanner sc = new Scanner(System.in);
		System.out.println("국,영,수 점수 입력!");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//call by reference - 매개변수로 값이 넘어가는 것이 아니라
		// 주소가 넘어감 > 같은 주소를 가지므로, 같은 곳을 가리키게 됨
		double avg=findAvg(arr); //이름부르기
		System.out.println("평균 : " +avg);
		System.out.println("main에서 arr[0] : "+arr[0]);
		// > 매서드에서 매개변수의 값을 변경하면
		//매서드를 호출한 곳(main에서도 변수의 값이 변경됨)
		
		//[2] call by value - 값을 매개변수로 넘김
		int n1=10,n2=30;
		int result = add(n1,n2);
		System.out.println(result);
		System.out.println("main에서 n1= "+n1);
		//매서드에서 매개변수의 값을 변경해도 매서드를 호출한 곳에서는 값이 변경되지 않음. 
		
	}

}
