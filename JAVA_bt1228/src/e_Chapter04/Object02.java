package e_Chapter04;

// 객체 지향 프로그래밍
// 클래스와 객체 이해

// 클래스(Class) 정의
// - 객체를 만들기 위한 템플릿
// - 객체의 상태(속성)와 행동(메소드)을 정의
// - 실제 데이터나 코드 X, 데이터와 기능의 구조를 정의하는 하나의 개념적인 틀
// : class 키워드를 사용하여 정의

// 객체(Object) 정의
// - 클래스에 정의된 속성과 동작을 가지고 있는 '실체'
// - 클래스를 기반으로 생성, 클래스의 인스턴스라고 불림
// - 각 객체는 독립적인 상태와 행동을 가짐, 다른 객체와 상호작용 가능

// 클래스와 객체의 차이점
// - 클래스는 정의일 뿐 / 객체는 실제로 메모리에 존재하는 실체

// 클래스 선언 방법 - 대괄호의 작성란은 생략 가능

// [access modifier] class ClassName {
		// fields (속성)
		// methods (메소드)
// }

// access modifier
// 접근 제한자(제어자)
// : 클래스의 가시성을 정의 - 해당 클래스의 접근에 대한 권한을 부여
// : public, private, protected, default

// class 키워드
// : 클래스 선언임을 나타내는 키워드

// className
// 클래스명
// : 명명규칙 - 명사, 대문자, 파스칼 케이스(첫 번째 글자 대문자, 연결 키워드 시작 대문자)
// ChocoCookie, StrawberryBanana 

// fields
// 클래스의 속성을 정의하는 변수

// methods
// 클래스의 동작을 정의하는 함수 
// : 명명규칙 - 동사, 소문자, 카멜 케이스(첫 글자 소문자, 연결 키워드 시작 대문자)
// run, goHiking, playPiano

// 외부의 어떤 파일 또는 내부의 어느 위치에서든 해당 클래스에 접근 가능
public class Object02 {
	public static void main(String[] args) {
		// 접근 제어자를 생략
		// : 같은 패키지 내에서 다른 클래스에 접근 가능
		
		// private 접근 제어자
		// : 해당 클래스 내에서만 접근 가능
		class Car {
			// 자바 클래스의 필드
			// 속성: 변수, 특성, 필드, 상태
			// 클래스 내에서 데이터를 저장하는 변수
			
			// - 데이터 타입 별 필드 선언
			int maxSpeed; // 최대 속력
			double weight; // 중량
			boolean isElectric; // 전기자동차인지에 대한 여부
		}
		
		class Book {
			String title; // 책 제목
			String author; // 저자
			int[] pageNumber; // 책의 페이지 수
		}
		
//		사람 클래스
		// 이름, 나이, 키, 취업 여부 
		class Person {
			String name;
			int age;
			double height;
			boolean isEmplyed; // 취업 여부 // isPerson - is 의문사로 표현
		}
	}
}
