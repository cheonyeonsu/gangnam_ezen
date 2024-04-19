package com.day6;

public class ArrayTest_45p {

	public static void main(String[] args) {
//	[1]	봄,여름,가을,겨울을요소로갖는배열선언하기
//		 배열 선언 후 값을 초기화하고, for문을 이용하여 화면 출력하기  배열선언과 초기화를 따로 할 것
		
	String[] season = new String[4];
	
	season[0] = "봄";
	season[1] = "여름";
	season[2] = "가을";
	season[3] = "겨울";
		
	for(String s : season) {
		System.out.println(s);
	}

	//[2]
	//3행 2열의 double 타입 2차원 배열을 선언하고, 값을 초 기화한 후, 중첩 for문을 이용하여 화면 출력하기
	double[][] arr = new double[3][2];
	
	arr[0][0] = 10.1;
	arr[0][1] = 10.2;
	arr[1][0] = 10.3;
	arr[1][1] = 10.4;
	arr[2][0] = 10.5;
	arr[2][1] = 10.6;
	
	
	for(int i=0; i<=2; i++) {
		for(int j=0; j<=1; j++) {
			System.out.println(arr[i][j]);
			//System.out.println(arr[]);
		}
	}
	

	//[3] 2차원 배열을 1차원으로 바꾸기. 
	double arr1[] = new double[arr.length*arr[0].length];
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			//2차원 배열의 원소를 1차원 배열의 원소로 이동.
			arr1[( i * arr[i].length ) + j ] = arr[i][j];
		}
	}
	for(double num : arr1) {
		
		System.out.println(num);
	}

	}
}
