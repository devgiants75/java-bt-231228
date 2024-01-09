package d_Chapter03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class G_ArrayList02 {

	public static void main(String[] args) {
//		ArrayList 생성
		// : 문자열(String) 요소를 담는 배열
		ArrayList<String> items = new ArrayList<>();
		
		// 배열명.add()을 사용하여 배열에 요소 추가
		items.add("사과");
		items.add("책");
		items.add("연필");
		items.add("시계");
		items.add("컵");
		
		// Random 기능을 사용하여 무작위 요소를 선택
		Random random = new Random();
		// 0번 째 인덱스부터 마지막 요소의 인덱스까지의 수 중에서 무작위 수 생성
		String selectItem = items.get(random.nextInt(items.size()));

		// 사용자의 입력
		Scanner scanner = new Scanner(System.in);
		String userGuess;

		while (true) {
			System.out.println("물건을 맞춰보세요.");
			userGuess = scanner.nextLine(); // 사용자로부터 추측을 입력
			
			if (userGuess.equals(selectItem)) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("틀렸습니다. 다시 시도하세요.");
			}
		}
		
		scanner.close();
		System.out.println("종료되었습니다.");
	}

}
