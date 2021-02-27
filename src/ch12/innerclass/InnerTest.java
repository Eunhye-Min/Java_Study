 package ch12.innerclass;

 class OutClass{
	 
	 private int num = 10;
	 private static int sNum = 20;
	 private InClass inClass;
	 
	 public OutClass() {
		 inClass = new InClass();
	 }
	 
	 class InClass{
		 int iNum = 100;
		 //*static int sInNum = 200; --> InClass�� static�̸� �����������, 
		 //�ν��Ͻ� InnerClass�� OuterClass ���� ���� �����ǹǷ� static �� �� ����
		 void inTest() {
			 System.out.println(num);
			 System.out.println(sNum); //static������ OutClass ���� �� �̹� �����Ƿ� �� �� ����
		 }
	 }
	 
	 public void usingInner() {
		 inClass.inTest();
	 }
	 
	 static class InStaticClass{	//OuterClass ���� ���ο� ��� ���� �� �� ����
		 int inNum = 100;
		 static int sInNum = 200;
		 
		 void inTest() {
			 System.out.println(inNum);
			 System.out.println(sInNum);
			 System.out.println(sNum);
		 }
		 
		 static void sTest(){	// cf.�ν��Ͻ� InnerClass�ȿ��� static ������ �޼��� ��� ���� �� ����
			 //*System.out.println(inNum); --> Ŭ���� ���� ���� ������� �����̹Ƿ� static �޼��忡�� �� �� ����
			 System.out.println(sInNum);
			 System.out.println(sNum);
		 }
	 }
 }
 
public class InnerTest {

	public static void main(String[] args) {
		 OutClass outClass = new OutClass();
		 outClass.usingInner();
		 
		 OutClass.InClass myInClass = outClass.new InClass();
		 myInClass.inTest();
		 
		 System.out.println();
		 
		 OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		 myInClass.inTest();	//static�޼��尡 �ƴϹǷ� ���ο��� staticŬ���� ���� �� ȣ���ؾ� ��
		 System.out.println();
		 
		 OutClass.InStaticClass.sTest();//���� ���� �״�� �� �� ����
	}

}
