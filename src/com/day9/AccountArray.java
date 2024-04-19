package com.day9;
//3+1
public class AccountArray {

	public static void main(String[] args) {
		
		/*
		<객체를 배열에 저장> 
		- int 배열에는 int 넣넣
		- 객체는 new로 생성해서 넣넣 > 배열에 주소들어감
		*/
		
		//int배열
		int[] arr = new int[2];
		arr[0]=10;
		arr[1]=30;
		
		//클래스배열 - Account 배열
		
		//1. 배열에 Account객체를 생성해서 넣는다. 
		Account[] accList = new Account[3];
		accList[0]= new Account("100-001-2000", 50000);
		accList[1]= new Account("100-001-3000", 100000);
		
		Account acc = new Account("100-001-4000", 200000);
		accList[2]=acc;
		
		/*
		  객체 생성 > 메서드 호출 
		  Account acc2 = new Account("500-001-7000", 300000);
		  acc2.display();
		 */

		//2. 배열에 들어있는 객체의 메서드를 호출한다. 
		/*
		accList[0].display();
		accList[1].display();
		accList[2].display(); */
		
		for(int i=0;i<accList.length;i++) {
			accList[i].display();
		} //for 
	}

}
