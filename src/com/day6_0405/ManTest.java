package com.day6_0405;

class Man{
	//멤버변수
	private int age;
	int height;

	//getter/setter
	public int getAge() { //getter - 멤버변수의 값 읽기
		return age; //값을 읽을 수 있어야하니까 return.
	}

	public void setAge(int p_age) { //setter : 멤버변수에 값 할당
		age=p_age; 
		if(p_age<1) {
			age=1;
		}else {
			age=p_age;
		}
	}

}

public class ManTest {
	//메인 클래스에 뭐 작성 X
	public static void main(String[] args) {
		Man m = new Man();
		m.height=175;
		m.setAge(20); //멤버변수에 값 바로 넣고싶으면 setter 호출. 

		System.out.println("키 : "+m.height);
		System.out.println("나이 : "+m.getAge()); //멤버변수값 읽기. 
			
		m.setAge(-5);
		System.out.println("나이 : "+ m.getAge());
	}
	//setter로 읽고 getter로 읽어옴. 
}
