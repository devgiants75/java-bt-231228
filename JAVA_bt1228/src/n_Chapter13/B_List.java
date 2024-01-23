package n_Chapter13;

import java.util.ArrayList;
import java.util.LinkedList;

//! List 인터페이스
// : 데이터를 순차적으로 저장하고 접근하는데 사용하는 메서드를 정의
// : 데이터의 중복 저장을 허용, 저장된 순서에 따라 데이터를 관리

//! List 특징
// - 요소의 인덱스를 통한 정확한 위치 지정
// - 요소의 중복 허용
// - 다양한 구현체를 통해 사용 가능

//! List 인터페이스 구현 클래스
// ArrayList: 내부적으로 배열을 사용하여 데이터를 관리
// 1. 동적 크기를 조절
// - 요소가 추가되거나 제거될 때 자동으로 크기를 조절
// 2. 인덱스 기반 접근
// - 특정 위치의 데이터를 빠르게 읽거나 수정 가능
// - 중간에 데이터를 삽입하거나 삭제하는 작업은 비교적 느림
// 3. 순차적인 데이터 저장, 중복 데이터 허용
// 4. 널(Null) 값을 허용

// >> 데이터를 빠르게 조회할 때 사용 (데이터의 삽입, 삭제 X)
// >> null 값을 허용, null값이 허용될 수 있는 상황에서는 null 체크를 항상 동반
		
// LinkedList: 내부적으로 이중 연결된 리스트를 사용하여 데이터를 관리
// : 내부적으로 이중 연결 리스트를 사용
// 1. 동적 크기 조절: 자동으로 크기 조절
// 2. 데이터 삽입 / 삭제 효율
// - 특정 위치에서의 요소 추가/삭제가 빠름
// - 특정 위치의 요소에 접근하는 것은 리스트를 순회해야 하기 때문에 속도가 비교적 느림
// 3. 널(Null)값을 허용

// >> 데이터의 연결성을 사용한 순차적인 접근에 적합
// >> null 값을 허용, null값이 허용될 수 있는 상황에서는 null 체크를 항상 동반

public class B_List {
	public static void main(String[] args) {
		//! List 인터페이스의 주요 메서드
		// - add(E e): 리스트의 끝에 요소를 추가
		// - add(int index, E e): 지정된 위치에 요소를 추가
		// - get(int index): 저장된 위치의 요소를 반환
		// - remove(int index): 지정된 위치의 요소를 제거하고, 그 요소를 반환
		// - size(): 리스트의 크기(요소의 수)를 반환
		// - clear(): 리스트의 모든 요소를 제거
		// - indexOf(Object o): 지정된 요소가 처음으로 나타나는 위치의 인덱스를 반환
		// - contains(Object o): 리스트가 특정 요소를 포함하는지 여부를 반환
		// - set(int index, E e): 지정된 위치에 주어진 요소를 저장
			// , 이전에 있던 요소를 반환
		
		//! 1. ArrayList 사용 예시
		// : new 생성자를 사용하여 ArrayList 객체를 생성
		// : 일반 데이터 타입이 아닌 클래스 객체 데이터 타입
		// >> String, Number, Boolean 등
		ArrayList<String> arrayList = new ArrayList<String>();
		
		System.out.println(arrayList.size()); // 0
		
		// 요소 추가
		arrayList.add("JAVA");
		arrayList.add("PYTHON");
		arrayList.add("JAVASCRIPT");
		
		System.out.println(arrayList.size()); // 3
		
		// 요소 출력
		System.out.println(arrayList); // [JAVA, PYTHON, JAVASCRIPT]
		
		// 요소 추가 + 특정 위치
		arrayList.add(1, "C++");
		System.out.println(arrayList); // [JAVA, C++, PYTHON, JAVASCRIPT]
		
		// 특정 인덱스 번호로 요소에 접근
		String element = arrayList.get(2);
		System.out.println(element); // PYTHON
		
		// 요소 삭제
		System.out.println(arrayList.remove(0)); // JAVA
		System.out.println(arrayList); // [C++, PYTHON, JAVASCRIPT]
		
		// 특정 위치의 요소를 수정
		System.out.println(arrayList.set(1, "Rust")); // PYTHON
		System.out.println(arrayList); // [C++, Rust, JAVASCRIPT]
		
		System.out.println(arrayList.size());
		
		System.out.println("====================");
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// 요소 추가
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Cherry");
		
		// 요소 출력
		System.out.println(linkedList); // [Apple, Banana, Cherry]
		
		// 특정 인덱스를 사용한 요소 삽입
		linkedList.add(1, "Melon");
		System.out.println(linkedList); // [Apple, Melon, Banana, Cherry]
		
		String fruitElement = linkedList.get(2);
		System.out.println(fruitElement); // Banana
		
		// 특정 위치의 요소를 제거
		System.out.println(linkedList.remove(0)); // Apple
		System.out.println(linkedList); // [Melon, Banana, Cherry]
		
		// 특정 위치의 요소를 수정
		System.out.println(linkedList.set(1, "Orange")); // Banana
		System.out.println(linkedList); // [Melon, Orange, Cherry]
		
		// 배열의 길이를 측정
		System.out.println(linkedList.size()); // 3
		
		// 배열에 해당 요소가 포함되어 있는지 확인
		String isFruit1 = "Orange";
		String isFruit2 = "Strawberry";
		
		System.out.println(linkedList.contains(isFruit1)); // true
		System.out.println(linkedList.contains(isFruit2)); // false
	}
}
