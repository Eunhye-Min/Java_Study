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
		 //*static int sInNum = 200; --> InClass가 static이면 상관없겠지만, 
		 //인스턴스 InnerClass는 OuterClass 생성 이후 생성되므로 static 쓸 수 없음
		 void inTest() {
			 System.out.println(num);
			 System.out.println(sNum); //static변수로 OutClass 생성 전 이미 있으므로 쓸 수 있음
		 }
	 }
	 
	 public void usingInner() {
		 inClass.inTest();
	 }
	 
	 static class InStaticClass{	//OuterClass 생성 여부와 상관 없이 쓸 수 있음
		 int inNum = 100;
		 static int sInNum = 200;
		 
		 void inTest() {
			 System.out.println(inNum);
			 System.out.println(sInNum);
			 System.out.println(sNum);
		 }
		 
		 static void sTest(){	// cf.인스턴스 InnerClass안에는 static 변수와 메서드 모두 만들 수 없음
			 //*System.out.println(inNum); --> 클래스 생성 이후 만들어진 변수이므로 static 메서드에선 쓸 수 없음
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
		 myInClass.inTest();	//static메서드가 아니므로 내부에서 static클래스 생성 후 호출해야 함
		 System.out.println();
		 
		 OutClass.InStaticClass.sTest();//생성 없이 그대로 쓸 수 있음
	}

}
