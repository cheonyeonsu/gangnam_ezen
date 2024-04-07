package com.study;

import java.util.Scanner;

public class Array_clone {

	public static void main(String[] args) {
		/*
		 5개의  숫자를  사용자로부터  입력  받아서  배열에 넣고, 내림차순으로  정렬한  후  출력하기
		 2번째  배열(num[1])의  값부터  앞의  값들과  차례로  비교하여 
		 더  큰  값을  앞의  배열로  이동한다  (swap)
		 */
		
		
		Scanner sc  = new Scanner(System.in);
		int[] arr = new int[5];
		
		//5개 숫자 입력받음
		System.out.println("숫자 5개를 입력하세요.");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
	for(int j=0; j<arr.length; j++) {
		for(int l=j+1;l<arr.length;l++) {
			if(arr[j]<arr[l]) {
				
				int temp = arr[j];
				arr[j] = arr[l];
				arr[l] = temp;
					
			}
		}
		
	}
	for(int number:arr) {
		System.out.println(number);
	}

	}

}
