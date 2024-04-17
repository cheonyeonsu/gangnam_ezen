package com.day12_fruitStore;

//사과갯수와 거스름돈을 담을 클래스
public class FruitResult {
	private int num; //사과 개수 2
	private int change; //거스름돈 1000
	
	//source 가서 자동생성
	public FruitResult() {
		super();
		
	}

	//생성자
		public FruitResult(int num, int change) {
			super();
			this.num = num;
			this.change = change;
		}
	
	//getter setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}


	
	
	
	
}
