package Ch06_202p;

public class FieldInitValueExample {

	public static void main(String[] args) {
		
		//FieldInitValueExample 클래스에서 FieldInitValue 객체를 생성
		FieldInitValue fiv = new FieldInitValue();
		
		
		//생성된 객체의 필드값을 읽기 
		System.out.println("byteField:" + fiv.byteField);
		System.out.println("shortField:" + fiv.shortField);
		System.out.println("intField:" + fiv.intField);
		System.out.println("longField:" + fiv.longField);
		System.out.println("booleanField:" + fiv.booleanField);
		System.out.println("charField:" + fiv.charField);
		System.out.println("floatField:" + fiv.floatField);
		System.out.println("doubleField:" + fiv.doubleField);
		System.out.println("arrField:" + fiv.arrField);
		System.out.println("referenceField:" + fiv.referenceField);	
	}

}
