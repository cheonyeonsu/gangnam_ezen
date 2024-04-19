package com.day15.string;

import java.time.LocalDateTime;

public class LocalDateTest2 {
public static void main(String[] args) {

	
	/*
	LocalDateTime에서 년도, 월, 주, 일 조회
 int getYear() - 년도 반환
 Month getMonth() - 월 반환
 int getDayOfMonth() - 일 반환
 DayOfWeek getDayOfWeek() - 요일 반환
 int getDayOfYear() - 1년 중 며칠인지 반환
	*/
	
	LocalDateTime today = LocalDateTime.now();
	
	int year = today.getYear();
	System.out.println("년도 : " + year);
	System.out.println("월 : " + today.getMonth());
	System.out.println("일 : " + today.getDayOfMonth());
	System.out.println("요일 : " + today.getDayOfWeek());
	System.out.println("1년중 며칠째 :  : " + today.getDayOfWeek());

	System.out.println("\n시 : " +today.getHour());
	System.out.println("분 : " +today.getMinute());
	System.out.println("초 : " +today.getSecond());
	System.out.println("나노초 : " +today.getNano());

	
}
	
}
