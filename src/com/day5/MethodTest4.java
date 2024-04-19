package com.day5;

class MethodTest4
{
	public static int getSum(int count) //int count => 매개변수
	{
		int sum=0; //지역변수
		for (int i=1;i<=count ;i++ ) //int i => 블럭변수
		{
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int count=10;
		int sum = getSum(count);
		System.out.printf("1~ " + count + "까지의 합=" + sum);
	}//main
}