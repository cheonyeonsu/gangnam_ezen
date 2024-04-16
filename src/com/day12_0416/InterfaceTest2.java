package com.day12_0416;


/*인터페이스끼리의 상속도 가능 - extends 키워드 이용, 다중상속 가능. */

interface Attackable{
	/** 지정된 대상(unit)을 공격하는 기능*/
	public abstract void attacl(Unit2 unit);
}

interface Moveable{
	/**지정된 위치(x,y로 이동하는 기능)*/
	void move(int x, int y);
}

//인터페이스 끼리의 상속
interface Fightable extends Attackable, Moveable{

}

abstract class Unit2{
	protected int x; //유닛의 위치(x좌표)
	protected int y; //유닛의 위치(x좌표)
	protected int currentHp; //유닛의 체력

	Unit2(int x, int y, int currentHp){
		this.x=x;
		this.y=y;
		this.currentHp=currentHp;
	}
}

//Fighter는 Unit2를 상속받고, Fightable인터페이스임
class Fighter extends Unit2 implements Fightable{

	//생성자 만들기
	Fighter(int x, int y, int currentHp) {
		super(x, y, currentHp);

	}

	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+","+y+"위치로 이동합니다.");
	}

	public void attack(Unit2 u) { 
		System.out.println(u.x+ "," +u.y+" 위치에 있고,"+u.currentHp+"의 체력을 갖는 유닛을 공격합니다.");
	}

	@Override
	public void attacl(Unit2 unit) {
		// TODO Auto-generated method stub

	}


}


public class InterfaceTest2 {

	public static void main(String[] args) {
		Fighter f = new Fighter(10,20, 300);
		f.move(40, 50);

		//40,50 위치에 있고 체력이 200인 유닛을 공격하고 80,90 위치로 이동 
		Unit2 u = new Fighter(40,50,200); //나 말고 새로운 유닛 만듦.
		f.attack(f);
		f.move(80, 90);
		f.attack(new Fighter(80,90,150));

		//자식은 부모의 인스턴스이기도 함
		//자식은 instanceod 부모 > true
		System.out.println("f instanceof Unit2"); //true

		if(f instanceof Unit2) {
			System.out.println("f는 Unit2의 인스턴스이다.");
		}if(f instanceof Fightable) {
			System.out.println("f는 Fightable를 구현했다.");
		}if(f instanceof Moveable) {
			System.out.println("f는 Moveable 인터페이스를 구현했다.");
		}if(f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스를 구현했다.");
		}if(f instanceof Object) {
			System.out.println("f는 Object의 인스턴스이다.");}}}