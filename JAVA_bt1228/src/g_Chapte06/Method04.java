package g_Chapte06;

// 정적 메서드
// : 메서드 앞에 static 키워드를 붙이는 경우 클래스(정적)메서드 생성 가능
// : 객체를 생성하지 않고도 '클래스명.메서드명(매개변수)'으로 호출 가능

// : 인스턴스 변수와 관계 없는 메서드를 클래스 메서드로 정의
// : 인스턴스 변수는 객체를 생성해야만 사용 가능

// static 사용 권장 사항
// 1. 클래스 설계 시, 변수(속성) 중 모든 인스턴스가 공통적으로 사용하는 값
// 2. 클래스 변수는 인스턴스 생성 없이도 사용 가능
// 3. 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
// 	- 클래스 메서드 내에서 인스턴스 변수 호출(사용) X
// 4. 메서드 내에서 인스턴스 변수를 사용하지 X, static을 붙이는 것을 고려

// 정적 메서드 예제
class Operator {
	// 인스턴스 변수
	int a, b;
	
	// 인스턴스 메서드: 인스턴스 변수인 a, b가 필요한 작업
	// - 매개변수가 필요 X
	int add() { return a + b; } // a, b는 인스턴스 변수
	int subtract() { return a - b; } // a, b는 인스턴스 변수
	int multiply() { return a * b; } // a, b는 인스턴스 변수
	double divide() { return a / b; } // a, b는 인스턴스 변수
	
	// 정적 메서드: 인스턴스 변수와 관계없이 매개변수만으로 작업 가능
	static int add(int a, int b) { return a + b; }
	static int subtract(int a, int b) { return a - b; }
	static int multiply(int a, int b) { return a * b; }
	static int divide(int a, int b) { return a / b; }
}

public class Method04 {
	public static void main(String[] args) {
		System.out.println("===정적 메서드===");
		// 정적(클래스) 메서드 호출 - 인스턴스 생성없이 호출 가능
		System.out.println(Operator.add(30, 40));
		System.out.println(Operator.subtract(30, 40));
		System.out.println(Operator.multiply(30, 40));
		System.out.println(Operator.divide(30, 40));
				
		System.out.println("===인스턴스 메서드===");
		Operator oper01 = new Operator(); // 인스턴스 생성
		oper01.a = 10;
		oper01.b = 20;
		
		// 인스턴스 메서드 호출
		System.out.println(oper01.add());
		System.out.println(oper01.subtract());
		System.out.println(oper01.multiply());
		System.out.println(oper01.divide());
	}
}