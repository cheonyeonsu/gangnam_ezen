package com.day10;

class Father {
	private String name;
	
	Father(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("name : " + name);
	}
}

class Son extends Father {
	
	//****부모생성자에 매개변수가 있으면.자식 생성자에 매개변수 없어도 받아와서 super로 넣어준다.**** 
	Son(String name){
		super(name);
	}
	
}//class

class SuperTest2 {
	
	public static void main(String[] args) {
		
		Son s = new Son("아들"); //아들 넣으면 부모생성자 호출되어서 아들 출력.
		s.display();
	}
}