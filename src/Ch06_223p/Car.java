package Ch06_223p;

public class Car {
	//�ʵ� 
	int gas;
	
	//������
	
	//�޼ҵ� 
	void setGas(int gas) { //������.
		this.gas = gas;
	}
	
	boolean isLeftGas(){ //���� ������.
		
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false; //false�� ����
		}
			System.out.println("gas�� �ֽ��ϴ�.");
			return true; //true�� ����
	}
	
	void run() { //�������� 0�� ������ �޸�. �ƴϸ� ����.
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas +")");
				gas-=1;
			}else {
				System.out.println("����ϴ�. (gas�ܷ�:" + gas +")");
				return; //�޼ҵ� ���� ����
			}
		}
		
	}
}