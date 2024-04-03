package com.day4_0403;

public class ScopeTest_73p {

	public static void main(String[] args) {
		/* #변수의 범위(Scope)
	      - 지역변수는 해당 블록을 벗어나면 소멸함
	      - 매서드에서 선언된 변수는 해당 메서드가 종료되면 소멸
	      - if나 for문 안에서 선언된 지역변수는 해당 if나 for문을 벗어나면 소멸
		 */
		
	      int a=10; //main() 메서드내에서 사용. 
	      System.out.println(a);

	      for (int i=0; i<3 ; i++ ){    //for(int a=0; a<3; a++) 사용 불가. a가 main매서드 내 살아있으므로.
	         System.out.print("hello!  ");
	         System.out.println(a);
	      }//for

	      for(int i=0; i<3; i++){   
	         int n=20;
	         System.out.println("i=" + i + ", n=" + n);
	      }//for

	      // System.out.println(i);  //에러
	      // System.out.println(n);  //에러
	      
	      //for문 이용해 알파벳 소문자(a~z)출력하기 a~z : 97~122
	     //[1]
	      int start =(int)'a';
	      int end = (int)'z';
	      for(int i = start; i<=end; i++) {
	    	  System.out.print((char)i);
	    	  if(i<end) {
	    		  System.out.print(",");
	    	  }
	      } System.out.println();
	      
	      
	      
	      } 
	      
	   }


	


