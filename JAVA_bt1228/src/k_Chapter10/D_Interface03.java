package k_Chapter10;

// 인터페이스 멤버 변수 정의
// : public, static, final 특성 가짐

interface ExampleInterface {
	int EXAMPLE_VARIABLE = 10; // public, static, final
	
	void printVar();
	
	default void method() {
		System.out.println("interface1");
	}
}

// 다중 인터페이스 구현
// : 클래스는 여러 개의 인터페이스 구현이 가능 (둘 이상의 타입으로 동작 가능)
interface ExampleInterface2 {
	void printVar2();
	
	default void method() {
		System.out.println("interface2");
	}
}

// 다중 인터페이스 사용 방법은 (,)로 구분하여 나열
// 주의 사항
// : 두 인터페이스에 같은 시그니처(같은 선언부)를 가진 디폴트 메서드가 존재한다면
// : 선언이 같고 구현이 다른 메서드가 충돌
// : >> 해당 클래스는 반드시 재정의해야 함
class ExampleClass implements ExampleInterface, ExampleInterface2 {
	public void printVar() {
		System.out.println(EXAMPLE_VARIABLE);
	}
	
	public void printVar2() {
		System.out.println("다중 인터페이스 구현");
	}
	
	@Override
	public void method() {
		System.out.println("Method, 중복되는 디폴트 메서드");
	}
}

// public: 모든 곳에서 접근 가능
// static: 인스턴스화 없이 인터페이스 이름을 통해 접근 가능
// final: 한 번 할당되면 값을 변경할 수 없음

// 인터페이스에서의 다형성
// : 인터페이스를 구현한 클래스의 객체는 인터페이스 타입을 가질 수 있다.

public class D_Interface03 {
	public static void main(String[] args) {
		ExampleClass exClass = new ExampleClass();
		exClass.printVar();
		exClass.method();
		
		ExampleInterface exInterface = exClass;
		exInterface.printVar();
	}
}