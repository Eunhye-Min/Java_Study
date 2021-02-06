package ch13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		//Stream을 열었으면 반드시 닫아야함!
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//return;
		}finally {	//try가 되면 무조건 실행
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
