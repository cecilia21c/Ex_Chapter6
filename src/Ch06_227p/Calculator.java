package Ch06_227p;

public class Calculator {
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x,int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() { // 매개변수 x.리턴값x. 그냥println
		double result = avg (7,10);
		println("실행결과:" +result); //println이라는  메소드를 실행. 클래스 내부에 있는 메소드
		//객체 내부에서 호출.
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	
}
