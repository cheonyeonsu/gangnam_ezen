package com.day8_six;

public class BookSales {

	//1. 멤버변수
	//인스턴스변수
	private String title; //책 제목
	private int quantity,price,salesPrice; //수량,단가,판매금액
	
	//static변수
	private static int totalSalesPrice; //총 판매금액(각 객체들의 판매금액의 합)
	
	//2. 생성자
	public BookSales(String title, int quantity, int price) {
		this.title = title;
		this.quantity=quantity;
		this.price=price;
	}
	
	//3. getter setter
	public int getSalesPrice() {
		return salesPrice;
	}
	
	public static int getTotalSalesPrice() {
		return totalSalesPrice;
	}
	
	//4.매서드
	public void findSalesPrice() {
		salesPrice=price*quantity;
	}
	
	public void findTotal() {
		totalSalesPrice += salesPrice;
	}
	
	
}
