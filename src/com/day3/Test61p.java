package com.day3;

import java.util.Scanner;

public class Test61p {

	public static void main(String[] args) {
		/*
		 [중첩 If 문 이용]
		 나이를 입력 받아서,나이가 20세 미만이면 에러 메세지를 출력하고,
		 나이가 20세 이상인 경우에는 다시 취미를 입력 받고, 입력 받은 취미를 화면에 출력
 		 취미는 1. 영화 2. 축구 3. 야구 4. 등산 중에서 선택하게 하고, 화
		 면 출력시 입력 받은 취미가 1 이면 ‘영화를 선택하였습니다’라고 출력함
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기. nextInt() 메소드를 호출한 후에 문자열을 입력받아야 하므로.
		
	
		if (age<20) {
			System.out.println("20세 이상만 본 설문에 응할 수 있습니다.");
       } else {
       	 System.out.println("취미를 입력하세요 (1.영화 2.축구 3.야구 4.등산)");
       	 int hobbyCode = sc.nextInt(); //사용자가 입력한 취미의 코드
       	 sc.nextLine();
       	 String hobby=""; //사용자가 입력한 취미를 저장
       	 
       	 if(hobbyCode==1) {
       		 hobby="영화";
       	 } else if(hobbyCode==2) {
       		 hobby="축구";
       	 }else if(hobbyCode==3) {
       		 hobby="야구";
       	 }else if(hobbyCode==4) {
       		 hobby="등산";
       	 }else {
       		 System.out.println("취미를 잘못 선택하였습니다.");
       		 return; 
       	 }
       	 System.out.println(hobby+"를 선택하였습니다.");
       }
		
	
	}
	



	}


