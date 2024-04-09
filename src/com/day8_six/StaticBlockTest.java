package com.day8_six;

//

//Static 초기화 Block 연습. ppt19p
class StaticBlock{
	static int[] arr = new int[10]; //명시적 초기화
	
	static {
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10+1); //1에서 10까지의 정수
		} //for
	}
	
	/*
	 * static 초기화블럭(클래스 초기화 블럭) 
	 * static변수의 복잡한 초기화에 사용됨
	 * 해당클래스가 메모리에 로딩될 때 static 변수가 생성되고
	 * 바로 static초기화 블럭이 호출되어 ststic변수를 초기화함.
	 
	static{
	
	}
 
	 */
	
}//class

public class StaticBlockTest {
	public static void main(String[] args) {
		for(int i=0;i<StaticBlock.arr.length;i++) {
			System.out.print(StaticBlock.arr[i]+" ");
		}//for
	}
} //class
