package com.day6_0405;


import java.util.Scanner;

public class ArrayTest_44p {
//꼭 해야하는 페이지.
	public static void main(String[] args) {
		/*
		 5개의  숫자를  사용자로부터  입력  받아서  배열에 넣고, 내림차순으로  정렬한  후  출력하기
		 2번째  배열(num[1])의  값부터  앞의  값들과  차례로  비교하여 
		 더  큰  값을  앞의  배열로  이동한다  (swap)
		 */
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		//1. 5개 숫자 입력받기
		System.out.println("숫자 5개를 입력하세요.");
		for(int i=0; i<arr.length; i++) { //array의 길이 만들
			arr[i] = sc.nextInt();
			//사용자로부터 정수를 입력 받아 배열 arr의 i번째 요소에 저장
			
		
		//배열 순서 바꾸려면 배열을 복제 해야 함.
		//int[] arr2 = arr; //arr2를 복제 뒤 arr 집어넣음. 
		
		}
		
		for(int j=0; j<arr.length; j++) { //j는기준값, l은 비교할 다음 값.
			for(int l=j+1; l<arr.length; l++) { //
				if(arr[j] < arr[l]) { //뒤의l값이 큰값인지 아닌지 비교. 
					int temp = arr[j];  
					//작은값을 temp에 담아. 위치 바꾸면 값이 소실되므로. 원래의 값을 temp에 임시저장. 
					arr[j] = arr[l];  //j자리에l을 덮었음.
					arr[l] = temp; //덮은 다음에 원래 값인 temp를 가져옴.
				}
			}
		}
		for (int number: arr) {
			System.out.print(number);
		}
		

	}

}
