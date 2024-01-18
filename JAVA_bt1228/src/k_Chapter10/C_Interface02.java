package k_Chapter10;

interface Flyable {
	int MAX_SPEED = 100; // public static final
	void fly(); // public abstract
	
	// 디폴트 메서드
	default void land() {
		System.out.println("Landing");
	}
	
	// 정적 메서드
	static int getWingCount() {
		return 2;
	}
}

class Bird implements Flyable {
	public void fly() {
		// 인터페이스에 정의된 상수 사용 가능
		System.out.println("Bird is flying at speed" + MAX_SPEED);
	}
	
	@Override
	public void land() {
		System.out.println("...Landing...");
	}
}

public class C_Interface02 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		
		// bird의 구현 메서드
		bird.fly();
		// 디폴트 메서드
		bird.land(); // 재정의 가능
		
		// 정적 메서드: 인터페이스 이름으로 직접 호출
		System.out.println(Flyable.getWingCount());
	}
}
