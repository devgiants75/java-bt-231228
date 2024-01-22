package m_Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

// 사용자로부터 값을 입력받는 코드를 작성
// : 입력 받은 값을 int number변수에 할당

// 에러가 발생하지 않은 경우 "입력하신 숫자는 " + number + "입니다."

// 정수가 아닌 다른 타입의 입력이 들어올 경우
// InputMismatchException을 사용해 에러 처리
// : "정수가 아닌 다른 타입의 입력이 들어왔습니다."

// 오류 발생 여부와 상관없이 해당 입력기(scanner 종료) 
public class C_Exception {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("정수를 입력하세요.");
			int number = scanner.nextInt();
			System.out.println("입력하신 숫자는 " + number + "입니다.");
		} catch (InputMismatchException exception) {
			System.out.println("정수가 아닌 다른 타입의 입력이 작성되었습니다.");
		} finally {
			scanner.close();
		}
		
	}
}
