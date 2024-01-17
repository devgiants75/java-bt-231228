package i_Chapter08;

// final 키워드

//! 1. final 클래스
// : 더 이상 상속될 수 없는 클래스를 의미
// : final 클래스를 부모 클래스로 사용할 수 X
// - 클래스의 동작을 변경하지 않고 안정성을 보장하기 위함
// 기본 형식 class 키워드 앞에 final 키워드 작성
final class MyFinalClass{
	// 2. final 메서드
	// : 자식 클래스에서 오버라이드 할 수 없는 메서드를 의미
	// : final 클래스의 모든 메서드는 암묵적으로 final
	// : 메서드의 동작을 변경하지 못하도록 지정
	public final void myMethod() {
		// public + final >> private 메서드와 유사하게 동작
	}
	
	// 3. final 변수
	// : 상수를 지정하는 키워드
	// : 재할당이 불가능한 변수, 선언과 동시에 초기화
	// : 변수명을 모두 대문자로 작성, 단어와 단어의 연결을 (_)기호로 연결
	final int FINAL_VALIABLE = 30;
//	FINAL_VALIABLE = 10; - Error
}

public class C_Final {
	//	-, _ 기호의 차이점
	// choco-cake
	// choco_cake
	
	// final 키워드의 장단점
	
	// 장점
	// 불변성: final 키워드를 통해 객체의 상태를 변경하지 못하게 함
	// - 안정성 보장을 위해 사용
	
	// 단점
	// 유연성 감소: 상속X, 오버라이딩X 
	// - 그 자체로만 사용	
}