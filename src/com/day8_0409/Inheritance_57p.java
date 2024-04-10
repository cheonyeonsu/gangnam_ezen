package com.day8_0409;

import java.util.Scanner;

/*
 
 Person - 부모 클래스 
 이름, 나이
 getter/setter

 Student - Person의 자식 클래스 
 학번
 getter/setter
 메서드 - study()
 공부한다 출력

 Graduate - Student의 자식 클래스  전공
 getter/setter
 메서드 - writeThesis()
 논문을 쓴다 출력
 main()에서 Graduate 객체 생성
 */

class Person2{
	String name;
	int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	
	
}//class
