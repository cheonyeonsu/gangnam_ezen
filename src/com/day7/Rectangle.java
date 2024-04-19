package com.day7;
//#7
public class Rectangle {

	double width, height; //멤버변수
	
	//생성자********************
	Rectangle(double w,double h){
		width=w;
		height=h;
	}

	   public double findArea(){   // 넓이 구하기
	      return width * height;
	   }

	   public double findGirth(){   // 둘레 구하기
	      return (width + height)*2;
	   }

}
