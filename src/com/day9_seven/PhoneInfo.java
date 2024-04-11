package com.day9_seven;

/*
배열을 이용해서, 프로그램 사용자가 입력하는 정보가 최대 100개 
까지 유지되도록 변경하기
다음의 기능을 추가
저장- 이름, 전화번호, 생년월일 정보(PhoneInfo 객체)를 배열에 저장
전체조회 - 모든 사람들의 데이터를 출력한다.
 */

public class PhoneInfo {

	private String name,phone,birth;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setBirth(String birth) {
		this.birth=birth;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
		System.out.println("birth : " + birth);
	}
	
	public PhoneInfo(String name, String phone, String birth) {
	    this.name = name;
	    this.phone = phone;
	    this.birth = birth;
	}
}
