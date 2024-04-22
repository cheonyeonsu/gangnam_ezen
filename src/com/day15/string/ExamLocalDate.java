package com.day15.string;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExamLocalDate {

	public static void main(String[] args) {
		//생년월일부터 오늘까지 몇일 경과?
		LocalDate startDate1 = LocalDate.of(1998,11,4); //of로 시작일 종료일 설정
		LocalDate endDate1 = LocalDate.now();
		long remainDay1 = startDate1.until(endDate1, ChronoUnit.DAYS);
		System.out.println("승철 탄신일로부터 : " + remainDay1 + "일 경과");
		
		//수료일까지 며칠 남았는지
		LocalDate startDate2 = LocalDate.now();
		LocalDate endDate2 = LocalDate.of(2024,7,25);
		long remainDay2 = startDate2.until(endDate2, ChronoUnit.DAYS);
		System.out.println("수료까지 남은 일수 : " + remainDay2 + "일 남음");
		
		
		//오늘부터 100일 전의 날짜
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime result3 = now.minusDays(100);
		System.out.println("100일 전: " + result3);
		
		
		//2주 후 날짜 구하기
		LocalDate startDate3 = LocalDate.of(2024,1,1);
		LocalDateTime result4 = now.plusWeeks(2);
		System.out.println("2주 후: " + result4);
		
		
		
	}

}
