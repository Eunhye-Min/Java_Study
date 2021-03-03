package ch10.string;

public class StringTest2 {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java)); //1435804085
		
		java = java.concat(android);
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));	//1784662007

	}

}
