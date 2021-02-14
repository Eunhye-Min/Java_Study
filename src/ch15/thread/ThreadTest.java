package ch15.thread;

class MyThread implements Runnable{

	@Override
	public void run() {
		int i;
		
		for(i=0; i<=200; i++) {
			System.out.print(i + "\t");
			
			try {
				Thread.sleep(10);	//thread Ŭ������ static �޼���
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
		
		Thread t = Thread.currentThread(); //���� ���� �ִ� Thread ��������
		System.out.println(t); // ����Thread���� �� �� �ִ�
		
		System.out.println("end");
		
	}

}
