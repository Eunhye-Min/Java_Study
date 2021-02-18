package Ch14.stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		//바이트 단위로 읽기
		FileReader fis = new FileReader("reader.txt");
		
		int i;
		while ( (i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		fis.close();	//보조스트림을 close하면 원스트림까지 close됨

	}

}
