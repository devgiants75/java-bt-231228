package i_Chapter08;

// 접근 범위: 제한 X
public class AccessExample {
	public int publicVar = 1;
	// 같은 패키지 O, 다른 패키지 - 해당 클래스를 상속받는 자식클래스에서 접근 가능
	protected int protectedVar = 2;
	// 같은 패키지 O, 다른 패키지 X
	int defaultVar = 3; // default 접근 제어자
	// 동일한 클래스 내에서만 접근
	private int privateVar = 4;

	// 접근 제한 범위를 보여주는 메서드
	public void showAccess() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
		System.out.println(privateVar);
	}
	
	protected void showProtected() {
		System.out.println(protectedVar);
	}
	
	void showDefault() {
		System.out.println(defaultVar);
	}
	
	private void showPrivate() {
		System.out.println(privateVar);
	}
	
}



