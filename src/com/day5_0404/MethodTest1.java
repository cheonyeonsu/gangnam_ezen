package com.day5_0404;
//#3
public class MethodTest1 {
	
	/*
	 # 메서드
	 - 특정 기능을 수행하는 최소 실행 단위
	 - 자주 반복하여 사용하는 내용에 대해 특정 이름으로 정의한 묶음
	 - 필요할 때마다 호출하여 원하는 작업을 시킬 수 있음
	 -
	 * */
	
	//이자를 계산하는 기능의 메서드 
	//메서드 정의
	//접근제한자	  반환형   메서드명       매개변수(입력값)
	public static double calcInterest(int money) {
		double interest = money * 0.03; //이자계산
		return interest; //결과값 반환
	}
	
	/*
	 매개변수(parameter) - 입력값
	 반환형(반환타입, return type) - 결과값의 형태(자료형)
	*/
	
	public static void main(String[] args) {
		//매서드 호출
		double d = MethodTest1.calcInterest(100000); //더블로 반환하니까 더블 붙여
		double d2 = calcInterest(100000); //같은 클래스 내에 있으므로 클래스명(MethodTest1) 생략 가능
		
		System.out.println("이자:"+d);
		System.out.println("이자:"+d2);
		
	}
}
