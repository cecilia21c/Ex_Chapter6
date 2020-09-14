package Ch06_223p;

public class Car {
	//필드 
	int gas;
	
	//생성자
	
	//메소드 
	void setGas(int gas) { //가스량.
		this.gas = gas;
	}
	
	boolean isLeftGas(){ //남은 가스량.
		
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false; //false를 리턴
		}
			System.out.println("gas가 있습니다.");
			return true; //true를 리턴
	}
	
	void run() { //가스량이 0일 때까지 달림. 아니면 종료.
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:" + gas +")");
				gas-=1;
			}else {
				System.out.println("멈춥니다. (gas잔량:" + gas +")");
				return; //메소드 실행 종료
			}
		}
		
	}
}
