package com.day5_0404;
//클론코딩 해보기. <<선생님 코드임>>
import java.util.Scanner;

public class CompareNumber {

   public static void main(String[] args) {
      /*
          컴퓨터는 1~100 중 random하게 하나의 숫자를 뽑는다 
          => 메서드로 만들기 사용자가 숫자를 입력 맞추면 “정답입니다”
         틀리면 “좀 더 작은 수를 입력하세요”, “큰 수를 입력하세요”
         입력기회를 4회로 제한
       */
      
      //public static double random()
      /*
       0.0 ~ 1.0 범위의 임의의 double값을 반환
       0.0 <= x < 1.0
       
       예) 1~100 사이의 임의의 정수 구하기
       1. 각 변에 100을 곱한다
          0.0*100 < x <= 1.0*100
       
       2. 각 변에 1을 더한다
          1.0 <= x < 101.0
          
       3. int형으로 형변환한다
          1 <= x < 101
          
          int num = (int)(Math.random()*100+1);
      */
      //랜덤값 뽑기 - 정답
      //int answer = (int)(Math.random()*100+1);
      //int answer=rnd();
      int answer=rnd2(100,1);
      System.out.println(answer);
      
      //4번 반복
      //1~100사이의 숫자 입력 받기
      //정답인지, 너무 큰지, 작은지 체크
      //출력
      
      Scanner sc = new Scanner(System.in);
      for(int i=0;i<4;i++) {
         System.out.println("1~100사이의 정수를 입력!");
         int num=sc.nextInt();
         
         if(num==answer) {
            System.out.println("정답입니다.");
            break;
         }
         
         if(i==3) {
            System.out.println("실패! 다음 기회에!!");
         }else {
            if(num>answer) {
               System.out.println("너무 큽니다. 작은 수를 입력하세요");
            }else {
               System.out.println("좀 더 큰 수를 입력하세요");
            }
         }
      }//for
      
      System.out.println("==== end ====");
   }//main

   public static int  rnd() {
      int answer = (int)(Math.random()*100+1);
      return answer;
   }
   
   public static int  rnd2(int start, int end) { //1, 4
      //swap
      if(start>end) {
         int temp=start;
         start=end;
         end=temp;         
      }
      
      int answer = (int)(Math.random()*(end-start+1)+start);
      
      return answer;
   }
}