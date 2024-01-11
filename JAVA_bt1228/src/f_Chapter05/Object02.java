package f_Chapter05;

// 클래스 변수와 인스턴스 변수의 차이

// 형태
// : 멤버 변수(필드) 중에 static이 붙은 것은 클래스 변수, 붙지 않은 것은 인스턴스 변수

// 선언 위치
// : 클래스 영역 내에서 선언

// 생성 시기 & 사용 시기
// 1. 클래스 변수: 클래스가 메모리에 올라갈 때 - 객체 생성 이전에 클래스명을 가지고 호출
// 2. 인스턴스 변수: 인스턴스가 생성되었을 때 - 객체 생성 이후에만 호출 가능

// 호출 방법
// 클래스 변수: 클래스명.변수명
// 인스턴스 변수: 객체명.변수명
class Example {
	int instanceValue; // 인스턴스 변수
	static int classValue; // 클래스(정적) 변수
}

class Counter {
	// 클래스 변수
	static int count = 0;
	
	// 인스턴스 변수
//	int count = 0; - 각 객체마다 고유한 값을 가짐
	
	// Counter 클래스에서 인스턴스가 생성될 때 count 증가
	Counter() {
		count++;
	}
}

public class Object02 {

	public static void main(String[] args) {
		Counter c1 = new Counter(); // count 1 증가
		Counter c2 = new Counter(); // count 1 증가
		Counter c3 = new Counter(); // count 1 증가
		
//		System.out.println(c3.count); // 1
		
		// 클래스 변수는 모든 객체에서 공유되는 값
		// 클래스 자체에 저장된 메모리
		
		new Counter();
		new Counter();
		System.out.println(Counter.count); // 5
	}
}
