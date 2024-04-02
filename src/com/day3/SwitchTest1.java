package com.day3;

public class SwitchTest1 {

	public static void main(String[] args) {
		/*
		Switch문
		- 비교할 조건이 많은 경우, 정해놓은 값을 가진 경우 사용
		 ** ==비교만 가능, 대소비교는 불가능
		- case 다음에는 상수만 사용 가능 : 변수, 범위 지정 X

		switch(제어변수){
			case 값1 :
			실행블록1;
			break;
			case 값2 :
			실행블록2;
			break;
			default:
			실행블록3
		}

		 > 제어변수의 값이 1이면 실행블록1을 수행하고
		 			  2이면 실행블록 2를 수행
		 			  그 외의 값이면 실행블록 3을 수행

			제어변수 : byte,short,int,char만 사용 가능
					jdk 7.0이상 : String도 사용 가능

			case 다음에는 상수만 쓸 수 있다. 변수나 범위 지정할 수 없다.		

		 */

		//if문
		int g=2;
		String result=""; //초기값 세팅
		if(g==1) {
			result="남자";
		}else if(g==2) {
			result="여자";
		}else {
			result="잘못입력!";
		}
		System.out.println(result);

		//switch문
		switch(g){
			case 1 :
				result="남";
				break;
			case 2 :
				result="여";
				break;
			default:
				result="잘못입력함!";
		}
		System.out.println(result);
		
		//or처리
		g=3;
		switch(g){
		case 1 :
		case 3 :
			result="남";
			break;
		case 2 :
		case 4 :
			result="여";
			break;
		default:
			result="잘못입력함!";
	}	
		System.out.println(result);
		
	}

}
