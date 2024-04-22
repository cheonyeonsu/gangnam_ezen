package com.day16;
// 49p copy
public class mathTest {

	public static void main(String[] args) {
		System.out.println("abs(-27.5) : "+ Math.abs(-27.5));
		System.out.println("abs(27.5) : "+ Math.abs(27.5));
		System.out.println();
		/*
		-28		-27.3		-27		0		27.3			28
		-28		-27.6		-27		0		27	 	27.6	28
		*/
		
		System.out.println("ceil(-27.3):"+ Math.ceil(-27.3));
		System.out.println("ceil(27.3):"+ Math.ceil(27.3));
		System.out.println();
		
		System.out.println("floor(-27.6):"+ Math.floor(-27.6)); //음수 올림하면 오른쪽으로 가서 27
		System.out.println("floor(27.6):"+ Math.floor(27.6));
		System.out.println();
		
		
		System.out.println("round(34.5374):"+ Math.round(34.5374)); //반올림(소수1째 자리에서)
		System.out.println();
		
		System.out.println("Math.E: "+ Math.E);
		System.out.println("Math.PI: "+ Math.PI );
		System.out.println();
	}
		}