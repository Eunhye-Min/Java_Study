package Ch14.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("input.txt")){
			//try�ȿ��� ���ҽ� �����ϰ� ����Ŭ����� --> Ŭ��� �Ҹ�
			int i;
			while( (i = fis.read()) != -1 ) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
