package ch8.template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}	//구현의 확장을 함
								//모든 차가 washCar를 헤야 한다면 abstract로 정의
	
	final public void run() {	//시나리오가 되는 메서드들 -> 재정의하면 안되므로 final로 선언
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
