package l_Chapter11;

// 정적 내부 클래스(스태틱 클래스)
// : static 키워드가 붙은 내부 클래스
// : 단! 일반적인 static 필드 변수나 static 메서드와 다름!
// : >> static 클래스 내부에는 instance 멤버와 static 멤버 모두 선언 가능
// : >> 외부 클래스의 인스턴스 멤버에는 접근이 불가, 정적 멤버에만 접근 가능
// : 외부 클래스의 인스턴스에 종속되지 X

class PocketBall {
	int size = 100;
	static int price = 5000;
	
	// 정적 내부 클래스
	// : this키워드는 내부 클래스의 인스턴스를 참조하기 때문에
	// : 정적 내부 클래스에서는 사용 불가
	static class PocketMonster {
		static String name = "꼬부기";
		// 정적 내부 클래스 내의 인스턴스 변수 
		// - 해당 정적 클래스를 인스턴스화 한 이후 사용 가능
		int level = 20;
		
		// 정적 메서드
		public static void getPocketMonster() {
			// 외부 클래스의 인스턴스 멤버에는 접근 불가
//			System.out.println(size); - Error
			
			// 외부 클래스의 정적 멤버에는 접근 가능
			System.out.println(price);
			
			// 내부 클래스의 정적 멤버에는 접근 가능
			System.out.println(name);
			
			// 내부 클래스의 인스턴스 멤버에도 접근 불가
//			System.out.println(level); - Error
		}
	}
}

public class C_StaticClass {
	public static void main(String[] args) {
		// 정적 내부 클래스의 인스턴스는 외부 클래스 인스턴스화 없이 선행 가능
		PocketBall.PocketMonster poketmon = new PocketBall.PocketMonster();
		
		poketmon.level = 30;
		System.out.println(poketmon.level);
		
		// 정적 클래스 내의 정적 멤버는 내,외부 클래스의 인스턴스화 없이도 사용 가능
		System.out.println(PocketBall.PocketMonster.name);
	}
}