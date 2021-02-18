package Ch14.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest3 {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			//try안에서 리소스 오픈하고 오토클로즈업 --> 클로즈가 불림
			int i;
			byte[] bs = new byte[10];
			while( (i = fis.read(bs)) != -1 ) {
				/*
				 * for(byte b : bs) { System.out.print((char)b); }
				 */
				System.out.println("i : " + i);
				
				for(int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("end");

	}

}
