package Ch06_220p;

public class Computer { // ���θ޼ҵ尡 ���� �κ�. 
	//�ʵ� ���� . �ʱⰪ�� �������� �� ����. 
	// �޼ҵ� ��� ����. 
	
	int sum1(int[] values) { //���� Ÿ���� int�̰� �Ű������� �� �������� �𸣴ϱ� �迭�� �޴´�.
		int sum = 0 ; // �޼ҵ� �ȿ� �����ϱ� ��������.
		for(int i=0; i<values.length;i++) {
			sum+=values[i]; // values[i]�� ���̸�ŭ ��� ������.
		}
		return sum; // ��������� sum�� �����Ѵ�.
		
	} //sum1 �޼ҵ� ��.

	int sum2(int ... values) {
		
		
		int sum = 0;
		for(int i=0; i<values.length;i++) {
			sum+= values[i];
		}
		
		return sum;
	}
	
}


