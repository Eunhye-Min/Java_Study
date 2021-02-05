package ch12.lambda;

@FunctionalInterface	//함수형 인터페이스는 메서드 2개 이상 선언X
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);
	//void add(int x, int y);	//익명함수이기 때문에 어떤 것인지 알 수 없다
}
