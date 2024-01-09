package d_Chapter03;

// 기본 배열
// 배열의 선언: 데이터타입[] 배열명;
// 배열의 초기화: 배열명 = new 데이터타입[배열의길이];
// int[] numbers = new int[5];
public class D_Array04 {

	public static void main(String[] args) {
		// 다차원 배열
		// : 배열의 배열 (2차원, 3차원 ...)
		// : 데이터를 테이블 형태로 구성할 때 유용
		// : ex) 게임 보드, 데이터 분석, 그래픽 등의 분야에 주로 사용
		
		// 다차원 배열의 선언 및 초기화
		// 2차원 배열 선언: 데이터타입[][] 배열명;
		int[][] matrix;
		// 2차원 배열 초기화: 배열명 = new int[행수][행수];
		
		// 다차원 배열의 경우 각 행에서 열의 개수가 서로 달라도 가능
		// 배열을 선언할 때 열의 크기는 지정하지 않아도 가능
		// , 행의 크기는 반드시 지정
		// 배열명 = new int[반드시][선택];
		matrix = new int [3][3];
		
		// 각 요소에 값 할당
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;

//		matrix 배열과 array의 구조가 같다
		// array 배열의 요소: 3개
		// array 배열의 각 요소 내부의 요소: 3개
		int[][] array = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

		// 다차원 배열의 할당 & 출력 - 반복문
		// : 중첩된 for문을 사용
		
		// 3행 4열의 배열에 순서대로 값을 할당하고 출력
		// 다차원 배열 선언 및 초기화
		int[][] threeFour = new int[3][4];
		
		// 할당
		int count = 1;
		
		int length = threeFour.length;
		int innerLength = threeFour[0].length; // 내부 배열의 길이를 측정
		System.out.println(length); // 3
		System.out.println(innerLength); // 4
		
		// 3번 반복
		for (int i = 0; i < length; i++) {
			// 4번 반복
			for (int j = 0; j < innerLength; j++) {
				threeFour[i][j] = count++;
			}
		}
		
		// 출력
		// : 각 행을 순회하여 찾아, 해당 행 내부의 요소를 순회
		// 3번 반복
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < innerLength; j++) {
				System.out.print(threeFour[i][j]); // 행 안의 요소를 가로로 나열
			}
			System.out.println(); // 줄바꿈
		}
		
		// for-each문을 사용한 다차원 배열 값 출력
		// : 전체 배열을 변수에 할당하여 각 변수에 차례로 접근
		for (int[] row: threeFour) {
			for (int value: row) {
				System.out.print(value + " ");
			}
			System.out.println(); // 줄바꿈
		}
	}
}
