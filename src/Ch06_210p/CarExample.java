package Ch06_210p;

public class CarExample {

	public static void main(String[] args) {
		
		//Car 객체 생성.
		Carr car1 = new Carr();//생성자 선택
		System.out.println("car1.company:" + car1.company);
		System.out.println();

		
		Carr car2 = new Carr("자가용");//생성자 선택
		System.out.println("car2.company:" + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		Carr car3 = new Carr("자가용", "White"); //생성자 선택
		System.out.println("car3.company:" + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();
		
		Carr car4 = new Carr("Taxi","Blue", 200); //생성자 선택
		System.out.println("car4.company:" + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
		System.out.println();
	}

}
