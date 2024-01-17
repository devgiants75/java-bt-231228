package j_Chapter09;

//! 다형성
// : 많은 형태를 가질 수 있는 능력
// : 하나의 객체가 여러 타입의 인스턴스로 취급될 수 있는 특성
// : 상속 + 메서드 오버라이딩 + 클래스 타입 변환

// instanceof 연산자
// : 주어진 객체가 특정 클래스의 인스턴스인지
// , 혹은 그 클래스를 상속받은 자식 클래스의 인스턴스 인지 확인하는 데 사용
// 사용 방법
// 참조 변수의 값 instanceof 타입(클래스명)

class Vehicle {
	void display() {
		System.out.println("운송수단입니다.");
	}
}

class Car extends Vehicle {
	@Override
	void display() {
		System.out.println("자동차를 타고 갑니다.");
	}
}

class Bus extends Vehicle {
	@Override
	void display() {
		System.out.println("버스를 타고 갑니다.");
	}
}

public class B_Ploymorphism {
	public static void main(String[] args) {
		// 자동 형 변환
		Vehicle myVehicle = new Vehicle();
		Vehicle myCar = new Car();
		Vehicle myBus = new Bus();
		
		if (myCar instanceof Vehicle) {
			System.out.println("자동차는 운송수단입니다.");
		}
		
		if (myBus instanceof Vehicle) {
			System.out.println("버스는 운송수단입니다.");
		}
		
		if (myVehicle instanceof Car) {
			System.out.println("운송수단은 차입니다.");
		} else {
			System.out.println("운송수단은 차가 아닙니다.");
		}
		
		// instanceof 연산자를 계산하여 true의 결과값이 출력되면
		// : 검사한 클래스 타입으로 형 변환이 가능하다
		// : 형 변환 전에 instanceof 확인을 통해 코드의 오류를 방지
	}
}
