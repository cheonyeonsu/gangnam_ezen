package com.day3;

import java.util.Scanner;

public class Test44p {

	public static void main(String[] args) {
		//중첩if
		/*
				 if문이 중복으로 사용된 것.
				 바깥쪽 if문이 참이 되어야 안쪽 if문을 수행함.

				 if(조건식){
				 	if(조건식){
				 		명령문1
				 	}else{
				 		명령문2
				 	}
				 }
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원여부 입력! (1.회원 2.비회원)");
		int flag = sc.nextInt();
		String gift = ""; //사은품
		if(flag==1) { //회원인 경우만 처리
			System.out.println("회원이 구매한 금액을 입력하세요.");
			int purchaseAmount=sc.nextInt();
			
			if(purchaseAmount>=1000000) {
				gift = "외장하드";
			}else if(purchaseAmount>=500000) {
				gift = "스피커";	
			}else if(purchaseAmount>=100000) {
				gift = "마우스";	
			}else {
				gift="10만원 미만은 사은품이 없습니다.";
			}
			System.out.println("구매 금액별 사은품 :"+gift);
						
		}else {
			gift = "비회원은 사은품 증정 불가!";
			System.out.println(gift);
		} //바깥 if
		
	}

}
