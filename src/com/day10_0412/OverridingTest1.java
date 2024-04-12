package com.day10_0412;

class Points{
	//2차원 좌표계
	protected int x;
	protected int y;
	
	//생성자
	Points(int x, int y){
		//super();
		this.x=x;
		this.y=y;
	}
	
	public String findLocation() {
		String result="x="+x+", y="+y;
		return result;
	}
}//class

class Points3D extends Points{
	//3차원 좌표계
	private int z;
	
	//자식 생성자 : 부모생성자 매개변수 체크해서 있으면 super 이용해서 가져옴 > 자식 객체 생성할 때 값 들어감. 
	Points3D(int x, int y,int z){
		super(x,y); //생성자 첫 줄에는 생성자[this()나 super()이용]를 호출해야 한다.
					//그렇지 않으면 컴파일러가 자동으로 super()를 생성자의 첫줄에 삽입한다. 
		this.z=z;
	}
	
	/*
	부모 생성자가 매개별수를 가지고 있다면 
	자식은 부모의 생성자에게 매개변수를 넣어줘야 함 - super(매개변수)이용
	*/
	
	
	//메서드 오버라이딩 : 내용만 변경 - 선언부는 같아야 함. 
	public String findLocation() { 
		//부모 메서드의 내용을 변경했다
		//String result="x="+x+", y="+y+", z="+z;
		
		//원래 내용에 더 추가하고 싶을 때 : 부모 매서드 호출 + 추가 내용
		String location = super.findLocation(); //부모 매서드 호출
		String result = location + ", z="+z;
		return result;
		
		/*
		오버라이딩 메서드에서 부모 메서드의 내용에 추가적으로 작업을 덧붙이는 경우라면 
		super를 사용해서 부모메서드를 포함시키는 것이 좋다.
		super.부모메서드();
		 
		*/
	}
}//class


	/*
	 [1] super.멤버
	 	- 부모의 멤버를 참조하는 super
	 	- 자식 클래스에서 부모로부터 상속받은 멤버를 참조하는데 사용되는 참조변수
	 	- 부모의 멤버와 자신의 멤버를 구별하는 데 사용됨
	 	- this나 super는 static 메서드에서는 사용불가.
	 [2] super()
	 	- 부모 생성자를 호출하는 super()
	 */

public class OverridingTest1 {
	public static void main(String[] args) {
		Points3D p = new Points3D(10,20,30);
		String r=p.findLocation();
		System.out.println("3차원 좌표:" + r);
		
		Points p2 = new Points(40,50);
		r=p2.findLocation();
		System.out.println("2차원 좌표:" + r);
		
	}

}


