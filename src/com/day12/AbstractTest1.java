package com.day12;

/*
	[1] 추상메서드 (Abstract Method)
	- 몸체 없는 메서드
	- 메서드의 구현부가 없다는 것
	- 메서드{}블럭을 포함하고있지 않고, 프로토타입()만 존재
		public abstract int func(int a);
	- 메서드의 내용이 상속받는 클래스에 따라 달라질 수 있기 때문에 부모 클래스에서는 선언부만을 작성하고
	  실제 내용은 상속받는 클래스에서 구현하도록 비워두는 것임

	Abstract class 클래스이름{
		...
	}

	[2] 추상클래스
	- 미완성 클래스, 부분적으로만 완성된 클래스
	- 미완성 메서드를 포함하고 있다는 의미
	- 객체를 생성할 수 없다
	- 부모클래스는 필요한 메서드를 추상적으로 정의할 뿐이며
	  구체적으로 어떻게 구현할 것인가는 자식클래스에 결정권을 줌
	- 상속을 통해서 자식 클래스에 의해서(오버라이딩)만 완성될 수 있다.
	- 추상클래스를 '상속'한 후 '모든 추상메서드들을 구현'했을 때 객체를 생성할 수 있다. 

	#추상클래스가 되는 방법
	- 추상 메서드를 하나라도 포함하고 있는 클래스
	- 추상 메서드를 포함하고 있지 않더라도 클래스 선언시 abstract 키워드를 포함하고 있을 경우

	#추상클래스
	- 상속의 관계를 형성하기 위한 상위클래스로, 
	  인스턴스화시키기 위해서 정의한 클래스가 아닌 경우 추상클래스로 만든다.

	#추상메서드
	- 오버라이딩의 관계를 형성하기 위해 정의된 메서드, 비어있는 메서드는 추상메서드로 만든다. 


 */


abstract class Animal{ //추상클래스
	public abstract void sound(); //추상메서드
}

	//오버라이딩
	class Dog extends Animal{
		public void sound() {
			System.out.println("멍멍");
		}
}
	
	abstract class Mammal extends Animal{ //포유류
		public void breed(int n) {
			System.out.println(n+"마리 새끼를 낳는다.");
		}
	
		
		//sound()를 오버라이딩 하지 않았으므로 추상클래스.
		//자식클래스에서 추상메서드를 모두 구현해주지 않으면
		//자식클래스도 추상메서드를 포함하게 되므로 추상 클래스가 됨 
	}

	
	class Cat extends Mammal{
		public void sound() {
			System.out.println("야옹");
		}
	}
	
	public class AbstractTest1 {

		public static void main(String[] args) {
		
			//Animal ani = new Animal(); error : Cannot instantiate the type Animal
		
			//Mammal m = new Mammal(); 추상 클래스는 객체 생성 불가 

			
			Dog d = new Dog();
			d.sound();
			
			Cat c = new Cat();
			c.sound();
			
			
			//다형성 이용
			System.out.println("========다형성 이용========");
			Animal an = new Dog(); // 추상클래스도 다형성 이용 가능
			an.sound();
			an = new Cat();
			an.sound();
			
			System.out.println("=======================");
			Mammal mam = new Cat();
			mam.sound();
			mam.breed(3);
			}

		}
