package Ch14.stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("�Է� : ");
		
		try {
			int i = System.in.read();
			//System.in�� inputStream���� 1����Ʈ ������ �о����
			//ǥ��IO�� close() ���� ����, ��� �����ִ� ���̱� ������
			//read()�� ��ȯ���� int --> why? stream�� ���� �����ϸ� �� �̻� ���� ���� ���� -1�� ��ȯ
			//(1����Ʈ�� ������, 4����Ʈ�� ó��)
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
 