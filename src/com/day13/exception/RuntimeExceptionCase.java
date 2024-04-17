package com.day13.exception;
//#2
public class RuntimeExceptionCase {

	public static void main(String[] args) {
		try {
			int[] arr = new int[4];
			arr[4]=10; //
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 - 예외 : " + e.getMessage());
		}

		try {
			Object obj = new int[3];
			String s = (String)obj;//
			//Child ch = (Child)new Parent();
		} catch (Exception e) {
			System.out.println("Class cast 예외 : " +e);
		}
		
		try {
			String s=null;
			int len=s.length();//
		} catch (NullPointerException e) {
			System.out.println("null 예외 : " + e.getMessage());
		}
		
		try {
			int[] arr = new int[-5];
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n=====next!!=====");
	}
	
	

}
