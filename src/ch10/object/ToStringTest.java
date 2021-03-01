package ch10.object;

class Book{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

//	@Override
//	public String toString() {
//		return author + ", " + title;
//	}
	
	
}

public class ToStringTest {

	public static void main(String[] args) {
		
		Book book = new Book("토지", "박경리");
		
		System.out.println(book);
		
		String str = new String("토지");
		System.out.println(str);	//얘는 왜 문자열 출력? String클래스 안에 toString()메서드가 이미 정의
		System.out.println(str.toString());

	}

}
