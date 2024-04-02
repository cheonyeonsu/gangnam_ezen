package com.day2.op;

public class LogicalOp {

	public static void main(String[] args) {
		/*
		논리연산자
		&& : and 연산자 > 동시에 만족해야 true, 피연산자가 모두 true일 때만 true
			
		|| : or 연산자 > 피연산자중 하나라도 true이면 true
		*/
		
		int x=10, y=-20;
		boolean a= x>0; //true
		boolean b= y>0; //true
		System.out.println("a="+a+", b="+b);
		System.out.println("a && b : "+(a&&b));
		System.out.println("a || b : "+(x>0||y>0));
		System.out.println("!a: "+(!(x>0)));
		
		
		
		 int p=0, q=1;
		 if( (p++==0) | (q++==2 ) )  
		 	//	> p의 현재 값 사용한 후 p를 1 증가시킴. 그래서 0
		 	//	> q의 현재값 사용한 후 q를 1 증가시키는데 1쓰고 1증가니까 1.
		 	//	참|거짓 > 둘중 하나만 참이어도 참
		 p=42;
		 System.out.println("p="+p+", q="+q); 
		 p=0; q=1;
		 if( (p++==0) || (q++==2 ) )
		 	// 참 || 거짓 > 첫번째가 참이면 참. 
		 
		 p=42;
		 System.out.println("p="+p+", q="+q); 
		
	}

}
