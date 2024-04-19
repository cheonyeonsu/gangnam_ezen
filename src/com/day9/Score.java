package com.day9;
//ppt 72p 국영수 과목을 배열로 받음. 
public class Score {
		//멤버변수
		//과목배열
		private int[] subject; //국,영,수
		
		//생성자
		public Score(int[] subject) {
			 this.subject=subject;
		}
		
		//getter,setter
		public int[] getSubject() {
			return subject;
		}
		
		public void setSubject(int[] subject) {
			this.subject=subject;
		}
		
		//매서드
		public int findSum() {
			int sum =0;
			for(int i=0; i<subject.length;i++) {
				sum+=subject[i];
			}
			return sum;
		}
		
		public double findAverage() {
			return findSum()/3.0;
		}
}
