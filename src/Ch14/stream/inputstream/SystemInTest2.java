package Ch14.stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("�Է� �� '��' �̶�� ������ : ");
		
		//System.in�� inputStream���� 1����Ʈ ������ �о����
		//ǥ��IO�� close() ���� ����, ��� �����ִ� ���̱� ������
		//read()�� ��ȯ���� int --> why? stream�� ���� �����ϸ� �� �̻� ���� ���� ���� -1�� ��ȯ
		//(1����Ʈ�� ������, 4����Ʈ�� ó��)
		
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			while ( (i = isr.read()) != '��' ) {
			System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
 