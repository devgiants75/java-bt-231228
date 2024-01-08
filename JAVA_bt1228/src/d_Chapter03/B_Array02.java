package d_Chapter03;

import java.util.Scanner;

public class B_Array02 {
	public static void main(String[] args) {
//		업다운 게임
		// 1. 임의의 난수(무작위 수) 생성
		// : 1부터 100 사이의 정수
		int secretNumber = (int)(Math.random() * 100 + 1);
		// Math.random(): 0.0이상 1.0미만의 무작위 실수를 반환 
		
		// 2. 사용자로부터 정수 입력
		Scanner sc = new Scanner(System.in);
		
		int guess;
		
		// 3. 무한루프 생성: while문의 조건이 항상 true
		while (true) {
			System.out.println("숫자를 입력하세요. (1 ~ 100)");
			guess = sc.nextInt();
			
			// 사용자의 입력 값이 난수와 같다면
			if (secretNumber == guess) {
				// : '정답입니다' 출력
				System.out.println("정답입니다.");
				break;
			// 입력 값이 난수보다 작다면
			} else if (guess < secretNumber) {
				// : 'UP' 출력
				System.out.println("UP");
			// 입력 값이 난수보다 크다면
			} else {
				// : 'DOWN' 출력
				System.out.println("DOWN");
			}
		}	
	}
}
