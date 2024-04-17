package com.day13.exception;

class Car{
	   public void drive() {
	      System.out.println("drive!");
	   }
	   
	   public void stop() {
	      System.out.println("stop!");
	   }
	}

	class FireEngine extends Car{
	   public void water() {
	      System.out.println("water!!");
	   }
	   
	   public void drive() {
	      System.out.println("소방차를 운전합니다.");
	   }
	}

	class Ambulance extends Car{
	   public void siren() {
	      System.out.println("siren~");
	   }
	   
	   public void drive() {
	      System.out.println("앰뷸런스를 운전합니다.");
	   }
	}


	/*다형성 이용
	 [1] 인터페이스 이용
	 [2] 1.소방차 2.앰뷸런스 선택 받고, 오버라이딩 메서드 호출 - 다형성 이용 
	   [3] Car 배열에 요소 3개 넣고, 
	 모든 차의 오버라이딩 메서드호출-for/확장 for 이용*/
	
public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
