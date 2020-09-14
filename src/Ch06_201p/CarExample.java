package Ch06_201p;

public class CarExample { // 외부 클래스에서 Car 필드값 읽기와 변경

	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		
		//필드값 읽기 
		System.out.println("제작회사:" +myCar.company);
		System.out.println("모델명:" +myCar.model);
		System.out.println("색깔:" +myCar.color);
		System.out.println("최고속도:" +myCar.maxSpeed);
		System.out.println("현재속도:" +myCar.speed);
		
		//필드값 변경
		 myCar.speed = 60; // Car 객체의 필드값을 외부 클래스인 CarExample에서 변경하기.
		 System.out.println("수정된 속도:" + myCar.speed);
	}

}
