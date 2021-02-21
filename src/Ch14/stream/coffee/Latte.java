package Ch14.stream.coffee;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing(); // ����Ŭ������ ������� ȣ��
		System.out.print("Adding Milk");
	}

}
