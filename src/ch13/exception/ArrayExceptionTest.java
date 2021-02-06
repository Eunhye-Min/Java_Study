package ch13.exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		//[0,0,0,0,0]으로 초기화
		
		try {
			for(int i=0; i<=5; i++) {	//i<5로 돌려야하지만, 고의로 익셉션 발생시키기
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);	//toString()
			System.out.println("예외처리");
		}
		System.out.println("프로그램 종료");
		
		//이제 프로그램 죽은 것 X
	}

}
