package m_Chapter12;

import java.util.Calendar;
// 외부에 있는 클래스를 import 사용
import java.util.Date;
import java.util.Scanner;

// java.util 패키지
// : 자바의 표준 라이브러리 중 하나
// : 데이터의 구조, 시간과 날짜 처리, 무작위 숫자 생성 등의 기능을 포함

//! 시간과 날짜 처리하는 클래스
// Date 클래스
// : 날짜와 시간을 표현
// : 현재의 밀리초 단위까지를 반환
// toString(): 현재 날짜와 시간을 문자열로 반환
// getTime(): 현재의 밀리초 단위를 반환

// Calendar 클래스
// : 날짜와 시간을 처리하기 위한 추상 클래스
// : Date 클래스 더 빠른 날짜 시간 계산을 제공
// - getInstance(): 현재 날짜와 시간으로 설정된 Calendar 객체를 반환
// - get(int field): 지정된 필드의 값을 반환 
//   >> 객체의 필드 값을 반환
// - set(int year, int month, int date): 연, 월, 일을 설정

public class F_Java_Util {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("현재 날짜와 시간은: " + date.toString());
		System.out.println("현재 시간(밀리초)은: " + date.getTime());
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		
		// month(달)이 0부터 11까지의 수로 반환
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + " " + month + " " + day);
		
		System.out.println("========================");
		//! 생일까지 남은 일수 계산 프로그램
		// 사용자로부터 생년월일을 입력받고
		// 다가오는 생일까지 남은 일수를 반환
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자로부터 생년월일 입력 받기
		// 스캐너 >> 연도, 월, 일을 각각 입력받기
		System.out.println("연도: YYYY, 월: 1-12, 일: 1-31");
		int birthYear = sc.nextInt();
		int birthMonth = sc.nextInt();
		int birthDay = sc.nextInt();
		
		// 현재 날짜와 시간을 포함하는 Calendar 인스턴스 생성
		Calendar today = Calendar.getInstance();
		
		// 사용자의 생일 설정(월은 0부터 시작하기 때문에 -1 뺌)
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.YEAR, birthYear);
		birthday.set(Calendar.MONTH, birthMonth - 1);
		birthday.set(Calendar.DAY_OF_MONTH, birthDay);
	
		// 올해의 생일이 이미 지났는지 확인
		if(birthday.before(today)) {
			// 이미 지났다면 내년으로 설정
			birthday.set(Calendar.YEAR, today.get(Calendar.YEAR) + 1);
		}
		
		// 날짜 차이 계산 (밀리초 단위로 계산 후 일 단위로 변환)
//		1초 = 1000밀리초
//		1분 = 60초
//		1시간 = 60분
//		1일 = 24시간
		long difference 
		= (birthday.getTimeInMillis() - today.getTimeInMillis()) 
		/ (1000 * 60 * 60 * 24);
		
		// 남은 일수 출력
		System.out.println("남은 생일은: " + difference);
	}
}