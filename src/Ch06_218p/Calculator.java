package Ch06_218p;

public class Calculator {
	//�޼ҵ� 
	void powerOn() {
		System.out.println("������ �մϴ�."); // powerOn �޼ҵ�� �׳� ������ �Ѹ� �׸��̴ϱ�  �Ű� ������ �ʿ����.	
	}

	int plus(int x, int y) {
	//�Ű� ���� 2���� �޾Ƽ� ���ؼ� int������ return���ִ� �޼ҵ�
		int result = x+y;
		return result;
		
	}
	
	double divide(int x, int y) {
		double result = (double) x/ (double)y;
		return result;
 	}

	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}


