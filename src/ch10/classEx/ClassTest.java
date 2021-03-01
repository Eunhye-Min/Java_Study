package ch10.classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person person = new Person("James");
		System.out.println(person);
		
		Class c1 = Class.forName("ch10.classEx.Person");
		Person p1 = (Person)c1.newInstance(); //Default Constructor를 호출
		System.out.println(p1);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"김유신"};
		Person personLee = (Person)cons.newInstance(initargs);
		System.out.println(personLee);

	}

}
