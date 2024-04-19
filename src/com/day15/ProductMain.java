package com.day15;

public class ProductMain {
	public static void main(String[] args) {
	ProductBuyer buyer = new ProductBuyer(1000);
	buyer.summary();
	
	//300만원 TV구매
	TV tv1 = new TV(300);
	buyer.buy(tv1);
	
	//100만원 Computer구매
	buyer.buy(new Computer(100));
	
	//200만원 TV구매
	Product tv2 = new TV(200);
	buyer.buy(tv2);
	
	//summary
	buyer.summary();
	
	//300만원 TV반품
	buyer.refund(tv1);
	
	//summary
	buyer.summary();
	}
}
