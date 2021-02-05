package ch12.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream= sList.stream();
		stream.forEach(s->System.out.print(s + " "));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.print(s + " "));
		//sorting은 comparable이 구현이 되어있어야 한다 (String은 comparable하다)
		System.out.println();
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
	}

}
