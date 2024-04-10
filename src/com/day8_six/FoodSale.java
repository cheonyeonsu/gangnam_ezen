package com.day8_six;

public class FoodSale {

	//맴버변수
	private String name; //메뉴
	private int quantity,price,salesPrice; //수량, 단가,판매가격
	
	//static변수
	private static int totalPrice;
	double discount=0.1; //할인율
	
	//생성자
	public FoodSale(String name,int quantity,int price) {
		this.name=name; //메뉴 
		this.quantity=quantity; //수량 
		this.price=price; //단가 
		
	}
	
	//GetterSetter
	public int getSalesPrice() { //판매가
		return salesPrice;
	}
	
	public static int getTotalPrice() { //누적금액 
		return totalPrice;
	}
	
	
	//매서드
	public void findSalesPrice() { //가격 구하기 : 수량*가격*할인율
		int sale  = (int)(quantity*price*discount); //할인받은금액.
		salesPrice = (quantity*price)-sale;
	}
	
	
	public void findTotalPrice() {
		totalPrice += salesPrice; //금액 누적
	}
	
}
