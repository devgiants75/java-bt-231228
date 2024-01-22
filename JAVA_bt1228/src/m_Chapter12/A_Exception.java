package m_Chapter12;

//! 자바 예외 처리

// 예외(Exception)
// : 프로그램 실행 중에 발생할 수 있는 예기치 못한 문제나 조건

// 예외 처리
// : 예외가 발생할 경우 프로그램이 중단되지 않고 대응하여 
//   , 정상적인 프로그램 흐름을 유지하는 프로그래밍 기법

// 자바 예외 클래스
// Throwable: 모든 예외와 오류의 최상위 클래스
// - 모든 예외 클래스는 해당 클래스를 상속받음
// - 예외와 관련된 메시지, 처리방법에 대한 예시에 대한 정보를 포함

//	>> Exception: 프로그램이 처리할 수 있는 예외들의 클래스
		// - 애플리케이션 레벨에서 발생하는 오류
//       >> RuntimeException: 프로그래머의 실수로 발생하는 예외(Unchecked)
//							 런타임 시점에서 발생, 컴파일러가 체크 X
//       >> Checked Exception: 컴파일 시점에 체크되는 예외

//  >> Error: 시스템 레벨에서 발생하는 예외, 개발자가 처리할 수 없음

//! 자바의 예외 처리 방법
// try-catch 블럭, throws 키워드, 사용자 정의 예외

public class A_Exception {
	public static void main(String[] args) throws Exception {
//		System.out.println("안녕") - Error
		
		// 1. 체크 예외
		// : 개발자가 예외를 처리해야만 하는 예외
		// : 컴파일러가 예외 처리 코드가 있는지 확인하고, 처리하지 않은 경우 에러 발생
		
		// 2. 언체크 예외
		// : 컴파일러가 강제로 예외 처리를 확인하지 않은 예외
		// : 처리를 선택적으로 진행
		
		//! try-catch 블록
		// 기본 형태
//		try {
//			// 예외가 발생할 수 있는 코드
//		} catch (ExceptionType e) {
//			// 예외가 발생했을 때 실행할 코드
//		} catch (ExceptionType2 e2) {
			// 예외2가 발생했을 때 실행할 코드
//		}
		
		// try 블록: 예외가 발생할 수 있는 코드를 포함
		// catch 블록: 특정 예외 타입이 발생했을 때 실행될 코드를 정의
			// 다중 catch 블록으로 사용 가능 (여러 예외 처리)
		
		try {
			int division = 10 / 0; 			
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		try {
			String text = null;
			// null의 계산은 예외 - NullPointerException 발생
			System.out.println(text.length()); 
			// 정수를 0으로 나눌 수 없음 - ArithmeticException 발생
			int division = 10 / 0;
		} catch (NullPointerException e) {
			System.out.println("null 참조 발생");
		} catch (Exception e) {
			System.out.println("산술적 예외 발생");
		} 
		
		// finally 블럭
		// : try-catch 구조의 일부 (선택사항)
		// : 예외 발생 여부와 관계없이 항상 실행되는 코드 블록
		
		try {
			int[] numbers = new int[5];
			numbers[10] = 50;			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 초과 오류 발생");
		} finally {
			System.out.println("finally 블록 실행");
		}
		
		// throw 블록
		// : 예외를 직접 발생시키는데 사용
		// : 특정 조건에서 예외를 발생시키고 싶을 때 사용 가능
		// : 주로 조건문과 같이 사용
		// 예) 나이에 음수 X - 나이값에 음수가 담기는 경우 예외 발생
		
		// 기본 형태
		// throw new 예외타입("예외처리구문");
		int age = -10;
		
		// 예외 발생
		// age값이 0 미만일 경우 예외 발생
		// : 발생하는 예외를 사용자 정의로 처리함
		// : 잘못된 값을 지정해도 나머지 실행 로직에 방해되지 X
		try {
			if (age < 0) {
//			throw new ExceptionType("Exception message");
				throw new Exception("나이는 음수가 될 수 없습니다.");
			}			
		} catch (Exception e) {
			System.out.println("양수를 입력해주세요.");
		}
		
		System.out.println("반드시 실행해야할 코드");
		
	}
}
