package com.day14.thirteen;
/*
HashSet - Set 인터페이스 구현 클래스
- 순서 유지되지 않고, 중복 허용하지 않는다. 
*/

import java.util.HashSet;
import java.util.Iterator;

public class SetTest1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		//저장
		set.add("first");
		set.add("second");
		set.add("third");
		set.add("first");
		
		System.out.println("저장된 데이터 수 : "+ set.size());
		
		//읽어오기
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}//while
		
		/*
		Iterator 인터페이스
		- 컬렉션에 저장된 각 요소에 접근하는 기능을 가짐
		
		Iterator<String>iterator()
		-Collection인터페이스에 있는 iterator()메서드가 Iterator 인터페이스를 리턴해줌. 
		
		 Iterator 인터페이스에 있는 hasNext(),next()메서드를 이용하여 컬렉션에 저장된 각 요소의 값을 읽어올 수 있다. 
		 */
		
	}

}
