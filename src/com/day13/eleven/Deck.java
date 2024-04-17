package com.day13.eleven;

public class Deck {
 private static final int CARD_NUM=52; //카드의 개수
 
 //포함관계 - Card클래스를 배열로 포함시킴 
 //카드 52장을 담는 배열
 private Card[] cardArr = new Card[CARD_NUM];

private int idx;
 
 public Deck() {
	 //카드 52장 초기화 4*13
	 for(int i=1;i<=Card.MAX_KIND;i++) { //카드의 종류 4
		 for(int j=1;j<=Card.MAX_NUMBER;j++) { //카드의 숫자 13
			 //카드 배열에 52장 담기
			Card c = new Card(i,j); 
			 cardArr[idx++] = new Card();  
			 
		 }
	 }//for
 }
 //getter setter 
 public Card[] getCardArr() {
	 return cardArr;
 }
 
 public void serCardArr(Card[] cardArr) {
	 this.cardArr=cardArr;
 }
 
 //임의의 카드 한 장 뽑기
 public Card pick() {
	 //0~51 사이의 idx에 해당하는 랜덤값 뽑기
	 int rnd=(int)(Math.random()*52); //0~51
	 return cardArr[rnd];
 }

 //지정된 위치(idx)에 있는 카드 하나 뽑기.
 public Card pick(int index) {
	 Card c = null;
	 if(index<0 || index >= CARD_NUM) {
		 c=pick();
	 }else {
		 c=cardArr[index];
	 }
	 return c;
 }
 //카드의 순서를 섞어주는 메소드
 public void suhffle() {
	 for(int i=0;i<1000;i++) {
		 //랜덤한 index값 구하기
		 int rnd = (int)(Math.random()*52); // 0~51
		 
		 //0번째 배열의 값과 랜덤번째 배열의 값을 서로 맞바꾼다. 
		 Card temp = cardArr[0]; 
		 cardArr[0] = cardArr[rnd]; 
		 cardArr[rnd] = temp;
	 }//for
 }
 
}
