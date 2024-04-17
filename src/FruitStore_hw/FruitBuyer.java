package FruitStore_hw;

import com.day12_fruitStore.FruitSeller;

public class FruitBuyer {
	private int numOfApple; //구매한 사과 갯수
	private int myMoney; //남은 돈
	
	public FruitBuyer(int money) {
		this.myMoney=money;
	}
	
	public void setNumOfApple(int numOfApple) {
		this.numOfApple=numOfApple;
	}
	
	public int getNumOfApple() {
		return numOfApple;
	}
	
	public void setMyMoney(int myMoney) {
		this.myMoney=myMoney;
	}
	
	public int getMyMoney() {
		return myMoney;
	}
	
	//구매한 사과 갯수 구하는 매서드
	public void buyApple(FruitSeller seller,int money) {
		//사과를 구매하는 데 있어서 필요한 것 : 구매 대상, 구매 금액
		//int num =seller.saleApple(money); //아저씨.사과파세요.여기 돈이요.
		//numOfApple+=num; //사과 갯수는 늘고.
		myMoney-=money; //돈은 줄고 >> 판매자와 반대 상황
	}
	
//	public void showResult() {
//		System.out.println("\n=======구매자 정보=======");
//		System.out.println("현재 잔액 : " + myMoney);
//		System.out.println("사과 개수 : " + numOfApple);
//		
//	}
	
}
