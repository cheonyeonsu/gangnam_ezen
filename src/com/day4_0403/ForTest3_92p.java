package com.day4_0403;

import java.util.Scanner;

public class ForTest3_92p {

	public static void main(String[] args) {
		//실습[1] 사용자로부터 하나의 숫자를 입력받아 그 수만큼 3의 배수를 출력하시오
				Scanner sc = new Scanner(System.in);
				System.out.println("3의 배수의 갯수를 입력하세요.");
				int n = sc.nextInt();
				
				
				for(int i=1; i<=n ;i++) {
					//현재 순서의 3의 배수를 계산하여 출력
					System.out.print(3*i+"\t");
				}//for
				System.out.println();
				
			}
 //forexam2에 코드 있음. 
	
	}


