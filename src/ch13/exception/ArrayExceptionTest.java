package ch13.exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		//[0,0,0,0,0]���� �ʱ�ȭ
		
		try {
			for(int i=0; i<=5; i++) {	//i<5�� ������������, ���Ƿ� �ͼ��� �߻���Ű��
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);	//toString()
			System.out.println("����ó��");
		}
		System.out.println("���α׷� ����");
		
		//���� ���α׷� ���� �� X
	}

}
