package com.day6;

import java.util.Scanner;

public class ArrayTest_48p {

	public static void main(String[] args) {
		 /*
        길이가5인double형배열을선언하여 0보다 큰실수 5개를 입력받아서 저장하고, 
        이렇게 저장된 값을 은행 고객의 잔고(balance)라고 가정하자.(5명의 고객 잔고를 배열에 저장한 것)
        
        사용자로부터 이자율을 입력 받고, 배열에 저장된 모든 값을 이자율 만큼씩 증가시키고, 증가된 결과를 출력한다
        예) 이자율이 2.5가 입력되면, 이율이 2.5% 라는 뜻으로 해석되어 배열에 저장된 모든 값을 2.5%씩 증가시킨다
         */

        //길이가 5인 double 배열을 선언
        double[] balances = new double[5]; 

        //스캐너 생성, 고객 잔고 입력받
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++) {
            System.out.println("고객"+(i+1)+"의 잔고를 입력하세요."); 
            double balance = sc.nextDouble();

            // 배열에 입력된 잔고 저장
            balances[i] = balance;
        }

        System.out.println("이자율을 입력하세요.");
        double interestRate = sc.nextDouble();

        
        for (int i = 0; i < 5; i++) {
            balances[i] *= (1 + interestRate / 100);
        }

        System.out.println("이자율이 적용된 고객들의 잔고:");
        for (int i = 0; i < 5; i++) {
            System.out.println("고객 " + (i + 1) + "의 잔고: " + balances[i]);
        }

        sc.close();
    }
}