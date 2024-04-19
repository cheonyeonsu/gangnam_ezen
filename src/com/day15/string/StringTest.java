package com.day15.string;

public class StringTest {

	public static void main(String[] args) {
					//01234567890123456789	
		String str = "Hello, java, hi java!";
		char ch = str.charAt(4);
		System.out.println("ch="+ch);
		
		//특정문자의 위치 구하기 
		int idx = str.indexOf("java"); 
		System.out.println("앞 java의 위치 : " + idx);
		System.out.println("뒤 java의 위치 : " + str.lastIndexOf("java"));
				
		//일부 문자열 추출
		String sub=str.substring(6,10); //6~9위치의 문자열
		System.out.println("sub="+sub);
		
		String s = "www.naver.com";
		if(s.endsWith(".com")) {
			System.out.println(".com site임!");
		}
		
		if(s.startsWith("www")) {
			System.out.println("www로 시작!");
		}
					  //012345678901234
		String email = "hong@gmail.com";
		//email="kim@nate.com";
		if(email.indexOf("@")!=-1 && email.indexOf(".")!=-1
				&& email.indexOf("@") < email.indexOf(".")) {
			System.out.println("이메일 규칙이 올바릅니다. ");
		}else {
			System.out.println("이메일 규칙이 올바르지 않습니다.");
		}
		
		idx = email.indexOf("@");
		int idx2 = email.lastIndexOf("@");
		
		String emailSub =email.substring(idx, idx2); //gmail
		String emailSub2 =email.substring(idx2); //com
		String emailSub3 =email.substring(0, idx); //hong
		
		System.out.println(emailSub);
		System.out.println(emailSub2);
		System.out.println(emailSub3);
		
		String s2 = "	java	spring		";
		String s3 = s.trim(); //좌우 공백 제거
		System.out.println(s3+"|");
		System.out.println("s3.length="+s3.length());
		
		int x=10, y=30;
		System.out.println(String.valueOf(x)+y);
		System.out.println(Integer.toString(x)+y);
	}

}
