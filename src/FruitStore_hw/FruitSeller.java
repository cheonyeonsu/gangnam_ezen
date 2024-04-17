package FruitStore_hw;

class Exchange {
	//거스름돈, 사과 갯수 묶어서 출력. : 클래스로 묶기 
	private int count; //구매 사과개수 
	private int change; //잔돈
	
	public void setCount(int count) {
		this.count=count;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setChange(int change) {
		this.change=change;
	}
	
	public int getChange() {
		return change;
	}
	
}

public class FruitSeller {
	private int numOfApple; //가지고 있는 사과개수 (재고 )
	private int myMoney; //판매수익(남은 돈)
	private final int APPLE_PRICE; //생성자 초기화 하기 전까지는 error. 사과 하나의 가격.

	
	public FruitSeller(int money, int numOfApple,int price) {
		this.myMoney=money;
		this.numOfApple=numOfApple;
		APPLE_PRICE=price; //final상수 : 생성자에서 단 한번 초기화. 인스턴스별로 다른 값 할당. 
	}

	
	//사과 판매 메서드
	public int saleApple(int money, FruitBuyer fruitBuyer) {
		int num =money/APPLE_PRICE;//사과갯수 
		numOfApple-=num; //사과 갯수 줄고
		myMoney+=money; //돈은 늘어나고
		Exchange ex = new Exchange();
		
		if(money%APPLE_PRICE==0) {
			ex.setChange(0);
			ex.setCount(num);
		}else if(money%APPLE_PRICE!=0) {
			ex.setChange(money%APPLE_PRICE);
			ex.setCount(num);
		}else if(fruitBuyer.getMyMoney()<APPLE_PRICE) {
			System.out.println("금액이 부족합니다.");
			return 0;
		}
		//furitBuyer의 가진 돈 - (사과금액 * 사과갯수)
		fruitBuyer.setMyMoney(fruitBuyer.getMyMoney()-(APPLE_PRICE*num));
		fruitBuyer.setNumOfApple(fruitBuyer.getNumOfApple()+num);
		System.out.println("잔돈 :" +ex.getChange()+ ", 구매한 갯수 : " +ex.getCount());
		
		return num; //구매자에게 줄 사과개수
	}
	

	public void showResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : "+ myMoney + "\n");

	}
	
	}


	
