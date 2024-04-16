package com.day12_0416;
/*
간접적인 관계의 두 클래스 (AA-I-BB)
클래스 AA가 클래스 BB를 직접 호출하지 않고
인터페이스를 매개체로 하는 경우 
- 클래스 AA는 인터페이스 I와만 직접적인 관계에 있기 때문에 
  클래스 BB의 변경에 영향받지 않음.
*/
interface I{
	void methodB();
}

class AA{ //인터페이스는 무조건 자식객체로 받는다. 
	public void methodA(I i) {
		i.methodB();
	}
	
}
/*class BB implements I{
	public void methodB() {
		System.out.println("BB 클래스 메서드");
	}
	
}*/
class CC implements I{
	public void methodB() {
		System.out.println("CC 클래스 메서드");
	}
	
}


public class InterfaceTest4 {

	public static void main(String[] args) {
		AA a = new AA();
		//a.methodA(new BB());
		a.methodA(new CC());
	}

}
