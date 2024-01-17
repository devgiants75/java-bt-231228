package j_Chapter09;

// 자바에서의 타입 변환
// 자료형 변환: 변수와 자료형에서 학습했던 자동 형 변환 & 강제 형 변환
// 클래스의 타입 변환: 자동 & 강제 형 변환
// : 자료형 변환보다 가능한 범위가 좁다.
// : 서로 상속 관계에 있는 클래스 사이에서만 변환 가능

class Parent {
	void displayInfo() {
		System.out.println("부모 클래스입니다.");
	}
}

class Child extends Parent {
	// 메서드 재정의: 오버라이딩
	@Override
	void displayInfo() {
		System.out.println("자식 클래스입니다.");
	}
	
	void ownMethod() {
		System.out.println("자식만이 메서드입니다.");
	}
}

class Animal {
	void display() {
		System.out.println("동물입니다.");
	}
}

class Dog extends Animal {
	void display() {
		System.out.println("강아지입니다.");
	}
	
	void bark() {
		System.out.println("멍멍 짖습니다.");
	}
}

public class A_Class_Type {
	public static void main(String[] args) {
		// 클래스의 자동 타입 변환
		// : 직접 명시하지 않아도 자동으로 타입 변환이 일어나는 것
		// : 자식 클래스의 객체를 부모 타입의 객체로 변환하는 것
		
		// 클래스의 자동 타입 변환 구현 방법
		// 1. 자식 객체를 생성하면서 바로 부모 타입으로 변환할 때
//		부모클래스(타입) 객체변수 = new 자식클래스();
		
		// 2. 만들어진 자식 객체를 부모 타입으로 변환할 때
//		자식클래스(타입) 객체변수(a) = new 자식클래스();
//		부모클래스(타입) 객체변수 = 자식객체(a);
		Parent p1 = new Parent(); // 부모객체 생성
		Child c1 = new Child(); // 자식 객체 생성
		
		// 자동 형 변환
		Parent p2 = new Child(); // 자동 타입 변환
//		Child c2 = new Parent(); - Error
		p2.displayInfo(); // 자식 클래스입니다.
//		자동 형 변환의 경우, 해당 객체는 보존되고 사용만 부모 객체처럼 사용
		// 두 클래스 간의 공통된 특성이 아니라면 자식에게 있는 기능은 사용 X
//		p2.ownMethod(); - Error
		
		// 클래스의 강제 타입 변환
		// 구현 방법
		// 1. 일회성으로 타입 변환이 필요할 때
//		(자식 타입)부모타입
//		: 자식 메서드에 있는 접근
//		: (자식 타입)부모타입.메서드();
		
		// 2. 자식 클래스의 멤버들에 대한 접근이 여러번 필요한 경우
//		: 자식 타입 변수에 담아서 사용
//		: 자식 타입 변수 = (자식타입)부모타입;
		Animal genericAnimal = new Dog();
		genericAnimal.display(); // 강아지입니다.
		
		// 강제 형 변환
		// : 부모 타입의 객체에서 자식 객체에 접근하기 위해 사용
		Dog specificDog = (Dog)genericAnimal;
		specificDog.bark();
	}
}
