package com.study;
//24.04.16 #9강 ppt 55p

/*class Employee
필드  : 이름
생성자, getter/setter
메서드  : 급여계산     findPay(){ return 0; }*/
class Employee{
	protected String name;
	
	//생성자
	public Employee(String name) {
		this.name=name;
	}
	
	//getter/setter
	public void setName(String name) {
		this.name=name;
	}
	public String setName() {
		return this.name;
	}
	
	//메서드
	public int findPay(){ 
		return 0; 
	}
}

/* class Permanent - 고용직
필드  : 기본급여(salary) 
생성자, getter/setter
 메서드  : 급여계산  findPay() => salary*/
class Permanent extends Employee{
	protected int salary;
	
	public Permanent(String name, int salary){
		super(name); //부모꺼 받아옴
		this.salary = salary;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public int findPay() {
		return salary;
	}
	
}

/*Class Temporary - 임시직
필드  : 일한시간(time), 시간당  급여(pay)
생성자, getter/setter
메서드  : 급여계산  => time*pay*/
class Temporary extends Employee{
	
	private int time;
	private int pay;
	
	public Temporary(String name, int time,int pay) {
		super(name); //부모꺼 받아옴
		this.time=time;
		this.pay=pay;
	}
	
	public void setTime(int time) {
		this.time=time;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setPay(int pay) {
		this.pay=pay;
	}
	
	public int getPay() {
		return pay;
	}
	
	//메서드
	public int findPay() {
		return time*pay;
	} 
}

/*Class SalesPerson – 판매직 : Permanent 클래스를 상속받음
필드  : 판매수익(earnings)
메서드  : 급여계산  => salary+(earnings*RATE): int로 형변환. 
RATE=0.15 : 상수선언*/
class SalesPerson extends Permanent{
	private int earnings;
	
	//생성자
	public SalesPerson(String name, int salary, int earnings) {
		super(name,salary);
		this.earnings = earnings;
	}
	
	
	public int findPay() {
		return (int)(salary+(earnings*RATE));  
	}
	
}
public class EmployeeExamClone {
	public static void main(String[] args) {
		
	}
}
