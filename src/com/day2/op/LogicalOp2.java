package com.day2.op;

public class LogicalOp2 {

	public static void main(String[] args) {
		int p=0, q=1;
	      if( (p++==0) | (q++==2 ) ) {
	         System.out.println("p="+p+", q="+q);
	         p=42;
	      }
	      
	      // |는 앞에 참이여도 실행. ||가 안함. 
	      
	      System.out.println("p="+p+", q="+q+"\n"); 
	      p=0; q=1;

	      if( (p++==0) || (q++==2 ) ) {
	         System.out.println("p="+p+", q="+q);
	         p=42;
	      }
	      
	      System.out.println("p="+p+", q="+q); 

	}

}
