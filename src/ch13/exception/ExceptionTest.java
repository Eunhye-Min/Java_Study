package ch13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		//Stream�� �������� �ݵ�� �ݾƾ���!
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//return;
		}finally {	//try�� �Ǹ� ������ ����
			try {
				fis.close();
				System.out.println("finally");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");

	}

}
