package com.day13.eleven;

public class CardTest {
public static void main(String[] args) {
	//카드 52장 배열 만들어서 출력하기. 
	Deck d = new Deck(); //카드 한벌 만들기 
	
	//카드 한벌 출력 : for로 하나하나 꺼내기
	Card[] cArr=d.getCardArr(); //게터로 배열 읽어오기
	for(int i=0;i<cArr.length;i++) {
		System.out.println(cArr[i].findInfo());
	}
	
	//랜덤 번째 카드 뽑기
	Card c =d.pick();
	System.out.println(c.findInfo());
	//51번째 카드 뽑아서 카드 정보 출력
	System.out.println("\n=======51번째 카드=======");
	Card c2 = d.pick(51);
	System.out.println(c2.findInfo());

	//카드 섞기
	d.suhffle();
	
	//섞은 후 카드 한벌 다시 출력 - 확장 for이용.
	System.out.println("\n=======카드 섞은 후=======");
	for(Card c3:cArr) {
		System.out.println(c3.findInfo());
	}
		
	}
	
}

