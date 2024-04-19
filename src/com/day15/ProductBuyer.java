package com.day15;
//고객 - 구매자

import java.util.ArrayList;

public class ProductBuyer {
	private int myMoney;
	private int myPoint;
	
	
	//구매한 상품을 저장할 배열 추가
	private ArrayList<Product> pdList = new ArrayList<>(10);
	
	public ProductBuyer(int myMoney){
		this.myMoney=myMoney;
	}
	
	//상품을 구매하는 메서드 
	public void buy(Product p) { //Product p = new TV(); 다형성.
		if(myMoney < p.getPrice()) {
			System.out.println("잔액이 부족하여 상품을 구매할 수 없습니다. ");
			return;
		}
		
		//잔고는 줄고, 포인트는 늘어난다.
		this.myMoney -= p.getPrice();
		this.myPoint += p.getPoint();
		
		//구매한 상품을 배열에 저장
		pdList.add(p);
		
		System.out.println(p + "를 구매하였습니다.");
	}
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney);
		System.out.println("현재 포인트 점수 : " + myPoint);
	}
	
	public void summary(){
		//구매한 상품명과 상품가격의 합계 출력
		if(pdList.isEmpty()) {
			System.out.println("구매한 상품이 없습니다.");
			return;
		}
		
		int sum = 0;		
		String itemList = "";
		for(int i=0;i<pdList.size();i++){ //배열에서 하나하나 꺼내서 sum에 누적. 
			Product p = pdList.get(i);
			sum+=p.getPrice();
			itemList+=(i==0)?""+p:", "+p;
			
		}//for
		System.out.println("\n구매하신 상품의 총 금액 : "+sum);
		System.out.println("구매하신 상품 목록: "+ itemList +"\n");
	}
	
	public void refund(Product p) { //구매한 상품 환불
		if(pdList.remove(p)) {
			myMoney += p.getPrice();
			myPoint += p.getPoint();
			System.out.println(p+"를 반품하셨습니다.");
		}else { //제거에 실패한 경우 
			System.out.println("구매한 상품 중 해당 상품은 없습니다. ");
		}
		
	}
}
