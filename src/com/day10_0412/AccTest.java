package com.day10_0412;
//ppt 65p
import java.util.Scanner;

class Acc{

	public static final double INTEREST_RATE = 0.03; //이자율
	
	public int findInterest(int money) {
		return (int)(money*INTEREST_RATE);
	}
	
}

public class AccTest {

	public static void main(String[] args) {
		System.out.println("이자율은 2%입니다.얼마를 입금하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		System.out.println("====================================");
		
		Acc a = new Acc();
		int interest = a.findInterest(money);

		System.out.println("원금 : " + money +"원, 이자율 : " 
			+ Acc.INTEREST_RATE 
			+ ", 이자 : " + interest+"원");
	}


	}


