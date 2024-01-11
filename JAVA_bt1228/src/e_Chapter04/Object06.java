package e_Chapter04;

// 축구 선수 클래스 작성
// FootballPlayer 클래스 작성

// 클래스 필드
// : 선수 이름(name), 포지션(position), 팀 이름(team), 골 수(goals)

// 선수 정보를 출력하는 메서드
// : displayInfo() - 반환 X
// : name, position, team, goals

class FootballPlayer {
//	필드(속성)
//	선언만 이루어지면 자동으로 해당 데이터 타입의 기본값이 부여
//	참조 타입: null
//	기본 타입: 각 타입의 기본값(char: "", int: 0, boolean: false)
	String name;
	String position;
	String team;
	int goals;
	
	// 클래스는 생성자를 명시하지 않아도 자동으로 데이터를 받지않는 빈 생성자를 포함
	// : 필드에 초기값 설정을 하지 않는 객체를 생성
	FootballPlayer() {
		
	}
	
	void displayInfo() {
//		자동 줄 바꿈 
//		: Window > Editor > Toggle Word Wrap
//		: alt + shift + y
		System.out.println(name + ", " + position + ", " + team + ", " + goals);
	}
}

public class Object06 {

	public static void main(String[] args) {
		
		// FootballPlayer 클래스를 사용한 player1 객체(인스턴스) 생성
		// new FootballPlayer(); - 생성자
		FootballPlayer player1 = new FootballPlayer();
		player1.displayInfo(); // 선수 정보 출력 - null, null, null, 0
		
		// 생성된 객체(인스턴스)에 필드값을 초기화
		// 또는 이미 생성된 객체의 필드값을 재할당하는 경우
		player1.name = "son";
		player1.position = "striker";
		player1.team = "tottenham";
		player1.goals = 12;
		
		player1.displayInfo(); // - son, striker, tottenham, 12
		player1.goals = 13;
		player1.displayInfo(); // - son, striker, tottenham, 13
	}

}
