package com.day8_0409;
//어제꺼 복습
public class Temporary {

	/*
	 * 임시직 클래스 정의 (Temporary)  
	 * 멤버변수 : 이름(name), 일한시간(time), 시간당 급여(pay)  
	 * 생성자, getter/setter  
	 * 메서드 : 급여를 계산하는 메서드  => 일한시간 * 시간당 급여
	 */
	
	//멤버변수 : private생략X
	private String name;
	private int time;
	private int pay; //시급
	
	
	//생성자
	//생성자이름은 클래스명과 같다. 
	public Temporary(String name,int time,int pay) {
		this.name=name;
		this.time=time;
		this.pay=pay;
	}
	
	//게터세터 : set은 생성자랑 같으니 값을 할당해줌. 
			//get은 리턴값 있으니 자료형. 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time=time;
	}
	public int getPay() {
		return pay;
	}
	
	public void setPay(int pay) {
		this.pay=pay;
	}
	
	
	//매서드 : 급여 계산 . 매개변수로 가져와서 멤버변수에 저장.
	public int salary() {
		return time*pay;
	}
}
