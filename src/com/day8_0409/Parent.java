package com.day8_0409;

public class Parent {
	private int num1;
	int num2;
	protected int num3;
	public int num4;
	
	public void showInfo() {
		System.out.println("private num1="+num1);
		System.out.println("default num2="+num2);
		System.out.println("protected num1="+num3);
		System.out.println("public num4="+num4+"\n");
	}
}
