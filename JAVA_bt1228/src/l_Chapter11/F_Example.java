package l_Chapter11;

// 비정적 내부 클래스
// : 외부 클래스의 인스턴스에 종속적
// 예) 집-가구
class House {
	class Furniture {
		// House 인스턴스에 종속적
		// A라는 집(객체)안에 가구가 생성
	}
}

// 정적 내부 클래스
class City {
	static class CityPlan {
		// City 인스턴스로부터 독립적
	}
}

public class F_Example {
	public static void main(String[] args) {
		// 1. 비정적 내부 클래스
		House myHouse = new House();
		// House 인스턴스를 통해서만 Furniture를 생성할 수 있다.
		House.Furniture myChair = myHouse.new Furniture();
		
		// 2. 정적 내부 클래스
		City.CityPlan plan = new City.CityPlan();
	}
}
