package l_Chapter11;

// 내부 클래스 복습
// 1. 비정적 내부 클래스 생성: 외부 클래스(Animal), 내부 클래스(Heart)
// 외부 클래스: private 필드 값(나이, age)
// 내부 클래스: 메서드 (심장박동, beat) - 출력 (외부 클래스의 필드값을 가져옴)
class Animal {
	private int age = 3;
	
	class Heart {
		void beat() {
			System.out.println(Animal.this.age + " years old");
		}
	}
}

// 2. 정적 내부 클래스 생성: 외부(Car), 내부(Engine)
// 외부 클래스: private 필드 값(모델, model)
// 내부 클래스: 메서드 (출발, start) - 출력 (외부 클래스의 필드값을 가져옴)
class Car {
	private static String model = "Tesla Model S";
	
	static class Engine {
		void start() {
			System.out.println(model);
		}
	}
}

public class G_Practice01 {
	public static void main(String[] args) {
		// 비정적 내부 클래스
		// bear 메서드 호출
		Animal animal = new Animal();
		Animal.Heart heart = animal.new Heart();
		
		heart.beat();
		
		// 정적 내부 클래스
		// start 메서드 호출
		Car.Engine engine = new Car.Engine();
		engine.start();
	}
}
