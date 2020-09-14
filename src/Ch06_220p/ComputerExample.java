package Ch06_220p;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();  //객체 생성
		
		int[] values1 = {1,2,3}; //배열 values1에 {1,2,3}값을 담는다.
		int result1 = myCom.sum1(values1); //myCom객체의 메소드 sum1에 배열을 넣는다.  sum= values1[0]+values1[1]+values1[2]
		System.out.println("result1:" + result1); 
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println();
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4: " + result4);

	}

}
