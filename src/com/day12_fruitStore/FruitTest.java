package com.day12_fruitStore;

public class FruitTest {
	public static void main(String[] args) {
		FruitBuyer buyer = new FruitBuyer(10000);
		
		FruitSeller seller1 = new FruitSeller(0, 30, 1500);
		FruitSeller seller2 = new FruitSeller(0, 20, 2000);
//		
//		buyer.buyApple(seller1, 4500);
//		buyer.buyApple(seller2, 2000);
		
		System.out.println("판매자 1의 현재 상황");
		seller1.showResult();
		
		System.out.println("판매자 2의 현재 상황");
		seller2.showResult();
		
		//buyer.showResult();
		
		//거스름돈 주기
		seller1.saleApple(2000, buyer);
		seller2.saleApple(5000, buyer);
		
	}
}
