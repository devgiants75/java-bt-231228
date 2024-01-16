package h_Chapter07;

// 사람 클래스 (Person)
class Person {
	// 인스턴스 변수(이름, 나이)
	String name;
	int age;
	
	// 기본 생성자 - 인스턴스 변수 초기화 (매개변수 X - 기본값)
	Person() {
		this.name = ""; // 문자열의 초기값을 빈 문자열로 지정
		this.age = 0;
	}
	// 매개변수가 있는 생성자 - 오버로딩 (각각의 인스턴스 변수값을 매개변수로 전달)
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 매개변수가 있는 생성자 - 오버로딩 (이름만 매개변수로 전달받아 초기화, 나이는 0)
	Person(String name) {
		this.name = name;
		this.age = 0;
	}
	// 메서드(반환X, 매개변수X) - 사람의 정보를 출력
	// : Name: 이름, Age: 나이
	void personInfo() {
		System.out.println("Name: " + name + "Age: " + age);
	}
}

public class Z_Practice {
	public static void main(String[] args) {
		// 사람 인스턴스 3명 생성
		// 각각 다른 생성자로 생성, 각 인스턴스에 대한 메서드 호출
		Person person1 = new Person(); // 기본 생성자
		person1.name = "이승아";
		person1.age = 30;
		
		// 오버로딩된 매개변수를 2개 받는 생성자
		Person person2 = new Person("이도경", 29);
		
		// 오버로딩된 매개변수를 1개 받는 생성자
		Person person3 = new Person("이주헌");
		person3.age = 32;
		
		// 각 객체(인스턴스)에 대한 메서드 출력
		person1.personInfo();
		person2.personInfo();
		person3.personInfo();
		
	}
}
