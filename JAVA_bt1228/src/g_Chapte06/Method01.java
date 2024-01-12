package g_Chapte06;

//! 자바 객체 지향 프로그래밍
// - '클래스': 객체를 생성하기 위한 템플릿
// - '클래스'의 구조: 필드, 생성자, 메서드

// 클래스의 필드: 클래스의 특성이 담긴 속성
// 클래스의 메서드: 클래스 내부에서 속성을 사용하거나 특정 작업을 수행하는 코드 블럭
// - 클래스 내에 정의
// - 클래스의 객체가 수행할 수 있는 동작
// - 프로그램의 재사용성과 구조를 향상시키는 역할

//! 메서드의 구조
// ReturnType methodName(Parameter List) {
// 		메서드 기능, 동작 정의
// }

// - ReturnType(반환 유형)
// : 메서드가 작업을 수행한 후 반환하는 데이터의 유형을 지정
// : 반환 유형이 없는 경우 void로 지정

// - methodName(메서드 이름)
// : 메서드를 식별하는 이름
// : 작업을 대표하여 설명하는 동사로 명명하는 것이 일반적

// - Parameter List(매개변수 목록)
// : 메서드에 전달되는 입력 값들의 목록
// : 0개 이상으로 지정(지정하지 않을 수 있으며 원하는 개수만큼 전달도 가능)
// : 각 매개변수는 자료형과 함께 선언

// 계산기 클래스
class Calculator {
	// 계산기의 덧셈 기능
	
	// 반환유형이 int(정수)인 메서드
	// 매개변수로 a, b의 정수를 입력 받음
	int addNumbers(int a, int b) {
		
		// 메서드의 반환값 작성
		// : return 키워드를 사용하여 지정된 타입의 데이터를 반환
		int sum = a + b;
		return sum;
	}
}

public class Method01 {
	public static void main(String[] args) {
//		메서드의 사용
		// : 해당 메서드가 정의된 클래스의 객체를 생성
		// : .연산자를 사용하여 메서드 호출
		Calculator calc = new Calculator(); // Calculator 클래스의 객체 생성
		
		// 반환값을 int 변수에 저장
		int result = calc.addNumbers(30, 40); // addNumbers 메서드 호출
		System.out.println(result); // 70
	}
}