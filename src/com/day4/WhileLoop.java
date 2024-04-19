package com.day4;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 무한루프
		 while(true){
		 반복 내용
		 
		 if(조건){
		 	break;
		   }
		 }
		 
		 */
		
		//사용자로부터 입력받은 수의 합을 구하되, 0이 입력되면 실행을 중지
		Scanner sc = new Scanner(System.in);
		int sum = 0; //********변수 선언 위치 주의. 안에다 초기화 하면 값 안먹음********
		
		while(true) {
			System.out.println("숫자 입력!(끝낼 때는 0)");
			int num = sc.nextInt();
			if(num==0) break;
			
			sum+=num; //sum+=1
		} //while
		
		System.out.println("총합 : " + sum);
		
	}

}
