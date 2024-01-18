package k_Chapter10;

//! 추상 클래스
// : 완전하지 않은 클래스, 다른 클래스가 상속받아 완성할 수 있는 '미완성 설계도'
// : 하나 이상의 추상 메서드(구체적인 구현이 없는 메서드)를 포함하는 클래스

// - 특징
// 1. 클래스 자체로는 인스턴스 생성이 불가
// 2. 추상 메서드를 하나 이상 포함 (추상 메서드는 구체적인 기능 X)
// 3. 확장성 제공을 위한 사용

// - 사용 방법
// : abstract 키워드를 사용하여 선언

//! 추상 메서드
// : 메서드의 선언부만 존재, 구현부는 존재하지 않는 메서드
// : 자식 클래스에서 해당 메서드를 반드시 구현하도록 강제하는 역할
// - abstract 키워드를 사용
// - 추상 메서드를 하나 이상 포함하는 클래스는 반드시 추상 클래스로 선언

// - 추상메서드 구현 방법
// 구현부 {} 대신 세미콜론(;)을 사용하여 선언을 마침

// - 추상 메서드의 특징
// : 구현부가 없기 때문에 직접 호출 X
// : 자식 클래스에서 추상 메서드를 구현할 때
//   선언부(반환타입 메서드명 파라미터)가 추상 메서드와 동일

// - 동일한 기능을 수행하지만 해당 방식이 다른 객체들을 효율적으로 관리

// 추상 클래스 예제
abstract class Human {
	// 메서드의 구성
	// 선언부, 구현부
	// (접근제어자) 반환타입 메서드명(매개변수) { 메서드의 기능 동작 }
	
	// 추상 메서드
	// : 선언만 있고 구현 내용이 없는 메서드
	// : abstract 키워드를 사용하여 선언
	abstract void work();
}

// 추상클래스는 자신의 추상 메서드를 포함하는 자식 클래스에 의해 반드시 구현되어야 한다.
// 추상클래스를 상속받은 자식 클래스가 추상 메서들르 구현하지 않는다면
// : 해당 자식 클래스도 추상 클래스로 선언하여야 한다!

class Police extends Human {
	void work() {
		System.out.println("경찰은 치안유지 업무를 담당합니다.");
	}
}

// '동물' 추상 클래스 생성
abstract class Animal {
	// - makeSound 추상 메서드를 포함 
	abstract void makeSound();
	
	// 구체적인 메서드(일반 메서드 - 선언부, 구현부)
	void eat() {
		System.out.println("This animal eats food");
	}
}

// 고양이, 강아지 클래스 생성
// - '동물' 추상 클래스를 상속
// - makeSound 추상 메서드를 구현 강아지(멍멍), 고양이(야옹)
class Cat extends Animal {
	// 추상 메서드 구현
	void makeSound() {
		System.out.println("야옹");
	}
	
	// 상속받은 메서드 재정의(오버라이딩)
	@Override
	void eat() {
		System.out.println("This animal eats 츄르");
	}
}

class Dog extends Animal {
	// 추상 메서드 구현
	void makeSound() {
		System.out.println("멍멍");
	}
}

public class A_Abstract {
	public static void main(String[] args) {
		// 인스턴스 생성 (강아지, 고양이)
		// : 메서드 사용
//		Animal animal = new Animal(); - Error (추상 클래스는 인스턴스화 X)
		Cat cat = new Cat();
		Dog dog = new Dog();
		dog.makeSound(); // 구현된 메서드 호출
		dog.eat(); // 상속받은 메서드 호출
		
		cat.eat();
	}
}
