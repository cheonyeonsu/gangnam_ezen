package com.day12;
/*
 * 상속과 구현을 동시에 할 수도 있다.
   class Fighter extends Unit implements Fightable{}
   
 - 인터페이스는 다중 상속이 가능하다
 	interface Figntable extends Movable,Attackable{}
 	
 - 인터페이스끼리는 extends 이용하여 상속함
 
 - 하나의 클래스가 여러개의 인터페이스를 상속받아 구현할 수 있다.
 class IPTV implements Tv,Computer{}
 
 */
class TV2{
	
	public void onTv(){
		System.out.println("TV영상 출력 중");
	}
}

interface Computer2{
	public abstract void dataReceive();
}

class IPTV2 implements Computer2,TV2{
	
	public void dataReceive() {
		System.out.println("영상데이터 수신중");
		
	}
	
	public void onTv() {
		System.out.println("TV영상 출력중");
	}
	public void powerOn() {
		dataReceive();
		onTv();
		
	}
	
	
}

public class IPTvTest2 {

	public static void main(String[] args) {
		IPTV obj = new IPTV();
		obj.powerOn();

	}

}
