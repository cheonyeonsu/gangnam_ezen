package com.day6_0405;

public class ArrayTest_49p {

	public static void main(String[] args) {
//		가로, 세로의 길이가 3인 단위 행렬을 만들고 출력 하기
//		단위행렬-대각선의위치에놓인요소들이1이고,나 머지 요소들이 0으로 이루어진 행렬
	
		int[][] arr = new int[3][3]; //행렬 생
		
		//단위 행렬 생성
	for(int i=0; i<3;i++) {
		for(int j=0;j<3;j++) {
			if(i==j) {
				arr[i][j]=1; //대각선 1
			}else {
				arr[i][j]=0; //나머지 0
			}
		}
	}
	
	System.out.println("단위 행렬 :"); 
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+"");
		}
		System.out.println();
	}

	}

}
