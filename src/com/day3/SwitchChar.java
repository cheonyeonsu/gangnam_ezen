package com.day3;

import java.io.IOException;

public class SwitchChar {

	public static void main(String[] args) throws IOException {
		//char 입력받기
		System.out.println("성별 입력!");
		int code=System.in.read(); //char에 해당하는 코드값을 return.> 사용자가 입력한 아스키코드(영어, 숫자)값을 반환해줌
		//앞의 1바이트만 읽는다.
		char ch=(char) code;
		System.out.println("code="+code+", ch"+ch);
		
		//char gender = (char)System.in.read();
		String result="";
		switch (ch) {
		case 'm': 	//char이니까 작은따옴표 묶는거 신경쓰기.	
			result="남";
			break;
		case 'f': 		
			result="여";
			break;
		default:
			result = "잘못입력!";
			
		}
			System.out.println(result);
			
			//public static char toUpperCase(char ch)
			//public static char toLowerCase(char ch)
			char gender= Character.toLowerCase(ch);
			switch (gender) {
			case 'm': 
				result="남";
				break;
			case 'f': 	
				result="여";
				break;
			default:
				result = "잘못입력!";
				
			}
			System.out.println("성별은 "+ result+ "입니다.");
	}

}
