package Ch14.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("input.txt")){
			//try안에서 리소스 오픈하고 오토클로즈업 --> 클로즈가 불림
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
