package Ch14.stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
			dos.writeByte(100);	//1바이트로 쓰임
			dos.write(100); //4바이트로 쓰임
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			
			//write와 매핑되는 API로 읽어야함
			System.out.println(dis.readByte());
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		}catch(IOException e){
			
		}

	}

}
