package com.day12_fruitStore;
//과일 판매자 클래스(과일장사)
public class FruitSeller {
	private int numOfApple;  //사과개수  30=>27 | 20=>19
	private int myMoney;  //판매수익(남은 돈)4500|2000
	private final int APPLE_PRICE; 	//사과 하나의 가격 1500 |2000
	
	public FruitSeller(int money, int numOfApple, int price){
		this.myMoney=money;
		this.numOfApple=numOfApple;
		APPLE_PRICE=price; //final상수:생성자에서 단한번 초기화
		//=> 인스턴스별로 다른 값 할당
	}
	
	//사과 판매 메서드
	public int saleApple(int money) {
		int num=money/APPLE_PRICE; //3 <=4500/1500 |1<=2000/2000
		numOfApple-=num; //사과개수 줄고
		myMoney+=money; //돈은 늘어나고
		
		return num;  //구매자에게 줄 사과개수
	}
	
	public void showResult() {
		System.out.println("남은 사과:" + numOfApple);
		System.out.println("판매수익:" + myMoney +"\n");		
	}
}








