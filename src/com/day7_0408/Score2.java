package com.day7_0408;

// 점수를 나타내는 클래스 Score2 선언
public class Score2 {
    // 국어, 영어, 수학 점수를 저장할 변수 선언
    int kor;
    int eng;
    int math;

    // 총점, 평균을 저장할 변수 선언
    int sum;
    float average;

    // 생성자 선언
    // 매개변수로 국어, 영어, 수학 점수를 받아와서 멤버 변수에 저장
    // 원래 매개변수랑 멤버변수 이름 같으면 this쓰는데 여기는 아님.
    public Score2(int k, int e, int m){
        kor = k; //this.kor=k;
        eng = e;
        math = m;
    }

    // 총점을 구하는 메서드 선언
    public void findSum(){
        // 국어, 영어, 수학 점수를 모두 더하여 총점 계산 후 sum 변수에 저장
        sum = kor + eng + math; 
        // 우리집 식구니까 선언 안하고 넣어버려. 리턴도 안해도 ㄱㅊ> 리턴안하면 void로 바꿔주기. 
    }

    // 평균을 구하는 메서드 선언
    public void findAverage(){
        // 총점을 먼저 계산하고,
        findSum();
        // 평균 계산 후 average 변수에 저장
        average = sum / 3f;
    }
}
