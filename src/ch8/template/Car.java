package ch8.template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {}	//������ Ȯ���� ��
								//��� ���� washCar�� ��� �Ѵٸ� abstract�� ����
	
	final public void run() {	//�ó������� �Ǵ� �޼���� -> �������ϸ� �ȵǹǷ� final�� ����
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
