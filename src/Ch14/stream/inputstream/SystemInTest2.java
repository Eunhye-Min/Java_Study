package Ch14.stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("입력 후 '끝' 이라고 쓰세요 : ");
		
		//System.in은 inputStream으로 1바이트 단위로 읽어들임
		//표준IO는 close() 하지 않음, 계속 열려있는 것이기 때문에
		//read()의 반환값은 int --> why? stream의 끝에 도달하면 더 이상 읽을 것이 없어 -1을 반환
		//(1바이트를 읽지만, 4바이트로 처리)
		
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			while ( (i = isr.read()) != '끝' ) {
			System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
 