package ch8.template;

public class CarTest {

	public static void main(String[] args) {
		
		AICar aICar = new AICar();
		aICar.run();
		System.out.println("=========================");
		Car manulCar = new ManualCar();
		manulCar.run();
		

	}

}
