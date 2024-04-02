package com.day2.op;

public class IncrementOp2 {

	public static void main(String[] args) {
		//수식에 포함되는 경우
		int i=5;
		int k=0;
		k=i++; //k=i
		System.out.println("후증가 i="+i+", k="+k);
		
		i=5;
		k=0;
		k=++i; 
		System.out.println("선증가 i="+i+", k="+k);
		
		
		/*
		 * int a=3, b=3; System.out.println("\na="+a+", b="+b);
		 * System.out.println("선증가 a="+a+ ++a); //4 
		 * System.out.println("후증가 b="+b+ b++); //3 
		 * System.out.println("최종 a="+a+", b"+b);
		 */
		
		int a = 0;
		System.out.println("a : " + a);
		System.out.println("a++ : " + a++); //a가 사용되고 난 후에 1 증가
		System.out.println("++a : " + ++a); //a가 1 증가된 값을 사용 > 2
		double b = 7;
		System.out.println("b : " + b);
		System.out.println("b-- : " + b--); //7일단 출력하고 6됨
		System.out.println("--b : " + --b); //6-1=5
		char c = 'A';
		System.out.println("c : " + c); //char이니까 A.
		System.out.println("++c : " + ++c); //1증가니까 B, c=(char)(c+1)
		c = 'a';
		System.out.println("c : " + c); //a
		c++; //1 증가니까 출력이면 b.
		System.out.println("c++ : " + c); //b

	}

}
