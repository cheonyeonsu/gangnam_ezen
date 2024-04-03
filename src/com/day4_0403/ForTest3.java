package com.day4_0403;


public class ForTest3 {

	public static void main(String[] args) {
		//for문의 중첩
		for(int i=0; i<3;i++) {
			System.out.println("======현재 i :" + i);
			
			for(int j=0;j<2;j++) {
				System.out.println("현재 J : "+ j);
			}//안쪽 for
			System.out.println();
		}//바깥 for
		
		//구구단 출력
		for (int i=2;i<=9;i++){ //단
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}//바깥 for
		
		//중첩 for문 이용, 구구단을 가로로 출력
		for (int i=1;i<10;i++){ //단
			for(int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}//바깥 for
		
	}

}
