package com.day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLotto {

	public static void main(String[] args) {

		/*
		//구글 코드
		int Lotto[] = new int[6]; //숫자 6개씩 나옴

		System.out.print("로또 번호 :");
		for(int i=0; i < Lotto.length; i++) {
			int num = (int)(Math.random()*45)+1; //1~45
			Lotto[i] = num;
			for(int j = 0; j<i; j++) {
				if(Lotto[i] == Lotto[j]) {
					i--;
					break;
				}
			}System.out.print(Lotto[i]+" ");
		}
		
		*/
		
		//선생님 코드
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];	
		
		while(true)	{
			for (int i=0;i<6;i++ ){
				//랜덤 뽑는다
				int temp=(int)(Math.random()*45+1);
				num[i]=temp;
				
				//중복 검사
				for(int k=0;k<i;k++) {
					if (num[1]==num[k]) {
						i--; //중복된 데이터 값을 다시 뽑기 위해 1감소
						break;
					}
				}//안쪽for
				
				
				
				
			} //for
			
			//정렬
			Arrays.sort(num);

			//출력
			for(int n : num){
				System.out.print(n+"\t");
			}//for
			System.out.println("\n====================");

			System.out.println("\n계속 하시겠습니까?(Y/N)");			
			String s = sc.nextLine();
			if (s.equalsIgnoreCase("N")) break;

		}//while
	}

}
