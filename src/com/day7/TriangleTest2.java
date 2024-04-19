package com.day7;

import java.util.Scanner;

//점심시간 직전 
public class TriangleTest2 {

public static int findArea(int w,int h) {
	return w*h/2;
}
	
	public static void main(String[] args) {
		//[2] 매서드만 만들어서  삼각형 면적 구하기 
		
		
		//사용자 입력받
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형 밑변, 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//로직처리 - 삼각형 면적
		int area = findArea(w,h);
		
		//결과 출력 
		System.out.println("삼각형 면적 : " +area);
		

	}

}
