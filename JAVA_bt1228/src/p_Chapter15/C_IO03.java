package p_Chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 프로그램의 요구사항
// - students.txt 파일을 읽고 각 줄을 분석하여 학생의 이름과 점수를 분리
// - 평균 성적을 계산하고 출력
public class C_IO03 {
	public static void main(String[] args) {
		
		// 읽어올 파일 이름을 지정
		String fileName = "students.txt";
		
		// BufferedReader 객체를 선언: 파일을 읽어옴
		BufferedReader reader = null;
		
		// 총 점수를 저장할 변수와 학생 수를 저장할 변수를 선언
		int totalScore = 0;
		int studentCount = 0;
		
		try {
			
			// 파일을 읽기 위해 FileReader로 BufferedReader를 생성
			reader = new BufferedReader(new FileReader(fileName));
			
			// 각 줄을 저장할 문자열 변수를 선언
			String line = null;
			
			// 파일의 끝에 도달할 때까지 각 줄을 읽어옴
			// readLine(): 한 줄만 읽어오는 메서드
			while ((line = reader.readLine()) != null) {
				// 각 줄을 분석하여 학생 이름과 점수를 분리
				
				// 각 줄을 쉼표를 기준으로 이름과 점수를 분리
				// split(): 특정 문자열을 split 메서드의 인자로 분리
				String[] parts = line.split(",");
				
				// 첫 번째 배열: 이름
				// trim(): 문자열 양 끝의 공백을 제거
				String name = parts[0].trim();
				
				// 두 번째 배열: 점수
				// 공백 제거 후, 정수로 변환
				// parseInt(): 문자열를 정수로 변환
				int score = Integer.parseInt(parts[1].trim());
				
				// 학생의 점수의 총합
				totalScore += score;
				
				// 학생의 수를 증가
				studentCount++;
			}
			
			// 평균 점수 계산 후 출력
			double average = (double) totalScore / studentCount;
			System.out.println("평균 점수는 : " + average);
			
		} catch(IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				// 파일 읽기 후 BufferedReader를 종료(닫음)
				// 존재하지 않는 리더기 종료 시 오류 발생
				if (reader != null) {
					reader.close();
				}
				
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		
		
		
	}
}
