package com.day14.thirteen;

import java.util.HashSet;
import java.util.Iterator;

/*
규칙이 있는 4개의 실수를 컬렉션에 저장하고 출력하기
 1. 배열 이용
 2. ArrayList 컬렉션 이용
        입력 - for문 이용
        출력 - for문, 확장 for
 3. HashSet 이용
        for문 이용해서 입력
        iterator() 이용하여 출력
*/
public class VectorTest2 {

	public static void main(String[] args) {
		//1 배열
		System.out.println("======배열로 출력하기======");
		String[] arr1;
		arr1 = new String[4];
		arr1[0] = "포메라니안";
		arr1[1] = "말티즈";
		arr1[2] = "리트리버";
		arr1[3] = "진돗개";
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		//3 hashset
		System.out.println("===hashset으로 출력하기===");
		HashSet<String>set = new HashSet<String>();
		set.add("포메라니안");
		set.add("말티즈");
		set.add("리트리버");
		set.add("진돗개");
		
		System.out.println("저장된 강아지 종류 : " + set.size());
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}

		
		
	}

}
