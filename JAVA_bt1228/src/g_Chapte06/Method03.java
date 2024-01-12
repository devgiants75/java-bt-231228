package g_Chapte06;

// 사칙연산 클래스
// : 두 개의 값을 매개변수로 전달받아 사칙연산 수행
// : add, subtract, multiply, divide의 4개의 메서드
class MyMath {
	
	int add(int a, int b) { 
		return a + b; 
	}
	int subtract(int a, int b) { return a - b; }
	int multiply(int a, int b) { return a * b; }
	double divide(int a, int b) { return a / b; }
	
	// return문
	// : 현재 실행중인 메서드를 종료하고 호출한 메서드로 돌아감
	// : 반환값의 유무에 관계없이 모든 메서드에는 
	// : , 적어도 하나 이상의 return문이 존재해야 함
	// : 	- 자바 컴파일러가 메서드의 마지막에 자동으로 return;을 추가
	
	// 반환이 없는 메서드
	void noReturn() {	
		System.out.println("해당 메서드는 반환값이 없습니다.");
		return; // 반환 타입이 void이기 때문에 생략 가능 - 컴파일러가 자동 추가
	}
	
	// 반환값이 있는 메서드
	String yesReturn() {
		String msg = "해당 메서드는 반환값이 있습니다.";
		// 반환타입이 void가 아닌 경우 return문 작성을 생략 시 오류 발생
		return msg;
	}
	
	// 조건에 따른 반환값 지정
	int max(int a, int b) {
		if (a > b) {
//			a가 b보다 클 경우에만 반환하기 때문에 return이 없을 수도 있는 오류
//			조건이 참일 때만 실행
			return a;
		} else {
//			항상 결과값이 반환되도록 지정
			return b;
		}
	}
	
	// 반환값
	// : 주로 계산한 결과를 변수에 저장하여 변수를 반환하는 경우가 많음 
		// return value;
	// : 수식 자체를 반환하는 것도 가능
		// return x + y;
	
	// 조건에 따른 반환의 명료한 작성
	// if - else문
	// : 조건에 따라 코드 실행 여부를 제어
	int min(int a, int b) {
		// if - else 조건문의 경우 실행할 코드 블럭 한 줄이면 중괄호 생략
//		if (a > b) return b;
//		else return a;
		
		// 삼항 연산자
		// if (조건) { 조건이 참인 경우 } else { 조건이 거짓인 경우 }
		// 조건 ? 조건이 참인 경우 : 조건이 거짓인 경우
		// return문에 삼항 연산자 서식이 작성
		return a > b ? b : a;
	}
}

public class Method03 {
	public static void main(String[] args) {
		MyMath mm = new MyMath(); // 인스턴스 생성
		
		// 메서드의 실행 흐름
		// 1. main메서드에서 메서드 add를 호출 - 인자를 매개변수에 전달
		// 2. 메서드 add 내에서 중괄호{} 구현부 내의 문장이 순서대로 수행
		// 3. 메서드 add의 모든 문장이 실행거나 return문을 만나면
		// 		, 호출된 메서드(main)로 돌아와 이후 문장을 실행
		//		, 반환된 값을 value 변수에 할당
		//   	, 함수가 void 타입으로 바로 출력하는 경우 console창에 출력
		int value1 = mm.add(10, 20); // 메서드 호출
		int value2 = mm.subtract(20, 10);
		int value3 = mm.multiply(5, 3);
		double value4 = mm.divide(5, 3);
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}
}
