package com.day2;

import java.util.Scanner;

public class ScannerTest4 {

	public static void main(String[] args) {
		//1. 사용자로부터 입력받기 : 지방, 탄수화물, 단백질
		Scanner sc = new Scanner(System.in);
		System.out.println("지방은 몇그램 입니까?");
		int fat =sc.nextInt();
		
		System.out.println("탄수화물은 몇그램 입니까?");
		int carbo=sc.nextInt();
		
		System.out.println("단백질은 몇그램 입니까?");
		int protein = sc.nextInt();
		
		//2. 비즈니스 로직처리 - 칼로리 구하기
		int calory = (9*fat)+(4*carbo)+(4*protein);
		
		//3. 결과 출력
		double kcal = calory/1000.0;
		System.out.println("총 칼로리는 "+calory+"입니다");
		

		

	}

}
