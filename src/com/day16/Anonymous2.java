package com.day16;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anonymous2 extends Frame{ 
	Button btn;	

	public Anonymous2(){
		btn=new Button("close");
		add(btn,"South");	
		/* 1. 익명 클래스로 바꾸기 : btn.addActionListener(new EventHandler()) 
		 * 익명 클래스 : 이름이 없음 >생성자를 가질 수 없음. 
		 * 			 '클래스의 선언'과 '객체 생성'을 '동시에' 함. > 단 한번 사용 가능.*/
		  btn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });
		
		/* 2.람다식으로 : 기존의 불필요한 코드 줄여줌. 작성된 코드 가독성 높여줌. 
		 * 타입 생략, 매개변수 하나이면 괄호 생략, 명령문 여러개면 {}생략(;는 사용안함) 
		 * return문만으로만 이루어진 경우 {}을 생략하지못함. return문 대신 표현식 사용 가능. */
		  btn.addActionListener(e -> System.exit(0));
		
		
	} //생성자

	public static void main(String[] args){
		Anonymous2 a=new Anonymous2();
		a.setSize(300,300);
		a.setVisible(true);
	}//main

	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}//내부 class
}//class
