package com.day7_0408;
//선생님 코드임. 꼭 다시 해보기. 
public class Score2 {
	int kor;
	int eng;
	int math;

	//총점, 평균(결과값)도 멤버변수로.
	int sum; 		//총점
	float average; //평균. 
	
	//생성자
	public Score(int k, int e, int m){
		kor = k;
		eng = e;
		math = m;
	}

	//총점, 평균을 구하는 메서드
	public void findSum(){
		sum = kor+eng+math; 
		//우리집 식구니까 선언 안하고 넣어버려. 리턴도 안해도 ㄱㅊ> 리턴안하면 void로 바꿔주기. 
		
	}

	public void findAverage(){
		findSum();
		average=sum/3f;
}}
