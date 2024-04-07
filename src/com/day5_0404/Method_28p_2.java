package com.day5_0404;


public class Method_28p_2 {
	/*
 홀수인지 짝수인지 구하는 메서드 만들기
	 */
	
	public static String  getOdd(int num){
		String result = "";
		if(num%2==0){
			result="짝수";
		}else{
			result="홀수";
		}//if

		return result;
	}
}



