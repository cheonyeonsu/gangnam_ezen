package com.day6_0405;

public class ArrayExam {

	public static void main(String[] args) {
		//1 
		/*
		 * 1. 요소  3개를  갖는  float타입의  배열을  선언하고, 
		   12.5, -24.3, 0.76의  값을  넣고, 화면에  출력하기
         배열선언, 메모리할당, 초기화를  모두  따로
		 */
		float[] arr1; //배열 선언
		arr1 = new float[3]; //메모리 할당
		arr1[0]=12.5f; //초기화, f붙여야함
		arr1[1]=24.3f;
		arr1[2]=0.76f;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		
		//2
		/*
		요소  4개를  갖는  double 배열을  선언하여 임의의  값을  넣고
       이  배열  요소들의  총점과  평균을  계산하여  출력하기
       배열선언, 메모리할당, 초기화를  모두  동시에
		*/
		double [] arr2 = {2.7, 3.5, 4.2, 3.7};
		double sum =0;
		
		
		for(int i=0; i<arr2.length; i++) {
			sum+= arr2[i];
		}
		double avg= sum/arr2.length;
		
		
		System.out.println("총점: "+sum+", 평균: "+avg);
		System.out.println();
		
		
		//3
		/*
		 2명의  친구  이름을  배열에  넣고, 출력
       배열선언, 메모리  할당은  동시에  하고, 초기화할  것
		 */
		String[] arr3 =  new String[2];
		
		arr3[0]="연수";
		arr3[1]="수연";
				
		for(int i=0; i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
	}

}
