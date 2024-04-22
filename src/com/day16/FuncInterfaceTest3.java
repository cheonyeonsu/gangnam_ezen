package com.day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.DoubleUnaryOperator;

public class FuncInterfaceTest3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<7;i++) {
			list.add(i+1);
		}
		
		//기존 방법
		for(int n : list) {
			System.out.println(n);
		}
		
		System.out.println("\n===========람다식 이용===========");
		list.forEach(n->System.out.println(n+" "));
		System.out.println("\n-----------------------------");
		
		list.removeIf( x-> x%2 ==0 || x%3==0);
		list.forEach(n->System.out.println(n+" "));
		
		System.out.println("\n-----------------------------");
		list.replaceAll(i->i*10);
		list.forEach(n->System.out.println(n+" "));
		
		System.out.println("-----------------------------");
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"java");
		map.put(2,"oracle");
		map.put(3,"spring");
		
		//기존 방법
		Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			int key=iter.next();
			String val =map.get(key);
			System.out.println(key+"=>"+val);
		}//while
		
		//람다식 이용
		System.out.println("\n=============");
		map.forEach((k,v)->System.out.println(k+"=>"+v));
		//void java.util.HashMap.forEach(BiConsumer<? super Integer, ? super String> action)
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(11);
		set.add(13);
		set.add(19);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("\n-----------------------------");
		set.forEach(n->System.out.println(n+" "));
		//void java.lang.Iterable.forEach(Consumer<? super Integer> action)
		
		//메서드 참조
		System.out.println("-----------------------------");
		DoubleUnaryOperator oper
		= (n) -> Math.abs(n);
		System.out.println(oper.applyAsDouble(-5));
		
		oper=Math::abs; //메서드 참조
		System.out.println(-51);
		
		System.out.println("\n-----------------------------");
		set.forEach(System.out::println);//메서드 참조
	}

}
