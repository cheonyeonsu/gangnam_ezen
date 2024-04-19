package com.day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StrLenComComparator implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		
		//return str1.length() - str2.length();
		
		if(str1.length()>str2.length()) {
			return 1;
		}else if(str1.length()>str2.length()){
			return -1;
		}else {
			return 0;
		}
	}
	
	
}
public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>(new StrLenComComparator());
		tset.add("Orange");
		tset.add("Apple");
		tset.add("dog");
		tset.add("individual");
		
		Iterator<String> iter = tset.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}

}
