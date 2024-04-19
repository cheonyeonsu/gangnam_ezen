package com.day15;
//Dictionary,Alphabet 답안지. 꼭 보기. 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ExamMap {

	public static void main(String[] args) {
		HashMap<String, String> map 
			= new HashMap<String, String>();

		map.put("boy", "소년");
		map.put("girl", "소녀");
		map.put("school", "학교");

		Iterator<String> keyIter = map.keySet().iterator();
		while(keyIter.hasNext()) {
			String key=keyIter.next();
			String value=map.get(key);
			System.out.println(key+"=>"+ value);
		}

		//
		ArrayList<Character> list = new ArrayList<Character>();
		HashMap<Integer, Character> map2 
			= new HashMap<Integer,Character>();
		HashSet<Character> set = new HashSet<Character>();

		for (char i = 'A'; i <= 'Z'; i++){
			list.add(i);
			map2.put(i-65, i);//키가 0~25
			set.add(i);
		}

		System.out.println("-----ArrayList 이용-----");
		for(int i = 0; i < list.size(); i++){	
			char ch = list.get(i);
			System.out.print(ch +" ");
		}

		System.out.println();
		for(char ch:list){
			System.out.print(ch +" ");
		}

		System.out.println("\n\n-----HashMap 이용-----");
		for(int i = 0; i < map2.size(); i++){
			System.out.print(map2.get(i) +" ");
		}

		System.out.println("\n\n--------HashSet 이용--------");
		Iterator<Character> it=set.iterator();
		while(it.hasNext()){
			char d =it.next();
			System.out.print(d+" ");
		}

		System.out.println("\n\n--------HashMap iterator 이용--------");
		Iterator<Integer> itr=map2.keySet().iterator();
		while(itr.hasNext()){
			int key =itr.next();
			char ch = map2.get(key);
			System.out.print(ch +" ");
		}
	}

}
