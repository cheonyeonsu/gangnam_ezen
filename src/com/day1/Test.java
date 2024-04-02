package com.day1;

public class Test {

	public static void main(String[] args) {
		//주소록
		String name = "홍길동";
		int age = 20;
		String tel = "010-100-2000";
		String address = "당산동";
		
		System.out.println("이름 : " + name +", 나이 : " + age + "살" );
		System.out.println("전화번호 : " + tel + ", 주소 : " + address);
		
		//상품 재고
		String product  = "휴대폰";
		int quantity = 15;
		int cost = 260000;
		int price = 350000;
		
		System.out.println("상품 : "+product + ", 수량 : "+quantity + "개");
		System.out.println("원가 : "+cost + "원" + ", 판매가격 : "+price + "원");
		
		

	}

}
