package k_Chapter10;

//! 인터페이스
// : 객체가 어떤 방식으로 동작해야 하는지를 정의하는 추상 타입
// : 추상 메서드와 상수만으로 구성된 특수한 클래스
// - 모든 메서드가 추상 메서드인 추상 클래스와 유사
// - 객체의 기능을 정의하고, 실제 구현은 인터페이스를 구현하는 클래스에서 담당

//! 인터페이스의 필요성
// : 서로 다른 클래스에 대해 공통된 동작을 보장할 때
//	 - 인터페이스를 구현하는 모든 클래스는 인터페이스의 모든 메서드를 반드시 구현
// : 여러 인터페이스를 동시에 구현 가능
//   - 한 클래스에 대해 여러 개의 인터페이스 구현 가능

//! 인터페이스 구현 방법
// interface 키워드를 사용하여 선언

//! 인터페이스 VS 추상클래스
// : 추상 메서드를 포함

// 인터페이스: 클래스의 동작을 정의하는 '계약'역할, 다중 상속 효과
// - 객체가 어떤 행위를 해야 하는지를 정의
// - extends 사용하여 인터페이스 간에 다중 구현
// - 추상 메서드, 상수만 포함
// - 구현된 것은 아무것도 없고 밑그림만 그려진 '기본 설계도'

// 추상클래스: 관련된 클래스들의 공통적인 특징을 추출하여 '일부'구현을 포함한 상태 제공
// - '부분적 완성'클래스
// - extends 사용하여 단일 상속만 가능
// - 추상 메서드, 구체 메서드, 필드, 생성자 포함 가능

//! 인터페이스 선언 방법
// : 클래스와 작성하는 방법이 유사하지만 키워드 class 대신 interface를 사용
// : interface는 접근제어자로 public, default만 사용 가능

// interface 인터페이스명 { 
	 // 1. 멤버 변수
	 // interface가 가지는 필드는 모두 public static final 특성을 가짐
	 // : 모든 멤버변수는 public static final이어야 하며, 생략 가능
	 // 타입 상수명 = 값;

	 // 2. 메서드
	 // : public abstract 이어야 하며, 생략 가능
	 // void 메서드명();
// }

// 날 수 있는 것들에 대한 정의
interface PlayingCard {
	// 멤버 변수(public static final 포함)
	public static final int SPADE = 4;
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	
	// 메서드 (pulic abstract 포함)
	public abstract String getCardNumber();
	String getCardKind();
	
	// 디폴트 메서드
	// : 인터페이스에 새 기능을 추가하면서 기존 구현을 포함
	// - 기본 구현 제공, 오버라이딩(재정의) 가능
	default void defaultMethod() {
		System.out.println("디폴트 메서드입니다.");
	}
	
	// 정적 메서드
	// : 인터페이스에서 직접 구현 가능
	// - 인터페이스 이름으로 직접 호출 가능, 오버라이딩이 불가능
	static void staticMethod() {
		System.out.println("정적 메서드입니다.");
	}
}

// 인터페이스의 구현
// : 클래스에 implements 키워드를 사용하여 인터페이스 구현
class Card implements PlayingCard {
	
	// 인터페이스 안의 메서드를 구현한 클래스 메서드는 public 지정
	public String getCardNumber() {
		return "카드번호";
	}
	
	public String getCardKind() {
		return "1";
	}
}

public class B_Interface {
	public static void main(String[] args) {
		
	}
}
