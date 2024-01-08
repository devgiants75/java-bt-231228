package d_Chapter03;

import java.util.Random;
import java.util.Scanner;

public class C_Array03 {

	public static void main(String[] args) {
//		가위 바위 보 게임
		// : 사용자가 가위, 바위, 보 중 하나를 선택
		// : 컴퓨터도 동일하게 무작위로 하나를 선택하여 승패를 결정

		Scanner sc = new Scanner(System.in);
		// 난수를 생성하는 Random 기능
		Random rd = new Random();
		
		// 가위 바위 보 배열
		String[] choices = {"가위", "바위", "보"};
		String userChoice;
		String computerChoice;
		
		// 컴퓨터가 선택할 항목의 인덱스를 저장하는 변수
		int computerChoiceIndex;
				
		while (true) {
			System.out.println("가위 바위 보 중 하나를 선택하세요.");
			System.out.println("게임 종료를 원하면 '종료'를 입력하세요.");
			
			userChoice = sc.nextLine();
			
			if(userChoice.equals("종료")) {
				break;
			}
			
			// 컴퓨터의 선택
			// 0부터 choices 배열의 길이-1 사이의 무작위 수를 생성
			computerChoiceIndex = rd.nextInt(choices.length);
			computerChoice = choices[computerChoiceIndex];
			
			// 승패 결정 로직
//			승리
			if((userChoice.equals("가위") && computerChoice.equals("보")) 
				|| (userChoice.equals("보") && computerChoice.equals("바위")) 
				|| (userChoice.equals("바위") && computerChoice.equals("가위"))
			) {
				System.out.println("이겼습니다.");
			} else if (userChoice.equals(computerChoice)) {
//			비김
				System.out.println("비겼습니다.");
			} else {
				System.out.println("졌습니다.");
			}
		}
		sc.close();
		System.out.println("게임을 종료합니다.");
	}
}
