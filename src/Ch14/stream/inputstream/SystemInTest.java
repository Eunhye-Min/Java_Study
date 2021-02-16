package Ch14.stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("입력 : ");
		
		try {
			int i = System.in.read();
			//System.in은 inputStream으로 1바이트 단위로 읽어들임
			//표준IO는 close() 하지 않음, 계속 열려있는 것이기 때문에
			//read()의 반환값은 int --> why? stream의 끝에 도달하면 더 이상 읽을 것이 없어 -1을 반환
			//(1바이트를 읽지만, 4바이트로 처리)
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
 