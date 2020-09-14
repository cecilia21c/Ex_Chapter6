package Ch06_218p;

public class Calculator {
	//메소드 
	void powerOn() {
		System.out.println("전원을 켭니다."); // powerOn 메소드는 그냥 전원만 켜면 그만이니까  매게 변수가 필요없음.	
	}

	int plus(int x, int y) {
	//매개 변수 2개를 받아서 더해서 int값으로 return해주는 메소드
		int result = x+y;
		return result;
		
	}
	
	double divide(int x, int y) {
		double result = (double) x/ (double)y;
		return result;
 	}

	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}


