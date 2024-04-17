package com.day13.eleven;

import com.day12_fruitStore.FruitResult;

//과일 구매자 클래스 (나)
public class FruitBuyer {
	private int myMoney; //남은 돈 10000=>5500=>3500
	private int numOfApple; //구매한 사과개수 3=>4
	
	public FruitBuyer(int money) {
		this.myMoney=money;
	}
	
	//사과를 구매하는 메서드
	public void buyApple1(Seller seller , int money) {
		//사과를 구매하는데 있어서 필요한 것:구매대상,구매금액
		if(myMoney <money) {
			System.out.println("보유금액이 부족합니다.");
			return;
		}
		int[] arr=seller.saleApple1(money); //아저씨의 판매메서드 호출
		int num=arr[0];
		int change=arr[1];
		
		myMoney-=(money-change); //돈은 줄고
		numOfApple+=num; //사과는 늘어나고
		//=> 판매자와 반대상황
	}	
		
	public void buyApple(Seller seller , int money) {
		//사과를 구매하는데 있어서 필요한 것:구매대상,구매금액
		if(myMoney < money) {
			System.out.println("보유금액이 부족합니다.");
			return;
		}
		
		FruitResult result=seller.saleApple(money); //아저씨의 판매메서드 호출
		int num=result.getNum(); //읽을 때 바로 못가져오니까 게터로 가져온다. 
		int change=result.getChange();
		
		myMoney-=(money-change); //돈은 줄고
		numOfApple+=num; //사과는 늘어나고
		//=> 판매자와 반대상황
	}
	
	public void showResult() {
		System.out.println("\n======구매자 정보=========");
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과개수 : " + numOfApple+"\n");		
	}
}



