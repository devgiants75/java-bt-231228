package l_Chapter11;

// 익명 내부 클래스 (익명 클래스, Anonymous)
// : 이름이 없는 클래스
// : 주로 일화용으로 사용되는 인스턴스를 생성할 때 사용
// : 클래스를 별도로 선언하지 않고도, 바로 인스턴스화 가능

// 특징
// - 이름 X >> 생성자 X
// 제한: 외부의 final 키워드인 변수에만 접근이 가능

interface DiscountEvent {
	void applyDiscount();
}

class OnlineShoppingMall {
	
	void startSaleEvent(String event) {
		// 익명 클래스는
		// : 인스턴스화와 동시에 클래스 정의
		DiscountEvent eventHandler = new DiscountEvent() {
			// 클래스 정의
			public void applyDiscount() {
				System.out.println("Appying 50% discount");
			}
		};
		
		// 할인 이벤트 처리기를 실행
		eventHandler.applyDiscount();
	}
}

public class E_AnonyClass {
	public static void main(String[] args) {
		// 인스턴스화
		OnlineShoppingMall myMall = new OnlineShoppingMall();
		
		// 인스턴스 내의 메서드 호출
		myMall.startSaleEvent("Black Friday");
	}
}