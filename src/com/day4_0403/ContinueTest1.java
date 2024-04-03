package com.day4_0403;

public class ContinueTest1 {

	public static void main(String[] args) {
		//연수.화이팅.할수있다.
		
		/*
		 [1]break
		 	- switch와 반복문에서만 사용가능
		 	- 반복문을 빠져나감
		 [2] continue
		 	- 반복문안에서만 사용가능
		 	- 다음 반복위치로 이동
		 	- 반복을 한번 건너뛰고 다음 반복을 실행
		 	- 특정 값에 대한 처리를 제외하고자 할 때 필요
		 [3] return
		 	- 매서드의 실행을 종료하고 호출원으로 복귀함
		 * */
		for(int i=1;i<=10;i++) { //1~4까지 찍었는데 i=5일 때 컨티뉴 > 다음 반복위치로 올라감 > 5빼고 6부터 나머지 찍힘
			if(i==5) continue;
			
			System.out.println("i="+i);
		}
		
		System.out.println("\n====break====");
		for(int i=1;i<=10;i++) { //1 2 3 4 찍힘. 5됐을 때 브레이크 > 탈출. 그래서 4까지만 찍음
			if(i==5) break;
			
			System.out.println("i="+i);
		}
		
		System.out.println("\n======중첩 for : break ======");
		for(int i=0;i<3;i++) { //0,1,2 실행.
			for(int j=0;j<3;j++) {
				if(j==1) break;
				System.out.println("i="+i+", j="+j);
			}
		}//for
		
		System.out.println("\n======중첩 for : continue ======");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(j==1) continue ;
				System.out.println("i="+i+", j="+j);
			}
		}//for
	}

}
