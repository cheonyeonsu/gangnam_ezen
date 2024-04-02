package com.day2;

public class ConversionTest2 {

	public static void main(String[] args) {
		char ch1='A';
		char ch2='Z';
		
		int num1=ch1; // char>int로 자동 형변환 >바로 담기<
		int num2=(int)ch2; //명확하게 하기 위해서 명시적 형변환 하기도 함
		
		System.out.println("A의 유니코드 값: "+num1);
		System.out.println("Z의 유니코드 값: "+num2);
		System.out.println("Z의 유니코드 : "+(int)ch2); //직접 찍어도 ok
		
		int a=97;
		//char b=a; //error
		char b = (char)a;
		
		int c=122;
		char d=(char)c;
		
		System.out.println("유니코드 " + a + "에 해당하는 문자: "+b);
		System.out.println("유니코드 " + c + "에 해당하는 문자: "+d);
		
		int n=ch1+1; //char+int > int+int > int
		char ch3=(char)(ch1+2); //***괄호 필*** 
		System.out.println("n="+n+", ch3= "+ch3);
		
	}

}
