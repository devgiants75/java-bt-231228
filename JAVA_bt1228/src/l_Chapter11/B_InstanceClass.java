package l_Chapter11;

// 자바 비정적 내부 클래스 (내부 클래스, 인스턴스 클래스)
// : 멤버 변수 선언부에 위치
// : static 키워드가 X
// : 외부 클래스의 객체를 먼저 생성한 후 내부 클래스 객체 생성이 가능
// : 주로 외부 클래스의 인스턴스 멤버(변수, 메서드)들과 관련된 작업 수행

// 주문 클래스
class Order {
	// 멤버 변수
	String pasta;
	String pizza;
	
	// 상세 주문 클래스
	class OrderDetail {
		int cheeze;
		
		// 내부 클래스의 메서드
		void amountCheeze() {
			// 외부 클래스의 멤버에 접근 가능
			// : 외부클래스명.this 형식: 명시적으로 외부 클래스의 인스턴스에 접근
			System.out.println(Order.this.pasta + cheeze);
			System.out.println(pizza + cheeze);
		}
	}
}
public class B_InstanceClass {

	public static void main(String[] args) {
		// 주문 클래스(외부 클래스) 인스턴스화
		Order order = new Order();
		order.pizza = "sweet potato pizza";
		order.pasta = "tomato pasta";
		
		// 내부 클래스 인스턴스화
		// : 외부클래스.내부 클래스 형식으로 내부클래스를 생성
		Order.OrderDetail orderDetail = order.new OrderDetail();
		
		orderDetail.cheeze = 10;
		orderDetail.amountCheeze();
	}
}
