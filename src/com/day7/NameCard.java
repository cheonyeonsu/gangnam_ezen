package com.day7;

public class NameCard {
	
	//멤버변수 선언. 입력값 넣어줌. 
	String name;
	String phone;
	String address;
	String rank;

	//생성자 : 이름 신경쓰지말고, 객체 생성할 때는 온전한 이름. 초기화
	public NameCard(String n,String p,String a,String r) {
		name = n;
		phone = p;
		address = a;
		rank = r;
	}
	
	//메서드 : 값 담아서 찍어줌. 
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("핸드폰번호 : "+phone);
		System.out.println("주소 : "+address);
		System.out.println("직급 : "+rank);
	}
	
}
