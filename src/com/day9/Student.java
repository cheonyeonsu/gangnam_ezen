package com.day9;
//5+1
class Student{
	private String name;
	private int idNo;
	
	//생성자
	public Student(String name,int idNo) {
		this.name=name;
		this.idNo=idNo;
	};
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setIdNo(int idNo) {
		this.idNo=idNo;
	}
	public int getIdNo() {
		return idNo;
	}
	
	//출력매서드
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + idNo);
	}
}