package com.day7_0408;

	/*Programmer 클래스
 필드 : 이름(name), 개발언어(language), 개발경력(career)
 getter/setter 만들기
 메서드 : 하는 일을 출력 - work()*/
public class Programmer {

	//1.work매서드 만들기 출력 매서드 만들기
	String name;
	String language;
	int career;
	
	//2. 생성자 만들기
	public Programmer(String n,String l,int c) {
		name = n;
		language = l;
		career = c;
	}
	
	//3. 게터 세터 만들기
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;

	}
	public int getCareer() {
		return career;
	}
	public void setCareer(int career) {
		this.career = career;
	}
	

	//4. 매서드 만들기
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("개발 언어 : " + language);
		System.out.println("개발 경력 : " + career);
	}
}
