package com.day16;
//연습해보기
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Exam {

	public static void main(String[] args) {
		//list, set, map에 짝수 5개 저장

		//기존방식으로 출력- for, iterator

		//forEach()-람다식 이용

		//list, set, map에 짝수 5개 저장
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i=0;i<5;i++) {
			list.add(i*2);
			set.add(i*2);
			map.put(i,i*2);
		}


		//기존방식으로 출력- for, iterator
		System.out.println("\n========list 출력=======");
		for(int n : list) {
			System.out.println(n + " ");
		}


		System.out.println("\n========set 출력=======");
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}

		System.out.println("\n========map 출력=======");
		Iterator<Integer> iter2 = map.keySet().iterator();
		while(iter2.hasNext()) {
			int key = iter2.next();
			System.out.println(key + "=> " + map.get(key));
		}

		//forEach()-람다식 이용
		System.out.println("\n========람다식(list) 출력======");
		list.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		System.out.println("\n========람다식(set) 출력======");
		set.forEach(n -> System.out.print(n + " "));
		System.out.println();

		System.out.println("\n========람다식(map) 출력======");
		map.forEach((k, v) -> System.out.println(k + "=>"+v));

	}

}

