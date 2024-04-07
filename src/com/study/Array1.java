package com.study;

public class Array1 {

	public static void main(String[] args) {
		
		
		// 0~9까지의 수를 담고있음. 
		int arrayInt[] = new int[10]; //초기화 해줄 수 있는 값을 반드시 하나 넣어야
		//배열에 있는 값을 꺼내려면 반복문으로 배열의 길이만큼 for문으로 출력 
		
		//arrayInt의 길이만큼 for문을 돌려
		for(int i =0; i<arrayInt.length; i++) {
			System.out.println(i);
			
		}
		
		int arrayInt2[] = {1,3,5,7,9};
		for(int i =0; i<arrayInt2.length; i++) { //길이를 출력하기때문에 5개를 1씩 증가하면서 출력.
			System.out.println(i);
		System.out.println();
			
		}
		
		//1,3,5,7,9, 출력 
		int arrayInt3[] = {1,3,5,7,9};
		for (int i=0; i<arrayInt3.length;i++) {
			System.out.println(arrayInt3[i]); //인덱스상에서 i를 출력해라 >for	문이니까 길이만큼.
		}
		
		String arrayStr[] = {"a","b","c","d","e"};
		for (int i=0; i<arrayInt3.length;i++) {
			System.out.print(arrayStr[i]); 
		}
	}

}
