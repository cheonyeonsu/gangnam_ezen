package com.day15;

import java.util.HashMap;
import java.util.Iterator;


/*
HashMap : Map<K,V>인터페이스를 구현하는 클래스
- 키와 값을 쌍으로 하여 저장하는 자료구조
- 키는 중복 허용 안함
- 값은 중복 가능
- 순서 유지되지 않음
*/
public class Maptest {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();

		//저장 
		map.put(3, "홍길동");
		map.put(8, "김길동");
		map.put(19, "이길동");
		
		System.out.println("8번 학생 : " + map.get(8));
		
		map.remove(8); //제거 - 키가 8인 데이터 삭제
		
		//읽어오기
		//Set<Integer> kset = map.keySet();
		//Iterator<Integer> iter=kset.iterator();
		
		//위의 두줄을 한 줄로 합침
		Iterator<Integer> keyIter =map.keySet().iterator();
		
		while(keyIter.hasNext()) {
			int key = keyIter.next();
			String value= map.get(key);
			
			System.out.println("key="+key+", valu=" + value);
		}//while
	}

}
