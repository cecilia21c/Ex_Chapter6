package Ch06_220p;

public class Computer { // 메인메소드가 없는 부분. 
	//필드 선언 . 초기값도 지정해줄 수 있음. 
	// 메소드 기능 선언. 
	
	int sum1(int[] values) { //리턴 타입은 int이고 매개변수는 몇 개인지를 모르니까 배열로 받는다.
		int sum = 0 ; // 메소드 안에 있으니까 지역변수.
		for(int i=0; i<values.length;i++) {
			sum+=values[i]; // values[i]를 길이만큼 계속 돌린다.
		}
		return sum; // 결과적으로 sum을 리턴한다.
		
	} //sum1 메소드 끝.

	int sum2(int ... values) {
		
		
		int sum = 0;
		for(int i=0; i<values.length;i++) {
			sum+= values[i];
		}
		
		return sum;
	}
	
}


