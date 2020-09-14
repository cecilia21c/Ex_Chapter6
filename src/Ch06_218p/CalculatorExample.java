package Ch06_218p;

public class CalculatorExample { 

	public static void main(String[] args) { // 메인메소드에서는 호출을 해서 읽기/변경/실행을 한다.
		
		Calculator myCalc = new Calculator(); // 객체를 생성
		myCalc.powerOn(); 
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1:" + result1);
		
		byte x=10; // 로컬변수
		byte y=4;// 로컬변수
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " +result2);
		
		myCalc.powerOff();

	}

}
