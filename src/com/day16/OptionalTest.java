package com.day16;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalTest {

	public static void main(String[] args) {
		//Optional객체를 사용하면 예상치못한 NUllpointerException 예외를 제공되는 메소드로 간단히 회피할 수 있다. 
		Optional<String> opt = Optional.ofNullable("Optional객체");
		System.out.println(opt.get());
		
		//값이 있으면 가져와라. 
		if(opt.isPresent()) {
			Optional.ofNullable(null);		
		}
		
		
		Optional<String> opt2 = Optional.ofNullable(null);
		
		//ofNullable은 null일 수도 있기때문에 if문으로 처리.
		if(opt2.isPresent()) {
			System.out.println(opt2.get());			
		}else {
			System.out.println("null!!");
		}
		
		Optional<String> opt3=Optional.empty();
		System.out.println(opt3.orElse("빈 Optional 객체!!"));
		System.out.println(opt3.orElseGet(()-> "java!"));
		
		IntStream stream = IntStream.of(4,2,1,3);
		OptionalInt result = stream.findFirst();
		System.out.println(result.getAsInt());

	}

}
