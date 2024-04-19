package com.day6;
//#2
public class ArrayTest2 {

	public static void main(String[] args) {
		//학생들 점수 처리
		int[] arr = {97,75,70,90,60,85,75,100};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\n=======5점 가산 후 점수=======");
		
		for(int i=0;i<arr.length;i++) {
			//5점 가산
			//arr[]=arr[0]+5; //arr 0번째 배열에 5를 더한다. 더해서 다시 그 자리에 집어넣.
			if(arr[i]<=95) { //95점 미만만 5점 가산
				arr[i]+=5;
			}else {
				arr[i]=100; //95점 이상은 100찍음
			}
			System.out.println(arr[i]);
			
		
		}
		
		int a=90;
		//a변수의 값 5증가
		a+=5;
	}

}
