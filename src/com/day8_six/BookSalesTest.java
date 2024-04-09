package com.day8_six;

import java.util.Scanner;

public class BookSalesTest {

	public static void main(String[] args) {
		//판매 금액 구해서 누적.
		
		Scanner sc = new Scanner(System.in);
		
		//무한루프
		while(true) {
			System.out.println("책 제목, 수량, 단가 입력!!");
			String title = sc.nextLine();
			int qty= sc.nextInt();
			int price = sc.nextInt();
			
			BookSales bs = new BookSales(title,qty,price);
			bs.findSalesPrice();
			bs.findTotal();
			
			System.out.println("판매금액 : "+ bs.getSalesPrice());
			System.out.println("누적 판매금액 : "+ bs.getTotalSalesPrice());
			
			System.out.println("그만하려면 Q");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		
		} //while
		

	}

}
