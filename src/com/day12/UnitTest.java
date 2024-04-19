package com.day12;
//#3

abstract class Unit{
	protected int x, y;		//현재 위치

	/** 지정된 위치로 이동 */
	public abstract void move(int x, int y);
	
	
	void stop(){/* 현재 위치에 정지 */}
}

class Marine extends Unit{		//보병	
	public void move(int x, int y){
		/** 지정된 위치로 이동 */
		this.x=x;
		this.y=y;
		System.out.println("보병이 " + x +", " + y +"위치로 이동한다.");
		
	}

	public void stimPack(){/* 스팀팩을 사용한다 */
		System.out.println("보병이 스팀팩을 사용한다.");
	}
}

class Tank extends Unit{		//탱크	
	public void move(int x, int y){/* 지정된 위치로 이동 */
		this.x=x;
		this.y=y;
		System.out.println("탱크가 " + x +", " + y+"위치로 이동한다.");
	}
	public void changeMode(){/* 공격모드를 변환한다 */
		System.out.println("탱크가 공격모드를 변환한다");
	}
}

class Dropship extends Unit{		//수송선
	public void move(int x, int y){/** 지정된 위치로 이동 */
		this.x=x;
		this.y=y;
		System.out.println("수송선을 " + x +", " + y+"위치로 이동한다.");
	}

	public void load(){/* 선택된 대상을 태운다 */
		System.out.println("수송선이 선택된 대상을 태운다");
	}

	public void unload(){/* 선택된 대상을 내린다 */
		System.out.println("수송선이 선택된 대상을 내린다.");
	}
}


public class UnitTest {
	public static void main(String[] args) {
		Marine m = new Marine();
		m.move(10, 20);
		m.stimPack();
		
		Unit u = new Marine();
		u.move(30, 40);
		
		u=new Tank();
		u.move(30, 40);
		
		u = new Dropship();
		u.move(30, 40);
		
		//unit배열 - 요소 3개를 담아 
		Unit[] uArr = new Unit[3]; //인덱스(위치) 말하는게 아니라 갯수.
		
		uArr[0] = new Marine();
		uArr[1] = new Tank();
		uArr[2] = new Dropship();
		
		//50.60 위치로 이동
		 for(int i=0; i<uArr.length;i++) {
			 uArr[i].move(50, 60); //부모의 참조변수[].move
	      }
			
		//몰라요 몰라!!!
		 for(Unit u2 : uArr) {
			 u2.move(50, 60);
		 }
		 
		}
		
}
	
