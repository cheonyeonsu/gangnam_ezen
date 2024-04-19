package com.day11;

import java.util.Scanner;

//#6 5에서 가져온거
public class ShapeManager {
	
	Scanner sc = new Scanner(System.in);
	final int MAX_COUNT=2;
	Shape2[] shArr = new Shape2[MAX_COUNT];
	
	int idx=0; //무한루프니까 인덱스 생성
	public void inputCircle() {
		if(idx==MAX_COUNT) {
			System.out.println("데이터를 더 이상 입력할 수 없습니다.\n");
			return;
		}
		
		System.out.println("반지름 입력!");
		int r=sc.nextInt();
		shArr[idx++] = new Circle2(r);
	}
	
	public void inputRect() {
		if(idx==MAX_COUNT) {
			System.out.println("데이터를 더 이상 입력할 수 없습니다.\n");
			return;
		}
		
		System.out.println("사각형 가로,세로 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		shArr[idx++] = new Rectangle(w,h);
	}
	
	public void showData() {
		System.out.println("\n=========보기=========");
		for(int i=0;i<idx;i++) {
			double area = shArr[i].findArea();
			System.out.println(shArr[i].getType()+"의 면적 : "+area);
		}//for
		System.out.println("\n=====================\n");
	}
	
	
	
	

}
