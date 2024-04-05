package com.day5_0404;

public class Method_28p_1 {
/*
 1. 윤년인지 평년인지 구하는 메서드 만들기
 main()에서 년도를 매개변수로 넘겨주고, 메서드 호출하여 윤년인지 평년인지 구한 후, 화면 출력
 윤년 1) 400으로 나누어 떨어지면 윤년
 또는 2) 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년
 	*/
	public static String getLeapYear(int year){
		
		String result="";
		if (year%400==0 || (year%4==0 && year%100!=0)){
			result="윤년";
		}else{
			result="평년";
		}

		return result;
	} 
	
	public static void main(String[] args) {
		

	}

}
