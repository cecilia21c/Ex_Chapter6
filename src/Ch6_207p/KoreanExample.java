package Ch6_207p;

public class KoreanExample {

	public static void main(String[] args) {
		
		//KoreanŬ���� k1 ��ü�� ����. 
		Korean k1 = new Korean("�ڱ��", "010-9937-1606"); //������
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		
		//KoreanŬ���� k2 ��ü�� ����.
		Korean k2 = new Korean("�ȹμ�", "010-9999-0000");	//������
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}

}
