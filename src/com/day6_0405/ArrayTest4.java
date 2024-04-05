package com.day6_0405;

public class ArrayTest4 {

	public static void main(String[] args) {
		//배열에 저장된 최대값 구하기
		int[] arr = {10,57,19,35,77,26};
		int max = arr[0]; //비교해서 max값 배열에 넣어줌. 
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i]; //max보다 i번째가 크다면 max에 그 값 넣넣 :10<57
			}
		}//for
		System.out.println("최대값 :" + max);
		System.out.println();
		
		//public static long round(double a)
		//반올림하기
		double d =84.867; // > 84.9로 반올림하기
		long a=Math.round(d);
		System.out.println(a);
		
		//848.67로 만들기 > *10
		//round(848.67) > 849
		double g =Math.round(d*10); //848.67 > 849
		
		//84.9 < /10
		g = Math.round(d*10)/10.0; //84.9
		System.out.println(g);
		
		g=(int)(d*10)/10.0;
		System.out.println(g); //84.8
	}

}
