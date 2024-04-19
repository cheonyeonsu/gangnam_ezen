package com.day15.string;

public class StingTest2 {

	public static void main(String[] args) {
		String str="hello java!";
		String s=str.replace("java", "spring");
		System.out.println(s);
		System.out.println(str); //String -불변
		
		s=str.replace('h', 'H');
		System.out.println(s);
		
		System.out.println("\n=================");
		str="java,spring,oracle,html";
		String[] arr=str.split(","); //,를 구분자로 나눈다. 
		for(String ss :arr) {
			System.out.println(ss);
		}
		
		System.out.println("\n=================");
		str="java.spring.oracle.js";
		String[] arr2 = str.split("\\.");
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}

		
	}

}
