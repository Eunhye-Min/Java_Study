package ch10.classEx;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public int hashCode() {
		return day * 11 + month * 101 + year * 1001;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			return (this.month == date.month && this.day == date.day && this.year == date.year);
		}else {
			return false;
		}
	}
	
	
}

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(3, 16, 2021);
		MyDate date2 = new MyDate(3, 16, 2021);
		
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}
