package com.day3;

public class AssignOp {

	public static void main(String[] args) {
		/*
		 	대입연산자
		 	=	오른쪽의 값을 왼쪽 변수에 할당
		 	+=	덧셈연산 후 대입
		 	-=	
		 	*=
		 	/=
		 	%=
		 */
		
		int a=7, b=3;
		System.out.println("a="+a+", b="+b);
		
		a+=b; //a=a+b
		System.out.println("a+=b 연산 후 a:"+a);
		
		a/=b; //a=a/b
		System.out.println("a/=b 연산 후 a:"+a);
		
		a*=2; //a=a*2
		System.out.println("a*=b 연산 후 a:"+a);
		

	}

}
