package ch12.innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100; //상수 (i도 상수임)
		
		class MyRunnable implements Runnable{	//지역내부클래스

			@Override
			public void run() {
				
				//* num += 10; --> 상수(final)이므로 변경 불가
				//* i = 200; --> 상수이므로 변경 불가
				System.out.println(num);	//참조는 가능
				System.out.println(i);	//참조는 가능
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
		}
		
		return new MyRunnable();
	}
}

public class LocalInnerClassTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();

	}

}
