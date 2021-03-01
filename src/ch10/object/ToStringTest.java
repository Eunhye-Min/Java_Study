package ch10.object;

class Book implements Cloneable{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + ", " + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	// --> 직접 부르는 게 아니라,
	// 이 객체가 힙 메모리에서 해제될 때 GC에서 호출되는 메서드
	// 리소스 해제, 안닫혔있는 소켓 닫는 등의 일을 수행
	
	
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book("토지", "박경리");
		
		System.out.println(book);
		
		Book book2 = (Book)book.clone();
		System.out.println(book2);

	}

}
