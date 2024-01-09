package d_Chapter03;

// Arrays 클래스를 사용하기 위한 import문
import java.util.Arrays;

// Arrays 클래스
// : 배열을 조작하는데 유용한 기능들을 제공(정렬, 검색, 변환, 출력 등)
public class E_Array05 {

	public static void main(String[] args) {
		// 1. Arrays 클래스 사용법
		// : java.utils에서 기능을 가져와서(import) 사용
		
		int[] numbers = {3, 2, 5, 4, 1};
		
		// 배열 정렬(오름차순)
		// Arrays.sort(정렬할배열);
		Arrays.sort(numbers); // 오름차순 정렬
		
		System.out.println(numbers); // 배열을 기본 출력: 주소값이 출력
		
		// Arrays.toString
		// : 배열의 전체 구조를 파악할 수 있는 기능
		// : 각 요소를 순회하면서 문자열로 반환
		//   , 전체 배열을 대괄호 안에 담은 형태를 나타냄
		
		System.out.println(Arrays.toString(numbers));
		
		// 배열 내의 검색
		// Arrays.binarySearch(배열, 검색내용);
		// : 정렬된 배열에서 특정 요소를 이진 검색 - 해당 내용의 인덱스가 반환
		// : 존재하지 않는 내용은 음수로 반환
		int index = Arrays.binarySearch(numbers, 6);
		System.out.println(index);
		
		// 배열의 비교
		// Arrays.equals(a배열, b배열);
		// : a배열, b배열의 두 배열이 동일한지 비교 - true, false의 논리형으로 반환
		int[] numbers2 = {1, 2, 3, 4, 5};
		boolean areEqueal = Arrays.equals(numbers, numbers2);
		System.out.println(areEqueal); // true
		
		// 배열의 채움
		// Arrays.fill(배열, 삽입할값);
		// : 배열의 모든 요소를 특정 값으로 채움
		Arrays.fill(numbers, 10);
		System.out.println(Arrays.toString(numbers));
	}
}
