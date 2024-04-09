public class StaticTest {
    private int num1 = 10; //인스턴스 변수
    private static int num2 = 20; //static 변수

    public int add() { //instance 메서드
        //non-static 메서드에서는 static 필드에 바로 접근 가능
        return num1 + num2;
    }

    public static int multiply(int a, int b) { //static 메서드 - static만 접근 가능
        //int c= num1 * num2; //static에서는 static만 접근 가능 : num1탈락. 
        
        return a*b;
    }

    public static void main(String[] args) {
       //main도 static 매서드
    	int result=multiply(5,9);
    	// >> static 매서드 호출 : 클래스명. 메서드() => 같은 클래스이므로 클래스명 생략하고 매서드()만 호출가능
    	
    	//result = add(); > error
    	//Cannot make a static reference to the non-static method add() from the type StaticTest
    	
    	//static 매서드는 static데이터만 접근 가능.
    	//non-static 데이터는 인스턴스화 시킨 후 접근해야 함
    	StaticTest obj = new StaticTest();
    	result = obj.add();
    	System.out.println("더하기: "+ result);
    	
    	
    	int result = multiply(10, 7); //static 메서드 호출
        System.out.println("곱하기:" + result);

        //static 메서드는 static 데이터만 접근 가능,
        //non-static 데이터는 new로 클래스를 인스턴스화 시킨 후 접근해야 함
        StaticTest obj = new StaticTest();
        result = obj.add();
        System.out.println("더하기:" + result);
    }
}
