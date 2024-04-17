package com.day13.eleven;

public class Card {
	private final int KIND;  // 카드  무늬의  수  1~4
	private final int NUMBER;  // 무늬별  카드  수(카드의  숫자) 1~10,  J, Q, K

	private static final int SPADE=1;
	private static final int DIAMOND=2;
	private static final int HEART=3;
	private static final int CLOVER=4;

	//외부에서도 사용
	public static final int MAX_KIND=4; 
	public static final int MAX_NUMBER=13;


	public Card(){
		this(SPADE, 1); //같은 클래스의 다른 생성자를 호출 
	}

	public Card(int kind, int num){ 
		this.KIND=kind; //final 상수 - 생성자에서 단 한번 초기화
		//객체별로 다른 값을 줄 수 있다. 
		this.NUMBER=num; 
	}

	public String findInfo(){
		String kind="", num="";
		
		switch (KIND){
		case SPADE :
			kind ="SPADE"; 
			break;
		case DIAMOND :
			kind="DIAMOND";
			break;
		case HEART :
			kind="HEART";
			break;
		case CLOVER: 
			kind ="CLOVER";
			break;
		default :
			kind = "";
			break;
		}

		switch (NUMBER) {
		case 11: num="J";
		case 12: num="Q";
		case 13: num="K";
		default:
			num=NUMBER+"";

		}
		return "card[kind="+ kind +", number="+ num+"]"; //SPADE, K
	}}