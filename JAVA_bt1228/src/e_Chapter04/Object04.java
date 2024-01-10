package e_Chapter04;

// 클래스
class Book {
	// Book 클래스의 필드(속성)
	String title; // 책 제목
	String author; // 책 저자
	
	// Book 클래스의 생성자 - 객체 생성 시 필드 기본 값 설정
	Book(String title, String author) {
		// this가 해당 클래스임을 자동으로 인식
		this.title = title;
		this.author = author;
	}
	
	// Book 클래스의 메서드(행동)
	void displayInfo() {
		System.out.println("Title: " + title + ", Author: " + author);
	}
}

public class Object04 {

	public static void main(String[] args) {
		// 객체 생성 
		// 1. 클래스 정의: 객체의 설계도 제작
		// 2. 객체 인스턴스화
		// : 클래스를 바탕으로 객체를 메모리에 인스턴스(저장)하는 과정
		// : new 키워드를 사용
		// 3. 생성자 호출
		// : new 키워드 다음에는 클래스 생성자 호출
		// : 객체의 초기 상태를 설정
		
		// 클래스명의 클래스의 새로운 객체를 생성
		// , 해당 객체에 대한 참조(주소)를 myBook 변수에 저장
		// myBook은 Book이라는 클래스 타입을 가짐
		Book myBook = new Book("Little Prince", "Saint");
		
		// 객체 사용
		// 1. 필드 접근
		// : 객체의 필드에 접근하거나, 수정: 점(.)연산자 사용
		System.out.println(myBook.title); // Little Prince
		System.out.println(myBook.author); // Saint
		
		// : 메서드 호출
		// : 객체의 메서드(행동)를 호출하기 위해 점(.)연산자 사용
		myBook.displayInfo(); // Title: Little Prince, Author: Saint
		

	}

}
