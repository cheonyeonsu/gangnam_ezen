package com.day2;

public class Test3 {

	public static void main(String[] args) {
		char lowerCase = 'a'; //97
		char upperCase = (char) (lowerCase -32);
		
		System.out.print(lowerCase +" > 대문자로 변환 : ");
		System.out.println(upperCase);
		
		float pi = 3.141592f;
		float f_pi=pi*1000; //3141.592f
		int i_pi = (int)f_pi;
		float f_pi2 = i_pi/1000f;
		System.out.println(f_pi2);
		
		float shortPi = (int)(pi*1000)/1000f;
		System.out.println(shortPi);
		
		
		
	}

}
