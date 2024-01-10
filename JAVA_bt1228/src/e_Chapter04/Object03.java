package e_Chapter04;

// 클래스 파일명 변경
// 파일 클릭 후 f2
// : 파일 탐색기에서 임의로 변경하는 경우, 파일 내의 class명이 변경되지 않아 오류

// 클래스의 구조: 필드, 메서드, 생성자
class Car {
	// 클래스의 속성(필드)
	String model; // 모델
	int year; // 제조 연도
	
	// 클래스의 행동(메서드)
	// : 클래스 내에서 정의된 함수, 객체의 행동을 표현
	// : 클래스의 데이터(필드)를 사용하여 특정 작업을 수행하거나, 값을 반환할 수 있다
	
	// void: 해당 메소드가 반환하는 결과가 X
	// - 반환(return)이 존재하지 않는 경우 메소드명 앞에 반드시 작성
	void displayInfo() {
		System.out.println("Model: " + model + ", Year: " + year);
	}
	
	// 클래스의 생성자
	// : 클래스 이름과 동일, 객체가 생성될 때 자동으로 호출
	// : 필요한 초기화 작업을 수행하거나, 객체 생성 시 필요한 데이터를 전달
	
	// 기본 구조 - 클래스명 (전달 받을 데이터-초기화 값) {
	//		전달 받은 데이터를 클래스 변수(필드)에 할당
	// }
	
	Car(String model, int year) {
		// this 키워드
		// : 클래스의 필드와 생성자로 받아오는 데이터의 이름이 같을 경우
		// : 이를 구별하기 위해 사용
		// this.model은 필드, model은 객체 생성 시 받아오는 값
		this.model = model;
		this.year = year;
	}
}

public class Object03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
