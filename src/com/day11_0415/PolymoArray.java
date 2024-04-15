package com.day11_0415;

import java.util.Scanner;

//5. ppt27p + PolymoArray2 


class Shape2{
	public double findArea() {
		return 0;
	}
	
	public String getType() {
		return "도형";
	}
}

class Circle2 extends Shape2{
	//멤버변수
	int radius; //반지름 10
	
	//생성자
	public Circle2(int radius) {
		this.radius=radius;
	}
	
	//메서드
	public double findArea() { //넓이 구하는 메서드
		double area = radius*radius*3.14;
		return area;
	}	
	
	public String getType() {
		return "사각형";
	}
}

class Rectangle extends Shape2{
	private int w,h;
	
	Rectangle(int w, int h){
		this.w=w;
		this.h=h;
	}
	
	public double findArea() { 
		double area = w*h;
		return area;
	}
	
	public String getType() {
		return "사각형";
	}
}

public class PolymoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX_COUNT=2;
		Shape2[] shArr = new Shape2[MAX_COUNT];
		
		int idx=0; //무한루프니까 인덱스 생성
		
		//눈여겨보기
		
		//***데이터가 없어요 출력하기. 
		while(true) {
			System.out.println("1.원 2.사각형 3.보기 4.종료");
			int type = sc.nextInt();
			//데이터 없음 표시.
			if((type==1 || type==2) && idx==MAX_COUNT) {
				System.out.println("데이터를 더 이상 입력할 수 없습니다.\n");
			}
			
			switch(type) {
			case 1->{
				System.out.println("반지름 입력!");
				int r=sc.nextInt();
				shArr[idx++] = new Circle2(r);
			}
			case 2->{
				System.out.println("사각형 가로,세로 입력!");
				int w = sc.nextInt();
				int h = sc.nextInt();
				shArr[idx++] = new Rectangle(w,h);
				
			}
			case 3->{
				System.out.println("\n=========보기=========");
				for(int i=0;i<idx;i++) {
					double area = shArr[i].findArea();
					System.out.println(shArr[i].getType()+"의 면적 : "+area);
				}//for
				System.out.println("\n=====================\n");
			}
			case 4->{
				System.out.println("종료합니다.");
				return;
			}
			default -> {
				System.out.println("잘못 입력하셨습니다.\n");
				continue;
			}
			
			}//switch
			
		}//while
	}

}
