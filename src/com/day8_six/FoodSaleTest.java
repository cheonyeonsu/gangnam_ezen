
package com.day8_six;

import java.util.Scanner;

public class FoodSaleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴, 수량, 단가를 입력하세요.");
			String name = sc.nextLine();
			int quantity = sc.nextInt();
			int salesPrice = sc.nextInt();
			//int discount = sc.nextInt();
			
			FoodSale fs = new FoodSale(name,quantity,salesPrice);
			fs.findSalesPrice();
			fs.findTotalPrice();
			
			System.out.println("판매금액 : " + fs.getSalesPrice());
			System.out.println("총 합계 : "+ fs.getTotalPrice());
			
			System.out.println("그만하시겠습니까? <Q>uit");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}System.out.println("종료");

	}

}
