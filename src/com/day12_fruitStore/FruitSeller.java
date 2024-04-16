package com.day12_fruitStore;
//과일 판매자 클래스(과일장사)
public class FruitSeller {
	private int numOfApple; //판매한 사과개수
	private int myMoney; //판매수익(남은 돈)
	private final int APPLE_PRICE; //생성자 초기화 하기 전까지는 error. 사과 하나의 가격.
	private String change; //잔돈
	
	public FruitSeller(int money, int numOfApple,int price) {
		this.myMoney=money;
		this.numOfApple=numOfApple;
		APPLE_PRICE=price; //final상수 : 생성자에서 단 한번 초기화. 인스턴스별로 다른 값 할당. 
	}

	
	//사과 판매 메서드
	public int saleApple(int money) {
		int num =money/APPLE_PRICE;
		numOfApple-=num; //사과 갯수 줄고
		myMoney+=money; //돈은 늘어나고
		
		//거스름돈, 사과 갯수 묶어서 출력. : 클래스로 묶기 
		// 
		
		int change = money-(numOfApple*APPLE_PRICE);
		
		return num; //구매자에게 줄 사과개수
	}
	
	public void showChange() {
		System.out.println("거스름돈 : "+ change +"원");
	}
	
	public void showResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : "+ myMoney + "\n");

	}
	
	}
