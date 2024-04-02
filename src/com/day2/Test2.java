package com.day2;

public class Test2 {

	public static void main(String[] args) {
		//연산
		byte a = 20;
		short b = 10;
		int c = a-b; //int보다 작은 애들은 무조건 int형으로 형변환
		System.out.println("a-b= "+c);
		
		int d = 2;
		long f = 15;
		long g = (d*f);
		System.out.println("d*f= "+g);
		
		//할당
		long i = 30; 
		double j = (double)i;
		
		//명시적 형변환
		float k = 40;
		long l = (long)k;
		
		char m = 'a';
		int n = (int)m;
		
	}

}
