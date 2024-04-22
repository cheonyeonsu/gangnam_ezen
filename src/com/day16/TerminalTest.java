package com.day16;


import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalTest {

	public static void main(String[] args) {
		//forEach()
		Stream<String> stream = Stream.of("하나","둘","셋","넷");
		stream.forEach(s->System.out.println(s));
		
		/* reduce() reduce() 메소드는 첫번째와 두번째 요소를 가지고 연산을 수행한 뒤 
		 * 그 결과와 세 번째 요소를 가지고 또 다시 연산을 수행함 */
		
		//스트림의 각 문자열 요소를 "++"기호로 연결하여 출력하기
		Stream<String> stream1 = Stream.of("하나","둘","셋","넷");
		Stream<String> stream2 = Stream.of("하나","둘","셋","넷");
		
		System.out.println("\n==========================");
		Optional<String> result = stream1.reduce((s1,s2)->s1 + "++" + s2);
		result.ifPresent(s->System.out.println(s));
		
		String result2 = stream2.reduce("시작", (s1,s2)->s1+"++");
		System.out.println(result2);
		
		//findFirst(),findAny() -> 해당 스트림에서 첫번째 요소를 참조하는 Optional 객체를 반환. 
		
		//스트림의 모든 요소를 정렬한 후, 첫번째 위치한 요소를 출력하기.
		IntStream stream3 = IntStream.of(4,2,7,3,5,1,6);
		IntStream stream4 = IntStream.of(4,2,7,3,5,1,6);
		IntStream stream5 = IntStream.of(4,2,7,3,5,1,6);
		
		System.out.println("\n==========================");
		OptionalInt result3 =stream3.sorted().findFirst();
		System.out.println(result3.getAsInt());
		
		OptionalInt result4 = stream4.sorted().findAny();
		System.out.println(result4.getAsInt());
		
		System.out.println("\n========sorted==========");
		IntStream sortStream = stream5.sorted();
		sortStream.forEach(n->System.out.println(n+ " "));
		
		
	}

}
