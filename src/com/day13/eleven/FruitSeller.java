package com.day13.eleven;

import com.day12_fruitStore.FruitResult;

//과일 판매자 클래스(과일장사)
public class FruitSeller implements Seller{
	private int numOfApple;  //사과개수  30=>27 | 20=>19
	private int myMoney;  //판매수익(남은 돈)4500|2000
	private final int APPLE_PRICE; 	//사과 하나의 가격 1500 |2000
	
	public FruitSeller(int money, int numOfApple, int price){
		this.myMoney=money;
		this.numOfApple=numOfApple;
		APPLE_PRICE=price; //final상수:생성자에서 단한번 초기화
		//=> 인스턴스별로 다른 값 할당
	}
	

	public int[] saleApple1(int money) {
		int num=money/APPLE_PRICE; //5000/1500>3		
		//거스름돈 구하기
		int change=money%APPLE_PRICE;//5000%1500>500
		
		numOfApple-=num; //사과개수 줄고
		myMoney+=(money-change); //돈은 늘어나고
		
		int[] arr = new int[2];
		arr[0]=num; //0번째 사과 갯수
		arr[1]=change; //
				
		return arr;  //구매자에게 줄 사과개수
	}
	
	//사과 판매 메서드
		public FruitResult saleApple(int money) {
			int num=money/APPLE_PRICE; //5000/1500>3		
			//거스름돈 구하기
			int change=money%APPLE_PRICE;//5000%1500>500
			
			numOfApple-=num; //사과개수 줄고
			myMoney+=(money-change); //돈은 늘어나고
			
			FruitResult result = new FruitResult(num, change);
			
			return result;  //구매자에게 줄 사과개수
		}
	
	
	public void showResult() {
		System.out.println("남은 사과:" + numOfApple);
		System.out.println("판매수익:" + myMoney +"\n");		
	}
}








