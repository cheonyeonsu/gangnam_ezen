package com.day12_fruitStore;

//과일 구매자 클래스 (나)
public class FruitBuyer {
	private int myMoney; //남은 돈 10000=>5500=>3500
	private int numOfApple; //구매한 사과개수 3=>4
	
	public FruitBuyer(int money) {
		this.myMoney=money;
	}
	
	//사과를 구매하는 메서드
	public void buyApple(FruitSeller seller , int money) {
		//사과를 구매하는데 있어서 필요한 것:구매대상,구매금액
		
		int num=seller.saleApple(money); //아저씨의 판매메서드 호출
		myMoney-=money; //돈은 줄고
		numOfApple+=num; //사과는 늘어나고
		//=> 판매자와 반대상황
	}
	
	public void showResult() {
		System.out.println("\n======구매자 정보=========");
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과개수 : " + numOfApple+"\n");		
	}
}



