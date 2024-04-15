package com.day11_0415;

//기존의 클래스로부터 공통된 부분을 뽑아내어 부모클래스를 만들어 보자
class Unit{
	protected int x, y;		//현재 위치

	public void move(int x, int y){	/* 지정된 위치로 이동 */
		//자식클래스에서 오버라이딩해야 함
	}

	void stop(){/* 현재 위치에 정지 */}
}

class Marine extends Unit{		//보병	
	public void move(int x, int y){/* 지정된 위치로 이동 */
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
	public void move(int x, int y){/* 지정된 위치로 이동 */
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
		//Unit 배열 만들어서 4개의 요소 넣기
		Unit[] uArr = new Unit[4];
		uArr[0] = new Marine();
		uArr[1] = new Tank();
		uArr[2] = new Dropship();
		uArr[3] = new Marine();

		//Unit 배열의 모든 유닛을 좌표(100,200)의 위치로 이동한다. 
		for(int i=0; i< uArr.length;i++){
			uArr[i].move(100, 200);
		}
		System.out.println("===========downCasting============");
		//다운캐스팅 이용 - 자식만의 메서드 호출
		for(int i=0; i< uArr.length;i++) {
			//u[i].stimPack();
			if(u[i] instanceof Marine) {
				Marine m =(Marine)u[i];
				m.stimPack();
			}else if(u[i] instanceof Dropship) {
				Dropship d = (Dropship)u[i];
				d.load();
				d.unload();
			}
			System.out.println();
		}//for
		System.out.println("\n===============================");
		for(Unit unit :u) {
			if(u[i] instanceof Marine) {
				Marine m =(Marine)unit
				m.stimPack();
			}else if(u[i] instanceof Tank) {
				Dropship d = (Dropship)u[i];
				d.load();
				d.unload();
		}
	}
}
