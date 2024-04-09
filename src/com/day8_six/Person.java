package com.day8_six;

public class Person {
    //1. 멤버변수(인스턴스변수)
    private String name; 
    private int age;
    static int count; 

    //static 변수(클래스변수)
    //***클래스 차원에서 "하나만" 생성되어 모든 객체가 공유한다.*** 
    // 해당 클래스가 메모리에 로드될 때 생성됨
    // (자바는 필요한 클래스파일만 메모리 공간에 올리는 방식으로 실행됨) 
    
    //2. 생성자
    
    /*
     [1] 인스턴스 변수는 객체별로 따로 할당.
     [2] static 변수는 하나만 생성되어 공유 
      */
    
    /*  
    인스턴스 & 정적 비교
    int : 객체를 ‘생성해야만’ 사용 할 수 있음. 공유해서 사용하지 않음. 각 개체별.
    static : 객체 ‘생성하지 않고’ 사용 가능. 객체들이 ‘공유해서’ 사용. 그래서 전역변수임
    - static 메소드에서는 static변수, static 메소드만 사용 가능
    - static 메소드에서는 인스턴스변수는 사용 불가능 
     */
    
    public Person(String name, int age) {
        this.name = name; 
        this.age = age;
        System.out.println(++count + "번째 객체 생성!");
    }

    //3. 메서드 : 객체마다 공유. 같은 클래스로부터 생성된 객체들의 동작은 동일하므로 여러개 만들 필요 없음. 
    public void display() {
        System.out.println("이름 : " + name); 
        System.out.println("나이 : " + age);
    }
}
