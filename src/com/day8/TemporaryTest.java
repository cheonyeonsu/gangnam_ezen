package com.day8;
//어제꺼 복습
import java.util.Scanner;

public class TemporaryTest {

	/*
    	main 에서
         사용자로부터 이름, 일한 시간, 시간당 급여를 입력 받아서
         생성자로 초기화
         급여계산 메서드 호출하여 급여를 계산한 후
         결과 출력

	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 근무 시간, 시급을 입력하세요.");
		String n = sc.nextLine();
		int t = sc.nextInt();
		int p = sc.nextInt();
		
		//생성자를 이용한 멤버변수 초기화
		Temporary tp= new Temporary(n,t,p);
		int salary = tp.salary();
		System.out.println("월급 : " + salary);
		
		//setter를 이용해 멤버변수 값 변경
		System.out.println("다른 직원의 이름, 근무시간, 시급을 입력하세요.");
		n= sc.nextLine();
		t = sc.nextInt();
		p = sc.nextInt();
		
		//빼먹지말기. 입력받은 값 넣어줌.
		tp.setName(n);
		tp.setTime(t);
		tp.setPay(p);
		
		salary = tp.salary();
		System.out.println("새로운 직원의 이름 : " + tp.getName());
		System.out.println("새로운 직원의 근무시간 : " + tp.getTime());
		System.out.println("새로운 직원의 이름 : " + tp.getPay());
	}

}
