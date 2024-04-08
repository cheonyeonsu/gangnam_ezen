package com.day7_0408;

import java.util.Scanner;

class Person{
	//1.멤버변수
	private String name;
	private int age;
	private String phone;
	
	//2.생성자
	
	/*객체 생성하기 전 단계의 주소를 this. 할당되는 순간 this에게 할당된 메모리의 참조값을 넘겨줌. */
	Person(String name,int age,String phone){
		this.name=name;
		this.age=age;
		this.phone=phone;
		}
		
		//3.게터세터
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public String getPhone() {
			return phone;
		}
		
		public void setPhone(String Phone) {
			this.phone=phone;
		
	}
	
	
	//4.메서드
	public void showinfo() {
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phone);
		System.out.println("나이 : "+age+"\n");
	}

}

public class PersonTest {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름,전화번호,나이 입력!");
		String name = sc.nextLine();
		String phone = sc.nextLine();
		int age = sc.nextInt();
		
		Person p = new Person(name,age,phone);
		p.showInfo();
		
		//멤버변수 값 변경 - setter이용
		p.setAge(25);
		p.setName("김길수");
		p.setPhone("010-8000-9000");
		
		System.out.println("이름 : " +p.getName());
		System.out.println("전화번호 : " +p.getPhone());
		System.out.println("나이 : " +p.getAge());
}}
