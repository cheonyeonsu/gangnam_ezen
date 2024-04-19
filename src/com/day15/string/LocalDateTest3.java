package com.day15.string;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTest3 {

	public static void main(String[] args) {
		//[1]오늘부터 100일 후 날짜 구하기
		LocalDateTime now = LocalDateTime.now();
		
		LocalDateTime result1 = now.plusYears(3);
		System.out.println("3년 후: " + result1);
		
		LocalDateTime result2 = now.minusMonths(5);
		System.out.println("5개월 전: " + result2);
		
		LocalDateTime result3 = now.plusDays(100);
		System.out.println("100일 후: " + result3);
		
		LocalDateTime result4 = now.minusWeeks(7);
		System.out.println("7주전: " + result4);
		
		//[2] 두 날짜 사이의 간격, 크리스마스까지 며칠 남았는지.
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = LocalDate.of(2024,12,25);
		
		long remainDay 
			= startDate.until(endDate, ChronoUnit.DAYS);
		System.out.println("크리스마스까지 남은 일수 : " + remainDay);

		long remainYear 
			= startDate.until(endDate, ChronoUnit.YEARS);
		System.out.println("크리스마스까지 남은 년수 : " + remainYear + "년");
		
		long remainMonth 
			= startDate.until(endDate, ChronoUnit.MONTHS);
		System.out.println("크리스마스까지 남은 개월수 : " + remainMonth + "개월");
		
		Period period = Period.between(startDate, endDate);
		System.out.println("크리스마스까지 남은 기간 : " 
		+ period.getYears() + "년 "
		+ period.getMonths() + "월 "
		+ period.getDays() + "일 " );
		
		long gap = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("크리스마스까지 남은 일 수 : " +gap + "일" );
	}

}
