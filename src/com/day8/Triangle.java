package com.day8;
//어제꺼 복습
public class Triangle {
	//1.멤버변수
	private int width; //밑변
	private int height; //높이
	
	//2.생성자
	public Triangle(int width,int height) {
		this.width=width; //멤버변수=매개변수
		this.height=height;
	}
	
	//3.getter setter
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) { //set은 생성자랑 같은 역할이라 값 넣어줌
		this.width=width;
	}
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	//4.매서드
	public int findArea() {
		return width*height/2;
	}
	
	
}
