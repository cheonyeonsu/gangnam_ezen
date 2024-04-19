package com.day15;
//13장 컬렉션 ppt 35

import java.util.HashMap;


/*
boy=>소년
girl =>소녀
school => 학교 출력하기
*/
public class Dictionary {

	public static void main(String[] args) {
		
		//영단어가 key, 한국어가 value
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1,"소년");
		hashMap.put(2,"소녀");
		hashMap.put(3,"학교");
		
		System.out.println("boy"+"=>"+ hashMap.get(1));
		System.out.println("girl"+"=>"+ hashMap.get(2));
		System.out.println("school"+"=>"+ hashMap.get(3));
	}

}
