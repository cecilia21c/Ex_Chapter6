package Ch06_201p;

public class CarExample { // �ܺ� Ŭ�������� Car �ʵ尪 �б�� ����

	public static void main(String[] args) {
		//Car ��ü ����
		Car myCar = new Car();
		
		//�ʵ尪 �б� 
		System.out.println("����ȸ��:" +myCar.company);
		System.out.println("�𵨸�:" +myCar.model);
		System.out.println("����:" +myCar.color);
		System.out.println("�ְ�ӵ�:" +myCar.maxSpeed);
		System.out.println("����ӵ�:" +myCar.speed);
		
		//�ʵ尪 ����
		 myCar.speed = 60; // Car ��ü�� �ʵ尪�� �ܺ� Ŭ������ CarExample���� �����ϱ�.
		 System.out.println("������ �ӵ�:" + myCar.speed);
	}

}
