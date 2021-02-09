package ch13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("b.txt", "java.lang.string");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) {	//디폴트 Excpetion, 최상위이므로 항상 제일 마지막에!
			System.out.println(e);
		}
		System.out.println("end");

	}

}
