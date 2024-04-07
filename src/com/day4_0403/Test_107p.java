package com.day4_0403;

public class Test_107p {

	public static void main(String[] args) {

		/*[1]
		 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수(2
		 의 배수도 아니고, 3의 배수도 아닌 수)의 총합을 구하시오
		  */
		int sum = 0;
		for(int i=1;i<=20;i++) {
			if(i%2!=0 || i%3!=0) {
				sum+=i;
			}
		}System.out.println(sum);
		
		/*[2]
		 1+(1+2)+(1+2+3)+(1+2+3+4)+... +(1+2+3+...+10)의 결과를 계산하시오. */
		
		
		/*[3]
		 두개의주사위를던졌을때,눈의합이6이되는모든경 우의 수를 출력하는 프로그램을 작성하시오.
		중첩 for문 이용
		 */


	}

}
