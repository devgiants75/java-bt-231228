package p_Chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//! 자바 입출력(Input/Output)

//! IO
// : 입력과 출력으로 컴퓨터 시스템에서 데이터를 받아들이고(입력)
// : , 처리한 결과를 외부로 전달(출력)하는 과정

// >> 자바에서는 java.io 패키지에서 주로 입출력 과정을 담당

//! Stream
// : 데이터가 순차적으로 흐르는 통로를 의미
// : 자바 프로그래밍이 디스크에 접근하여 데이터를 주고받는 작업을 도와주는 통로
// - 스트림을 통해 데이터는 소스로부터 목적지까지 일련의 연속된 흐름으로 이동
//   : 단방향 통신(입력 스트림과 출력 스트림을 별도로 사용)
//   : FIFO 구조(First In First Out, 선입선출)

//! 입출력 스트림의 종류

// 1. 입력 스트림
// : 데이터를 읽기 위한 스트림
// : FileInputStream, BufferedReader 등

// 2. 출력 스트림
// : 데이터를 쓰기 위한 스트림
// : FileOutputStream, BufferedWriter 등

// 3. Byte 스트림 / Char 스트림
// - Byte 스트림: 바이트 단위로 데이터를 처리 (모든 타입의 데이터 가능)
// - Char 스트림: 문자 단위로 파일을 처리 (문자 데이터만 처리 가능)

//! 스트림의 예외 처리
// : try-catch 블록을 사용하여 예외 발생 처리를 권장

public class A_IO01 {

	public static void main(String[] args) {
		// 1. 파일 IO 클래스: File
		// : 파일이나 디렉토리(폴더) 경로명을 추상화한 클래스
		// : 파일 생성, 삭제, 이름 변경 등을 수행 가능
		
		// - 주요 메서드
		// createNewFile(): 새 파일 생성
		// delete(): 파일 삭제
		// renameTo(File dest): 파일 이름 변경
		// mkdir(), mkdirs(): make directory 줄임말, 디렉토리(폴더) 생성

		// 1. 바이트(byte) 기반 스트림
		// : 1바이트를 단위로 데이터를 읽고 씀
		// : 텍스트 파일 뿐만 아니라 이미지, 동영상 파일 등 모든 종류의 파일 처리 가능
		
		// - FileInputStream(입력)
		// - FileOutputStream(출력)
		
		// Buffer(버퍼)
		// : 임시 저장 공간
		// : A와 B가 서로 입출력을 수행할 때
		//   , 그 속도 차이를 극복하기 위한 임시 저장 공간
		
		// Buffer 이용의 장점
		// : 데용량 데이터 처리에 효과적
		// : 파일 접근 횟수가 줄어들어 성능이 향상
		
		// - BufferedInputStream: 입력 스트림에 버퍼를 제공하여 입출력 효율을 향상
		// - BufferedOutputStream: 출력 스트림에 버퍼를 제공하여 입출력 효율을 향상

		// 자바 IO 예외 처리 클래스
		// : IOException
		
		try {
			// input.txt 파일의 내용을 읽고
			// output.txt 파일로 복사하는 기능
			FileInputStream in = new FileInputStream("input.txt");
			FileOutputStream out = new FileOutputStream("output.txt");
			
			// 파일에서 읽은 바이트를 저장할 변수
			int c;
			
			// read(): 파일에서 한 바이트 씩 읽어오는 메서드
			// >> 파일 끝에 도달하면 -1을 반환
			while ((c = in.read()) != -1) {
				// 읽은 바이트 c를 output.txt 파일에 작성
				// write(): 파일에 한 바이트 씩 작성하는 메서드
				out.write(c);
			}
			
			in.close();
			out.close();
			
		} catch(IOException exception) {
			// printStackTrace()
			// : 예외의 발생 당시의 호출 스택에 있던 메서드 정보를 결과창에 출력
			exception.printStackTrace();
		}
	}
}
