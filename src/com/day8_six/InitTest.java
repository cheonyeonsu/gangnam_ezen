package com.day8_six;

class AAA {
	//명시적 초기화. 
	static int cv=1; 
	int iv=1; 
	
	//클래스 초기화 블럭
	static{  
		cv=2;
		System.out.println("static 초기화 블럭"); 
	}
	
	//생성자
	AAA(){  
		iv=3;
		System.out.println("생성자!!"); 
	}
}//class 

class InitTest{
	public static void main(String[] args) { 
		System.out.println("AAA.cv="+AAA.cv); 
		AAA obj = new AAA();
		System.out.println("obj.iv="+obj.iv); 
	}
}