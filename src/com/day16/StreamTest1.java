package com.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(7);


		//컬렉션에서 스트림 생성
		Stream<Integer> stream = list.stream();

		/*
		 * forEach()메서드를 이용한 스트림 요소의 순차접근 같은 스트림으로는 forEach메소드 한번밖에 호출 안됨.
		 * Stream.forEach(n->System.out.println(n));
		 */
		
		System.out.println("\n-----");
		stream=list.stream();
		stream.forEach(n->System.out.println(n));
		
		//배열
		String[] arr = {"자바","스프링","오라클","html"};

		//배열에서 스트림 생성
		Stream<String> Stream2 = Arrays.stream(arr);
		Stream2.forEach(s->System.out.println(s));
		
		System.out.println("\n-----");
		//배열의 특정 부분만을 이용한 스트림 생성
		Stream<String> stream3 =Arrays.stream(arr,1,3);
		stream3.forEach(System.out::println);
		
	}
}
