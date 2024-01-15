package g_Chapte06;

// BaseballPlayer 클래스
class BaseballPlayer {
	// 인스턴스 변수
	// : 선수의 이름(name), 타율(battingAverage), 홈런 수(homeRus);
	// : 이름 - 문자열, 타율 - 실수, 홈런 수 - 정수
	String name;   // 선수의 이름
	double battingAverage; // 타율
	int homeRuns;  // 홈런 수
	
	// 정적 변수
	// : 생성된 선수의 총 수(playerCount) - 모든 인스턴스에서 공유
	static int playerCount = 0; // 생성된 선수의 총 수

	// 생성자
	// 생성자 - this
	// : 생성 시 선수의 이름, 타율, 홈런 수를 받아서 인스턴스 변수 초기화
	// : 생성 시 정적 변수를 후위 증가(변수명++)
	public BaseballPlayer(String name, double battingAverage, int homeRuns) {
			this.name = name;
			this.battingAverage = battingAverage;
			this.homeRuns = homeRuns;
			playerCount++; // 선수 생성 시 전체 수 증가
	}

	// 인스턴스 메서드
	// : updateStats: 선수의 타율과 홈런 수를 업데이트하는 메서드
	// : 매개변수로 newBattingAverage, newHomeRuns를 입력
	// : 타율 업데이트, 홈런 수 업데이트 (기존의 인스턴스 변수에 재할당)
	public void updateStats(double newBattingAverage, int newHomeRuns) {
			battingAverage = newBattingAverage; // 타율 업데이트
			homeRuns = newHomeRuns; // 홈런 수 업데이트
	}
}

public class MethodPractice {

	public static void main(String[] args) {
		// BaseballPlayer클래스로 야구선수 3명의 객체 생성
		// 총 생성된 선수의 수를 출력
		BaseballPlayer player1 = new BaseballPlayer("Hoo", 0.325, 20);
		BaseballPlayer player2 = new BaseballPlayer("Ryu", 0.275, 15);
		BaseballPlayer player3 = new BaseballPlayer("Kim", 0.375, 19);

		System.out.println("총 생성된 선수의 수: " + BaseballPlayer.playerCount);
	}
}
