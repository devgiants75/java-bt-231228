package h_Chapter07;

//! 상속
// : 한 클래스의 속성과 메서드를 다른 클래스가 물려 받는 기능
// - 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
// - 보다 적은 양의 코드로 새로운 클래스 작성 가능
// 		>> 코드의 재사용성 증가, 코드의 중복을 제거: 프로그램의 생산성을 높임

//! 상속 구현 방법
// : extends 키워드를 사용하여 상속 구현
// : 새로 작성하고자 하는 클래스의 이름 뒤에
// : , 상속하고자 하는 클래스의 이름을 키워드 'extends'와 함께 작성

class Parent {} // : 기존 클래스
class Child extends Parent {} // : 새로 작성하려는 클래스

// 상속해주는 클래스(Parent): 조상클래스, 부모클래스, 상위클래스, 기반클래스, 슈퍼클래스
// 상속 받는 클래스(Child): 자손클래스, 자식클래스, 하위클래스, 파생클래스, 서브클래스

//! 상속 예시
class Animal {
	String name;
}

// Dog 자식 클래스는 Animal 부모 클래스의 상속을 받음
// : 자식 클래스는 부모 클래스의 모든 멤버를 상속 받기 때문에 
// : , 자식 클래스의 멤버(속성, 메서드) 개수는 부모 클래스보다 항상 같거나 많음
// 		>> 상속에 사용되는 키워드가 extends인 이유

class Dog extends Animal {
	// 부모 클래스의 기능을 모두 상속 받기 때문에
	// String name; (생략된 것처럼 작용)
	
	// 짖다.
	void bark() {
		System.out.println("강아지가 짖습니다.");
	}
}

// 상속 예시
// : Tv클래스로부터 상속받고 기능을 추가하여 SmartTv클래스를 작성
class Tv {
	boolean power; // 전원 상태(on/off)
	int channel; // 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends Tv {
	boolean ott; // OTT 플랫폼 전원 상태(on/off)
	
	void displayOtt(String platform) {
		if (ott) { // OTT의 상태가 on(true)일 때만 platform을 보여줌
			System.out.println(platform);
		} else {
			System.out.println("OTT 연결이 되지 않았습니다.");			
		}
	}
}

public class Inheritance01 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		// 자식 클래스의 인스턴스를 생성하면 부모 클래스의 멤버도 함께 생성
		// >> 따로 부모 클래스의 인스턴스를 생성하지 않고도 
		//    , 부모 클래스의 멤버들을 사용 가능
		stv.channel = 10; // 부모 클래스로부터 상속받은 멤버(변수)
		stv.channelUp(); // 부모 클래스로부터 상속받은 멈버(메서드)
		System.out.println(stv.channel);
		
		stv.displayOtt("Netflex"); // OTT 연결이 되지 않았습니다.
		stv.ott = true; // OTT 기능을 켬
		stv.displayOtt("Netflex");
	}
}
