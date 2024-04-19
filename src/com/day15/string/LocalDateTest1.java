package com.day15.string;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest1 {

	public static void main(String[] args) {
		//public static LocalDate now()
		LocalDate lDate = LocalDate.now();
		System.out.println("현재날짜 : " + lDate);
		
		LocalTime lTime = LocalTime.now();
		System.out.println("현재시간 : " + lTime);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : "+ ldt);
		
		//날짜 지정
		LocalDate ofDate = LocalDate.of(1998, 11, 04);
		System.out.println("지정한 날짜 : " + ofDate);
		
		LocalTime ofTime = LocalTime.of(10, 00);
		System.out.println("지정한 시간 : " + ofTime);
		
		LocalDateTime ofDt = LocalDateTime.of(2023,8,30,19,15,30);
		System.out.println("지정한 날짜와 시간 : " + ofDt);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		String sDate = ofDt.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("format이용한 날짜2 : " + sDate);

	}

}
