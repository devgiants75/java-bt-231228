package p_Chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_IO02 {
	public static void main(String[] args) {
		//! 문자(char) 기반 스트림
		// : 유니코드 문자 데이터를 위한 IO 스트림
		
		// - FileReader: 문자를 읽어들이는 클래스
		// - FileWriter: 문자를 쓰는 클래스
		// - BufferedReader: 스트림을 더해 입력 효율을 향상
		// - BufferedWrtier: 스트림을 더해 출력 효율을 향상
		
		try {
			// 문자 스트림을 사용해
			// input 파일의 내용을 output 파일로 복사
			FileReader reader = new FileReader("reader.txt");
			FileWriter writer = new FileWriter("writer.txt");
			
			int c;
			while ((c = reader.read()) != -1) {
				writer.write(c);
			}
			
			reader.close();
			writer.close();
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		// 자바 IO 클래스 예제
		// File 클래스를 사용하여 객체 생성 후 문자열 데이터를 txt 파일로 전달
		
		// File 클래스를 사용하여 test.txt 이름의 파일 객체를 생성
		File file = new File("test.txt");
		
		// FileOutputStream 클래스를 사용
		// : 문자열을 전달
		try(FileOutputStream fos = new FileOutputStream(file)) {
			String content = "This is a test";
			
			// char를 바이트로 변환하여 전달
			// getBytes(): 배열로 변환한 후, 파일에 기록
			fos.write(content.getBytes());
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		// FileInputStream 클래스 사용
		// : 파일에서 바이트 단위로 데이터를 읽는데 사용
		
		try(FileInputStream fis = new FileInputStream(file)) {
			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char)content);
			}
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		
		
		
		
		
	}
}
