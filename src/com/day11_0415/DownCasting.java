package com.day11_0415;
//#8

	/*
	참조형 변수도 형변환 가능
	단, 서로 상속관계에 있는 클래스 사이에서만 가능
	
	[1] 자동형변환 : up casting
	부모타입 <- 자식타입
	
	[2] 명시적형변환 dowm casting
	자식타입 <- 부모타입
	
	Parent p = (Parent)new Child(); > 생략가능
	Parent p = new Child(); //자동형변환
	
	Child c = (Child)p; > 명시적 형변환
	
	Child c = (Child)new Parent; > 실행에러	
	*/

class Car{
	
	public void drive() {
		System.out.println("drive!");
	}
	
	public void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	
	public void water() {
		System.out.println("water");
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
		System.out.println("엠뷸런스를 운전합니다.");
	}
	
}

public class DownCasting {

	public static void main(String[] args) {
		//1.자동형변환, 다형성
		Car c = new FireEngine();
		c.drive();
		//c.water(); >> error
		
		//2.명시적 형변환 down casting
		FireEngine f = (FireEngine)c;
		f.water(); //자식만의 메서드도 호출 가능해짐
		
		//FireEngine f2 = (FireEngine)new Car(); //실행에러
		
		c = new Ambulance();
		c.drive();
		
		Ambulance am = (Ambulance)c;
		am.siren(); //자식만의 메서드도 호출

		//형변환 수행전에 instance of 연산자를 이용해서 참조변수가 참조하고 있는 실제 인스턴스의 타입을 확인하는 것이 안전함
		/*
		#instance of
		참조변수가 참조하고있는 인스턴스의 실제 타입을 알아보기위해
		instance of 연산자 사용
		-true,false 중 하나를 리턴
		-true를 얻었다는 것은 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 의미
		
		
		참조변수 instance of 타입(클래스명)
		*/
		//Car c = new Ambulance();
		System.out.println("======================");
		if(c instanceof FireEngine) {
			FireEngine f2 = (FireEngine)c;
		}else if (c instanceof Ambulance) {
			Ambulance am2 = (Ambulance)c;
		}else {
			System.out.println("형변환 불가!");
		}
		
		Car c2 = new Car();
		if(c2 instanceof FireEngine) {
			FireEngine f2 = (FireEngine)c;
			f2.water();
		}else {
			System.out.println("FireEngine으로 형변환 불가");
		}
		
		/*자식타입 instanceof 부모클래스 : true
		 > 자식은 부모의 인스턴스이기도 하므로 
		*/
		
		FireEngine f3 = new FireEngine();
		if(f3 instanceof FireEngine) {
			System.out.println("f3은 FireEngine의 인스턴스!");
		}
		if(f3 instanceof Car) {
			System.out.println("f3은 Object의 인스턴스!");
		}
	}

}
