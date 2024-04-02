package com.day3;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요.(M/F)");
		String gender = sc.nextLine();

		String result="";
		/*디폴트
		switch(gender){
		case "M" :
			result="남";
			break;
		case "F" :
			result="여";
			break;
		default:
			result="잘못입력함!";
		}
		 */
		
		/*중복처리
		switch(gender){
		case "M" :
		case "m" :
			result="남";
			break;
		case "F" :
		case "f" :
			result="여";
			break;
		default:
			result="잘못입력함!";
		}
		*/
		
		//메서드 이용한 중복처리. 
		switch(gender.toUpperCase()){
		case "M" :
			result="남";
			break;
		case "F" :
			result="여";
			break;
		default:
			result="잘못입력함!";
		}
		
		
		
		
		System.out.println(result);
		
		

	}

}
