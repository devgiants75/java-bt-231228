package c_Chapter02;

import java.util.Scanner;

// while문
// : 일반적으로 반복 횟수가 지정되어 있지 않을 때 사용하는 반복문

// 조건을 검사하고 해당 조건이 true인 경우 코드 블럭을 실행하는 반복문
// : if문의 반복 형태
public class D_While {
	
	public static void main(String[] args) {
		// 기본 구조
//		while (조건) {
//			조건이 True일 때 실행할 코드
//			>> 반복 실행할 코드 블럭이 종료되면 조건을 다시 검사
//			>> true면 반복 false면 탈출
//		}
		
		// while문 기본 예시
		
		int i = 1; // for문과의 차이점은 사용할 변수가 미리 선언되어야 함
		while (i <= 5) {
			// 무한 루프
			// : 조건이 항상 참으로 루프가 종료되지 않는 경우
			System.out.println(i);
			
			// 조건이 거짓이 될 수 있는 로직 설정 중요
			i++;
		}
		
		// continue, break
		int number = 0;
		while(true) {
//			홀수만 출력
			if (number % 2 == 0) {
				// number 출력 X
				// continue
				// : 루프 안에서 continue를 만나면 코드 블럭 내에서
				// : 아래에 오는 모든 코드를 무시하고 다시 조건을 검사
				
				// 일반적으로 continue문은 조건문과 함께 쓰임
				// : 조건문의 코드블럭 내에 해당 변수를 변경시켜주는 코드가 존재!!
				number++; 
				continue;				
			}
			
			// while문에서는 조건에 사용되는 변수가
			// 필수로 실행 코드 내에서 변경이 이루어 져야함(무한 루프 방지)
			System.out.println(number);
			number++;
			
			// 20까지만 출력
			// break: 반복문의 코드 블럭을 강제로 종료 시킬 때 사용
			// 일반적으로 조건문과 함께 쓰임
			if (number == 20) break;
		}
		
		// while문 예제
		// 1부터 10까지의 모든 정수를 더하는 계산
		int sum = 0; // 총합이 담길 변수
		int index = 1; // 1부터 10까지 담길 변수
		
		while(index <= 10) {
			sum += index;
			index++;
		}
		
		System.out.println("1부터 10까지의 합은 : " + sum);
		
		// Do-While문
		// : 반복 실행할 코드를 무조건 한 번 실행한 후에 조건을 검사하는 반복문
		
		// 기본 구조
//		do {
//			실행할 코드
//		} while (조건);
		
		// : 최초의 코드 실행을 보장하는 기능
		
//		1부터 4까지 출력하는 예제
		int doNumber = 1;
		
		do {
			System.out.println(doNumber);
			doNumber++;
		} while (doNumber <= 4);
		
		// do-while 반복문을 사용하여 사용자로 부터 yes를 입력받는 코드
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		do {
			System.out.println("yes를 입력하세요");
			input = sc.nextLine();
		} while (!input.equals("yes"));
		
		// a.equals(b)의 경우
		// a와 b가 일치(동등)한지 판단하여 논리값을 반환하는 메소드(기능)
	}
}
