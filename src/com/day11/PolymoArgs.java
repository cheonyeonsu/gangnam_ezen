package com.day11;

class Person //부모
{
	public String kind() 
	{
		return "사람"; 
	}
};
class Student extends Person 
{
	public String kind() 
	{
		return "학생"; 
	}
};
class Graduate extends Student
{
	public String kind() 
	{
		return "대학원생"; 
	}
};

class Assistant extends Person 
{
	public String kind() 
	{
		return "조교";
	}
};
class Professor extends Person 
{
	public String kind() 
	{
		return "교수";
	}
}//


public class PolymoArgs {
	
	public static void register(Person p) {
	if(p instanceof Student || p instanceof Graduate || p instanceof Assistant) {
		System.out.println(p.kind()+"이/가 등록합니다." );
	}else {
		System.out.println(p.kind()+"이/가 등록할 수 없습니다." );
	}
		
	}
	
	
	
	public static void main(String[] args) {
		//register 3개 호출
		Student s = new Student();
		register(s);
		
		Graduate g = new Graduate();
		register(g);
		
		Assistant a = new Assistant();
		register(a);
		// = register(new Assistant());
		
		
	}

}
