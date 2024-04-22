package com.day16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncInterfaceTest2 {

	public static void main(String[] args) {
		List<String> list 
			= Arrays.asList("abc","aaa","bbb","ddd","aaa");
		
		Collections.sort(list, new Comparator<String>() {

			@Override //단축키 : alt+s
			public int compare(String s1, String s2) {
				
				return s1.compareTo(s2);
			}
			
		});
		
		for(String s:list) {
			System.out.println(s);
		}
			
		
		//
		List<String> list2 
		= Arrays.asList("abc","aaa","bbb","ddd","aaa");
		
		Collections.sort(list2,(s1,s2)->s1.compareTo(s2));
		System.out.println("\n===========람다식 이용============");
		for(String s:list) {
			System.out.println(s);
		}
	}

}
