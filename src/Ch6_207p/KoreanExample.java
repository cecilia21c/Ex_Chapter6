package Ch6_207p;

public class KoreanExample {

	public static void main(String[] args) {
		
		//Korean클래스 k1 객체를 생성. 
		Korean k1 = new Korean("박기랑", "010-9937-1606"); //생성자
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		
		//Korean클래스 k2 객체를 생성.
		Korean k2 = new Korean("안민선", "010-9999-0000");	//생성자
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}

}
