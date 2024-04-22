package com.day16;

@FunctionalInterface
interface Calc{ //함수형 인터페이스 선언
	public int min(int x, int y);
}

public class FuncInterfaceTest {

	public static void main(String[] args) {
		Calc c = new Calc() {
			@Override
			public int min(int x, int y) {
				return x<y?x:y;
			}
		};
		
		System.out.println(c.min(7, 2));
		
		//람다식 이용 : 자료형, {}, return 다 지움
		Calc m = (x,y)->x<y?x:y;
		System.out.println(m.min(6, 9));
	}

}
