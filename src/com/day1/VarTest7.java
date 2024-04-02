package com.day1;

public class VarTest7 {

	static int x; //static변수(클래스변수)
	int y; // 인스턴스변수(멤버변수)
	
	public static void main(String[] args) {
		int z=0; //지역변수는 반드시 초기화 해야함. 안그러면 에러 남.  
		double d = 0.0;
		boolean b = false;
		String s = null, str="";
		
		int num; //초기화하지 않은 변수
		// System.out.println(num); 
		//error : The local variable num may not have been initialized
		
		System.out.println("static 변수 x= "+ VarTest7.x);
		System.out.println("static 변수 x= "+ x);
		System.out.println("지역변수 z="+z+", d="+d);
		System.out.println("str"+str+", s="+s);
		
		VarTest7 obj = new VarTest7();
		System.out.println("인스턴스변수 y="+obj.y);
		
		//인스턴스 변수나 static변수는 초기화하지 않아도 디폴트 값이 들어감. 
		
	}

}
