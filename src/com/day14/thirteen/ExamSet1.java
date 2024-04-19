package com.day14.thirteen;
//13강 컬렉션 - 32p
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ExamSet1 {

	public static void main(String[] args) {
		ArrayList<Double> list=new ArrayList<Double>();

		for (int i=0;i<4 ;i++ ){
			list.add(i+1.5);
		}

		System.out.println("--------ArrayList 이용-------");
		for(int i=0; i<list.size(); i++){
			double num = list.get(i);
			System.out.println(num);
		}

		System.out.println();
		for(double d:list){
			System.out.println(d);
		}

		//
		double[] arr = new double[4];
		for (int i=0; i<arr.length;i++ ){
			arr[i] = i+1.5;
		}

		System.out.println("\n--------배열 이용-------");

		for (int i=0; i<arr.length;i++ ){
			System.out.println(arr[i]);
		}

		System.out.println();
		for(double d:list){
			System.out.println(d);
		}

		//
		HashSet<Double> hset = new HashSet<Double>(10);

		//데이터 입력하기
		for (int i=0;i<4 ;i++ )	{
			hset.add(i+1.5);
		}

		//컬렉션의 iterator() 메서드 이용하여 데이터 읽기
		System.out.println("\n--------HashSet iterator() 이용--------");
		Iterator<Double> iter = hset.iterator();
		while (iter.hasNext())	{
			double data = iter.next();
			System.out.println(data);
		}//while
	}

}
