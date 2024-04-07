package com.day6_0405;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		//for문 안에서 배열 초기화하기
		int[] arr = new int[4]; //5,10,15,20
		/*
		 * arr[0]=5; 
		 * arr[1]=10;
		 * arr[2]=15; 
		 * arr[3]=20;
		 */

		//규칙이 있다면 for안에서 초기화
		for(int i=0;i<arr.length;i++) {
			//4줄 안쓰고 한번에. 01234니까 1234로 만들어줌.
			arr[i]=5*(i+1); 
		}
		
		//출력
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//사용자로부터 실수 4개 입력받아서 배열에 넣기
		
		
		
		Scanner sc = new Scanner(System.in);
		
		/*
		dArr[0] = sc.nextDouble();
		dArr[1] = sc.nextDouble();
		dArr[2] = sc.nextDouble();
		dArr[3] = sc.nextDouble();
	*/
		
		//초기화
		System.out.println("실수 4개 입력!");
		for(int i=0;i<dArr.length;i++) {
			dArr[i] = sc.nextDouble();
			
		}
		
		//출력 
		for(int i=0;i<dArr.length;i++) {
			System.out.print(dArr[i]+" ");
		}
		
	}

}
