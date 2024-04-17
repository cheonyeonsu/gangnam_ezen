package com.day13.eleven;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
	
		
		/*	ProductBuyer b = new ProductBuyer(1000);
		
		//1. TV구매, 가격 : 100
		b.buy(new TV(100));
		b.showInfo();
		
		//2. Computer 구매, 가격 : 200
		Product com = new Computer(200);
		b.buy(com);
		b.showInfo();
	*/	
		ProductBuyer b = new ProductBuyer(1000);
		Scanner sc = new Scanner(System.in);
		while(true) {
		int type = sc.nextInt();
		switch(type) {
		case 1 -> {
			System.out.println("1. 상품 구매 2. 구매내역 조회 3. 종료");
			int kind = sc.nextInt();
			System.out.println("상품 가격을 입력하세요.");
			int price = sc.nextInt();
			
			Product p = null; //부모에 자식 넣기.
			 if (kind == 1) {
                 p = new TV(price);
              } 
              else if (kind == 2) {
                 p = new Computer(price);
              }
              
              b.buy(p);
              b.showInfo();
              break;
           }
           case 2 -> {
              b.summary();
              break;
           }
           case 3 -> {
              System.out.println("종료");
              return;
           }
           default -> {
              System.out.println("올바른 숫자를 입력해 주세요.");
             continue;
           }
        }//switch
		} //while
     }//main
		
}//class
		
		


