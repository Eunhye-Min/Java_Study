package ch12.lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
		
		StringConcat concat = (s, v)->System.out.println(s + "," + v);
		// --> 람다식으로 구현을 하지만, 사실 내부에 익명객체가 생성됨
		// --> 함수인데, 마치 변수가 어떤 변수에 대입되듯이 사용되고 있음
		concat.makeString("hello", "world");

		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+ "," + s2);
				
			}
		};
		
		concat2.makeString("hello", "newWorld");
	}

}
