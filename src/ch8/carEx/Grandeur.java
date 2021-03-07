package ch8.carEx;

public class Grandeur extends Car{
	@Override
	public void start() {
		System.out.println("Grandeur 시동을 켭니다.");
		
	}

	@Override
	public void drive() {
		System.out.println("Grandeur 달립니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("Grandeur 멈춥니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Grandeur 시동을 끕니다.");
		
	}

	@Override
	public void wash() {
		System.out.println("Grandeur 세차를 합니다.");
		
	}
}
