package com.day13.eleven;
//고객 - 구매자
public class ProductBuyer {
	private int myMoney;
	private int myPoint;
	
	private static final int MAX_COUNT=10;
	
	//구매한 상품을 저장할 배열 추가
	private Product[] pdArr = new Product[MAX_COUNT];
	private int idx;
	
	
	
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
		pdArr[idx++]=p; //p에 자식객체 들어오니까. 
		
		System.out.println(p.findInfo() + "를 구매하였습니다.");
	}
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney);
		System.out.println("현재 포인트 점수 : " + myPoint);
	}
	
	public void summary(){
		//구매한 상품명과 상품가격의 합계 출력
		int sum = 0;
		String itemList = null;
		for(int i=0;i<idx;i++){ //배열에서 하나하나 꺼내서 sum에 누적. 
			sum += pdArr[i].getPrice();
			itemList = pdArr[i].findInfo();
			if(i<idx-1) {
				itemList += ", "; // TV,Computer
			}
		}//for
		
		System.out.println("\n구매하신 상품의 총 금액 : "+sum);
		System.out.println("구매하신 상품 목록: "+ itemList +"\n");
	}
}
