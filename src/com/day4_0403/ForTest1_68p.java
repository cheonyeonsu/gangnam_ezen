package com.day4_0403;

public class ForTest1_68p {

	public static void main(String[] args) {
		/*
		 반복문 - 반복적인 작업을 수행할 때 사용
		 1. for
		 2. While
		 3. do ~While
		 4. 확장 for
		 
		 for문
		 - 반복횟수가 미리 정해진 경우 주로 사용
			for(초기식;조건식;증감식){ //시작값, 최종값, 증가값
				반복 명령;
			}
		 
		 */
		
		//for문 안에서 i는 반복횟수로만 사용 : 3번 반복한다.
		for(int i=0;i<3;i++) {
			System.out.println("hello java!");
			
		}
		
		//for문 안에서 i는 사용 : 상황 수행
		for(int i=0;i<4;i++) {
			System.out.println(i);
			
		}
		
		//감소 연산식 i는 3부터 시작해서 0부터 큰 동안 실행.(3,2,1), 부등호 주의.
		System.out.println("\n----i값 감소----");
		for(int i=3;i>0;i--) {
			System.out.println(i);
			
		} 

		/*
		 * [1] i=0
		 * 1. hi spring
		 * 2. hi spring
		 * 3. hi spring
		 * 
		 * [2] i=0또는 i=1
		 * 1
		 * 3
		 * 5
		 * 7
		 * 9
		 * 
		 
		 */
		
		//#1 : 0 1 2인데 1 2 3 나와야하니까 i+1로 만들어줌 
		for(int i=0; i<3; i++) { 
			System.out.println((i+1)+".hi spring");
		}
		
		//#2-1
		for(int i=0; i<10; i++){
			if(i%2==1) {
				System.out.println(i);
			} //if
			
		}//for
		
		//#2-2
		System.out.println();
		// i++ > i=i+1 > i+=1
		//	     i=i+2 > i+=2
		for(int i=1; i<10; i+=2){
			if(i%2==1) {
				System.out.println(i);
			}
			
		}
		
		//68p [1]
		for(int i=0;i<3;i++) {
			System.out.println("hello java!");
		}
		
		//68p [2]
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}System.out.println("---끝---");
		
		//68p [3]
		for(int i=3;i>0;i--) {
			System.out.println(i);
		}
		
		//68p [4] *****i-=2*****
		for(int i=10;i>-8;i-=2) {
			if(i>0) {
				System.out.println(i+" java");
			} else if (i==0) {
				System.out.println(i+" oracle");
			} else{
				System.out.println(i+" spring");
			}
			
		}

		

	}

}
