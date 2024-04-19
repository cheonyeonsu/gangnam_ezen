package com.day7;

import java.util.Scanner;

// 메인 메서드에서는 입력을 받고 출력을 위주로 처리합니다.
public class ScoreTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 국어, 영어, 수학 점수를 입력받음
        System.out.println("국어, 영어, 수학 점수를 입력하세요");
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();

     
      /* Score 객체를 생성하고 입력받은 점수로 초기화. 
        객체 생성을 위해 new 키워드를 사용, 생성자에 국영수 점수 전달
        Score 클래스의 객체를 참조하기 위해 obj라는 참조 변수를 선언하고 초기화*/
        Score obj = new Score(kor, eng, math);
        
        // Score 객체의 정보를 출력합니다.
        System.out.println("obj=" + obj);

        // Score 객체의 총점과 평균을 계산하고 출력
        int sum = obj.findSum();
        float average = obj.findAverage();

        System.out.println("총점=" + sum + ", 평균=" + average);
        
        // Score2 객체를 생성하고 입력받은 점수로 초기화
        Score2 s = new Score2(kor, eng, math);
        
        // Score2 객체의 총점과 평균을 계산하고 출력
        s.findSum();
        s.findAverage();
        
        System.out.println("\n 총점=" + s.sum + ", 평균=" + s.average); 
    }
}
