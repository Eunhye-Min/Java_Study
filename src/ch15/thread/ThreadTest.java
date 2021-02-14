package ch15.thread;

class MyThread implements Runnable{

	@Override
	public void run() {
		int i;
		
		for(i=0; i<=200; i++) {
			System.out.print(i + "\t");
			
			try {
				Thread.sleep(10);	//thread 클래스의 static 메서드
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		/*
		 * MyThread runner1 = new MyThread(); Thread th1 = new Thread(runner1);
		 * th1.start();
		 * 
		 * MyThread runner2 = new MyThread(); Thread th2 = new Thread(runner2);
		 * th2.start();
		 */
		
		Thread t = Thread.currentThread(); //현재 돌고 있는 Thread 가져오기
		System.out.println(t); // 메인Thread임을 알 수 있다
		
		System.out.println("end");
		
	}

}
