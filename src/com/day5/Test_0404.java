package com.day5;

import java.util.Scanner;

public class Test_0404 {
	public static void main(String[] args) {
		 /*
        컴퓨터는 1~100 중 random하게 하나의 숫자를 뽑는다 
        => 메서드로 만들기
       사용자가 숫자를 입력 맞추면 “정답입니다” 틀리면 “좀 더 작은 수를 입력하세요”, “큰 수를 입력하세요” 입력기회를 4회로 제한  */
    
    int answer=rnd2(100,1);
    System.out.println(answer);
    
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


