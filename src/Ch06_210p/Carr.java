package Ch06_210p;

public class Carr {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Carr(){}
	
	Carr(String model){
		this.model = model;
	}
	Carr(String model, String color){
		this.model = model;
		this.color=color;
		
	}
	
	Carr(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
}
