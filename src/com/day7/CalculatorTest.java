package com.day7;

import java.util.Scanner;

//#6
public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 실수를 입력하세요.");			
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		Calculator ca = new Calculator();
		double result = ca.add(a, b);
	      
	      System.out.println("a=" +a +",b="+ b);
	      System.out.println("a+b = "+ result);
	      System.out.println("a-b = "+ ca.subtract(a, b));
	      System.out.println("a*b = "+ ca.multiply(a, b));
	      System.out.println("a/b = "+ ca.divide(a, b));

		
	}

	
	}

