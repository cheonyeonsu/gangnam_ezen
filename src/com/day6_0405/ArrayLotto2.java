package com.day6_0405;

import java.util.Arrays;
import java.util.Scanner;


//실행이 안됨.
public class ArrayLotto2 {

	public static int[] Lotto() {
		int[] num = new int[6];
		
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
		return num;
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num;	
			
		
		while(true) {
			num =Lotto();
			
			
			//정렬
			Arrays.sort(num);
			
			//출력
			for(int n : num){
				System.out.print(n+"\t");
			}//for
			System.out.println("\n====================");
			
			System.out.println("\n계속 하시겠습니까?(Y/N)");			
			String s = sc.nextLine();
			if (s.equalsIgnoreCase("N")) 
				break;
			
			
		}

		
	}

}
