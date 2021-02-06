package ch13.exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		
		try(obj){
			throw new Exception();	//예외 강제발생
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
