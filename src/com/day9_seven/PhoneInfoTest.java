package com.day9_seven;

import java.util.Scanner;

public class PhoneInfoTest {

	public static void main(String[] args) {
		PhoneInfo[] infoList = new PhoneInfo[100];
		int count = 0;
		while(true) {
			System.out.println("선택하세요.");
			System.out.println("1. 데이터 입력(저장)\n2. 전체 데이터 조회\n3. 데이터 검색\n4. 데이터 삭제\n5. 프로그램 종료");
			System.out.print("선택 : ");
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("데이터 입력을 시작합니다...");
				for(int i=0; i<infoList.length; i++) {
					System.out.print("이름 : ");
					String name = sc.next();
					System.out.print("전화번호 : ");
					String phone = sc.next();
					System.out.print("생년월일 : ");
					String birth = sc.next();
					infoList[count++] = new PhoneInfo(name, phone, birth);
					System.out.println("데이터 입력이 완료되었습니다.\n");
					break;
				}
			}
			else if(num == 2) {
				System.out.println("======전체 데이터 조회======");
				for(int i=0; i<count; i++) {
					infoList[i].showInfo();
				}	
				System.out.println("========================");
						
			}
			else if(num == 3) {
				System.out.println("데이터 검색을 시작합니다...");
				String searchName = sc.next();
				for(int i=0; i<infoList.length; i++) {					
					if(infoList[i].getName().equals(searchName)) {
						infoList[i].showInfo();
					}
				}
				System.out.println(searchName);
			}
			else if(num == 4) {
				System.out.println("데이터 삭제를 시작합니다...");
				System.out.print("이름 : ");
				String deleteName = sc.next();
				for(int i=0; i<count; i++) {
					if(infoList[i].getName().equals(deleteName)) {
						num = i;
					
						break;
					}
				}
				for(int i = num; i<count-1; i++){						
					infoList[i] = infoList[i+1];
					infoList[count-1] = null;
					count--;

					System.out.println("데이터 삭제가 완료되었습니다");
				}
					
			}
			else if(num == 5){
				System.out.println("프로그램을 종료합니다");
				break;
			}

		}

	}

}
