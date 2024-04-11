package java_practice;

class Car{
	int no;
	int speed;
	
	void setNO(int n) {
		no = n;
	}
	
	void run(int s) {
		speed = s;
	}
	
	void stop() {
		speed = 0;
	}
	
	void display() {
		System.out.println("ナンバー" + no + "の速度は" + speed  +"です");
	}
}
