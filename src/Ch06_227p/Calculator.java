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
	
	void execute() { // �Ű����� x.���ϰ�x. �׳�println
		double result = avg (7,10);
		println("������:" +result); //println�̶��  �޼ҵ带 ����. Ŭ���� ���ο� �ִ� �޼ҵ�
		//��ü ���ο��� ȣ��.
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	
}
