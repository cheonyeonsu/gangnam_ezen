package com.day16;

import java.text.DecimalFormat;

public class FormatTest {

	public static void main(String[] args) {
		double num = 1234567.89512;
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		String str = df.format(num);
		//STring fotmat(double number) : 숫자 => 형식화된 문자열로. 
		
		System.out.println(str);
		
		DecimalFormat df2 = new DecimalFormat("#,###.00");
		str = df2.format(num);
		System.out.println(str);
		
		//제일 많이 쓰는 형식
		DecimalFormat df3 = new DecimalFormat("#,###");
		str = df3.format(num);
		System.out.println(str);
	}

}
