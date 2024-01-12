package g_Chapte06;

// 인스턴스 변수, 정적(클래스) 변수

// 예) 카드 클래스

// 카드 속성: 너비, 높이, 숫자, 무늬

class Card {
	// 인스턴스 변수
	// - 각 카드 마다 고유의 속성 (개별 속성)
	// - 일반 변수 선언과 동일
	int number; // 숫자
	String kind; // 무늬
	
	static int width = 100; // 너비
	static int height = 250; // 높이
}
public class ClassPractice {

	public static void main(String[] args) {
		// 정적(클래스) 변수
		// - 클래스이름.클래스변수로 직접 사용이 가능
		// - 객체 생성 없이 사용 가능
		System.out.println("Card widht: " + Card.width);
		System.out.println("Card height: " + Card.height);
		
		// 클래스 Card의 객체(인스턴스) 생성
		// Card c1 = new Card();
		Card c1; // 클래스 Card 타입의 c1 변수 선언
		c1 = new Card(); // new Card() 생성자로 생성된 인스턴스를 c1에 저장
		
		// 인스턴스 생성 후 인스턴스 변수에 접근(변수 초기화 또는 변수 값 변경)
		c1.kind = "Spade";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Heart";
		c2.number = 4;
		
		System.out.println(c1.kind + c1.number);
		System.out.println(c2.kind + c2.number);
		
		// 인스턴스를 통해서 정적 변수에 접근이 가능
		// - 그러나 정적 변수와 인스턴스 변수의 혼돈을 막기위해 
		// 		,항상 클래스이름.클래스변수로 호출하는 것을 권장
		System.out.println(c1.width);
	}
}
