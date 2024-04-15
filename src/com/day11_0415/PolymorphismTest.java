package com.day11_0415;
//#2
import java.util.Scanner;

class Animal 
{
	public void bark(){
		System.out.println("울다"); 
	}
	public void parent(){
		System.out.println("난  부모-동물"); 
	}
}

class Cat extends Animal 
{
	public void bark() 
	{
		System.out.println("야옹야옹"); 
	}
	public void child() 
	{
		System.out.println("난  자식-고양이"); 
	}
}
class Cow extends Animal 
{
	public void bark() 
	{
		System.out.println("음메음메"); 
	}
}
class Dog extends Animal 
{
	public void bark() 
	{
		System.out.println("멍멍"); 
	}
}

public class PolymorphismTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("동물을 입력하세요. 1. 고영 2. 소 3.멈무");
		//사용자가 입력한 동물의 종류를 int로 받고 동물의 종류인 type를 입력받는다. 
		int type = sc.nextInt();
		
		Animal a = barkAnimal(type); //메서드 생성 : 부모에 자식 객체 들어감. 
		a.bark(); //자식의 오버라이드 메서드 호출. 
		
		//배열
		Animal[] aArr = new Animal[3];
		/*
		 * a[0] = new Cat(); a[1] = new Cow(); a[2] = new Dog();
		 */
		for(int i=0;i<aArr.length;i++) {
			aArr[i] = new Animal();
			aArr[i].bark();
		}
	}
	
	//다들 어려워하는 부분 : 반환타입은 부모(Animal)
	public static Animal barkAnimal(int type) {
		Animal a = null;
		if(type==1) {
			a=new Cat();
		}else if(type==2) {
			a=new Cow();
		}else if(type==3){
			a= new Dog();
		}
		return a; //부모클래스가 리턴타입 > 자식 객체가 리턴. 
	}
	}


