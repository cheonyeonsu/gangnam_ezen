package com.day7;
//#8
import java.util.Scanner;

class RectangleTest {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("사각형의 가로, 세로를 입력하세요");
	      double w = sc.nextDouble();
	      double h = sc.nextDouble();

	      Rectangle r = new Rectangle(w,h);
	      r.width=w;
	      r.height=h;
	      
	      System.out.println("사각형의 넓이 : " + r.findArea());
	      System.out.println("사각형의 둘레 : " + r.findGirth());
	   }
}
