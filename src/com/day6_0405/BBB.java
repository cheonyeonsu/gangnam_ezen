package com.day6_0405;

public class BBB {
	private int x;
	int y;
	protected int z;
	public int n;
	
	public void showInfo() {
		System.out.println("private x="+x);
		System.out.println("default y="+y);
		System.out.println("protected z="+z);
		System.out.println("public n="+n+"\n");
	}
}

public class PrivateTest {

	public static void main(String[] args) {
		AAA obj = new AAA();
		
		/* obj.x=10;  error*/
		// private는 같은 클래스 안에서만 접근 가능하므로.
		obj.y=20;
		obj.z=30;
		obj.n=40;
		
		obj.showInfo();
}
