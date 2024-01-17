package i_Chapter08;
// 자바 패키지 또는 클래스 파일 간의 
// 코드 연결을 위해서는 import문을 사용하여 
// 해당 패키지 또는 클래스 파일명을 명시해야 한다.

// 같은 패키지 내: import 클래스파일명;
// 다른 패키지: import 패키지명.클래스파일명;
import parentPackage.ParentClass;

// 접근 제어자

//! 접근 제어자 정의
// : 클래스, 메서드, 변수의 접근 범위를 제어

//! 접근 제어자의 종류
// : private, default, protected, public
// : '클래스나 멤버 변수, 메서드, 생성자'에 접근제어자가 지정되어 있지 않은 경우
// : >> default(기본값)으로 지정

//! 접근 제어자의 범위
// public > protected > (default) > private

// private: 같은 클래스 내에서만 접근 가능
// protected: 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능
// (default): 같은 패키지 내에서만 접근이 가능
// public: 접근 제한이 전혀 없이 접근 가능

// 1. private
class PrivateClass {
	// 같은 클래스 내에서만 접근 가능한 private 멤버 변수
	private int myField;
	private void myMethod() {}
}

// 2. default
// : 같은 패키지 내라면 중복 X
// : 패키지 외부에서는 접근 X
class DefaultClass {
	// 같은 패키지 내의 다른 클래스들에 접근 가능
	int myField;
	void myMethod() {}
}

class ChildClass extends PrivateClass {
	void childMethod() {
		// 부모 클래스의 MyFiled 변수가 private 설정이 되어있어
		// 해당 클래스 외부에서는 접근 X
//		super.myField; - Error
	}
}

// 3. protected
// : 동일한 패키지 내의 모든 클래스와 다른 패키지의 하위 클래스에서 접근 가능
class ProtectedClass extends ParentClass {	
	protected int myField;

	// 메서드 호출은 항상 실행 메서드 내에서 작성되어야 한다.
	// : 클래스 본문 안에서 직접 실행 코드(출력, 메서드 호출) 지정 X
	// : 메서드 내에서 실행코드 작성
	public ProtectedClass() {
		// 생성자에서 부모 클래스 protected 필드와 메서드에 접근
		// 부모 클래스의 protected 필드에 접근
		System.out.println(protectedField); 
		
		// 부모 클래스의 private 필드에 접근
		protectedMethod();
	}
	protected void myMethod() {}
}

// 4. public
// : 어떤 클래스든 어떤 패키지 내에 있든 접근 가능

public class A_modifier {
	public static void main(String[] args) {}
}
