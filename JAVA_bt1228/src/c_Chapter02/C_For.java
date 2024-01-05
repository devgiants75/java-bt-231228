package c_Chapter02;

// 반복문(Loop)
// : 어떤 작업을 반복적으로 실행하고 싶을 때 사용

// 자바 반복문 종류
// : for, while, do-while문

public class C_For {
	public static void main(String[] args) {
		// for문
		// : 특정 조건이 만족될 때까지 코드 블록을 반복 실행
		// : 규칙이 있는 작업을 반복하는 제어문
		// : 반복 횟수가 정해져 있을 때 사용
		
		// 기본 구조
//		for (초기화; 조건; 증감) {
//			조건이 만족될 때까지 실행할 코드
//		}
		
		// 초기화
		// : 반복문의 제어 변수를 초기화 (데이터타입 변수명 = 값;)
		// : 숫자형 변수를 사용하여 반복문이 실행되는 횟수를 제어
		
		// 조건
		// : 루프가 계속 실행될 조건을 지정
		// : 해당 조건이 거짓이 되면 루프가 종료
		
		// 증감
		// : 루프의 각 반복 후에 실행, 보통 반복 변수를 증가 또는 감소
		
		// for문 기본 예제
		// : 1부터 5까지를 출력
		for (int num = 1; num <= 5; num++) {
			System.out.println(num);
		}
		
		// num이라는 제어 변수를 1로 초기화
		// num이 5이하인 동안에만 반복문을 실행
		// 각 반복 후에 num을 1씩 증가
		
		// 보통 for문의 제어 변수의 경우 i 키워드를 사용 (index)
		// 제어 변수는 0으로 초기화를 권장
		// 조건식은 초과, 미만의 연산 사용을 권장
		
		// for문 기본 예제
		// : 1부터 10까지의 숫자 중에서 짝수만 출력하는 for 반복문을 작성
		System.out.println("짝수 출력 예제");
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("========");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// for 반복문을 사용하여 1부터 10까지의 모든 정수를 더하는 코드
		int sum = 0; // 1부터 10까지의 합을 담을 sum 변수
			
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		// 1부터 10까지의 합이 출력
		System.out.println(sum);
		
		// for 반복문을 사용하여 구구단의 일부를 출력하는 코드
		// ex) 3단
		int num = 3;
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
		
	}
	
}
