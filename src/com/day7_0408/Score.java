package com.day7_0408;

public class Score {
	
		int kor;
		int eng;
		int math;

		//생성자
		public Score(int k, int e, int m){
			this.kor = k;
			this.eng = e;
			this.math = m;
			
			System.out.println("this="+this);
			
			/*
			 this - 자기 자신을 가리키는 this
			 	  - 자신의 멤버를 가리키는 this(>this.멤버<의 형식)
			 	  - 인스턴스 자신을 가리키는 참조변수
			 	  - 인스턴스의 주소가 저장됨
			 */
		}

		//총점, 평균을 구하는 메서드
		public int findSum(){
			int sum = kor+eng+math;
			return sum;
		}

		public float findAverage(){
			int sum = findSum();
			return sum/3f;
		}
	}


