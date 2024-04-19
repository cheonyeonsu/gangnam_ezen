package com.day15;
//13장 컬렉션 ppt 36
/*알파벳을 각 컬렉션에 넣고, 출력하기
for문 이용하여 저장하고, 출력
ArrayList – 출력시 for, 확장 for
HashMap – 출력시 Iterator, for
HashSet 이용 – 출력시 Iterator*/

import java.util.ArrayList;

public class Alphabet {

	public static void main(String[] args) {
		System.out.println("-------ArrayList 이용-------");
		ArrayList<Character> list = new ArrayList<Character>();
		
		for(char i='A'; i<'Z'; i++){
            list.add(i);
      }
		
		for(char c:list) {
			System.out.println(c + "");
		}
		System.out.println();
	}

}
