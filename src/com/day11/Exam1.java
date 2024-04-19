package com.day11;

public class Exam1 {
	//(1) action() 메서드를  작성하시오.
	static void action(Robot robot) {
        if (robot instanceof DanceRobot) {
            ((DanceRobot) robot).dance();
        } else if (robot instanceof SingRobot) {
            ((SingRobot) robot).sing();
        } else if (robot instanceof DrawRobot) {
            ((DrawRobot) robot).draw();
        } else {
            System.out.println("지원하지 않는 로봇입니다.");
        }
    }
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()}; 
		for(int i=0; i< arr.length;i++)
			action(arr[i]);
		
		Robot[]arr = new Robot[3];
		arr[0] = new DanceRobot();
		arr[1] = new SingRobot();
		arr[2] = new DrawRobot();
		
		//각 요소의 메서드호출(자식만의 메소드)
		//for 
		
		
	} // main 
}
class Robot {}

class DanceRobot extends Robot { 
	void dance() {
		System.out.println("춤을  춥니다."); 
	}
}
class SingRobot extends Robot { 
	void sing() {
		System.out.println("노래를  합니다."); 
	}
}

class DrawRobot extends Robot { 
	void draw() {
		System.out.println("그림을  그립니다."); 
	}
}

