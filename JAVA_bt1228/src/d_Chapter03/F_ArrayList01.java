package d_Chapter03;

// 동적 배열을 사용하기 위한 ArrayList 구문 import
import java.util.ArrayList;

public class F_ArrayList01 {
	public static void main(String[] args) {
		// 자바의 기본 배열 형태
		// : 한 번 생성되면 크기를 변경 X
		// : 새로운 배열을 생성하고, 원래 배열의 요소를 복사
		int[] numbers = new int[5];
		
		// ArrayList 클래스
		// : 자바의 라이브러리에서 제공하는 기능
		// : java.utils.ArrayList을 import해서 사용
		
		// 공통점
		// : 일반 배열과 동일하게 연속된 메모리 공간을 사용
		// : 인덱스 번호가 0부터 시작
		
		// 차이점
		// : 일반 배열은 크기가 고정, ArrayList는 크기가 가변적
		// : 배열의 타입 지정 시, 일반 데이터 타입이 아닌 참조 타입으로 작성
		// : int(Integer), char(Charactor), boolean(Boolean), String 등
		
		// ArrayList 생성
		// ArrayList<데이터타입> 배열명 = new ArrayList<>(선택);
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		// ArrayList 데이터 추가
		// : 해당 리스트(배열)의 가장 끝에 값을 추가
		// 배열명.add(추가할데이터);
		arrayList.add(1); // 인덱스 0
		arrayList.add(2); // 인덱스 1
		arrayList.add(3); // 인덱스 2
		
		// ArrayList 데이터 변경
		// 배열명.set(인덱스번호, 변경할데이터);
		arrayList.set(1, 5);
		
		// ArrayList 출력
		// : 배열명으로 곧바로 출력
		System.out.println(arrayList); // [1, 5, 3]
		
		// ArrayList 데이터 삭제
		// arrayList.remove(인덱스번호);
		arrayList.remove(1);
		System.out.println(arrayList); // [1, 3]
		
		// ArrayList 원하는 위치에 데이터 삽입
		// 배열명.add(인덱스번호, 데이터);
		arrayList.add(1, 4);
		arrayList.add(1, 5);
		arrayList.add(1, 6); // 추가된 데이터 위치 이후의 데이터는 인덱스 번호가 밀림
		System.out.println(arrayList); // [1, 6, 5, 4, 3]
		
		// ArrayList 크기 확인
		// 배열명.size();
		int size = arrayList.size();
		System.out.println(size); // 5
		
		// ArrayList 특정 요소 접근
		// 배열명.get(인덱스번호);
		System.out.println(arrayList.get(3)); // 4
		
		
		
		
		
		
		
	}
}
