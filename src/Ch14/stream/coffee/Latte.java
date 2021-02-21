package Ch14.stream.coffee;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing(); // 상위클래스의 제조방법 호출
		System.out.print("Adding Milk");
	}

}
