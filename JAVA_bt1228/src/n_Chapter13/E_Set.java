package n_Chapter13;

import java.util.HashSet;
import java.util.Set;

//! SET 인터페이스
// : 중복된 요소를 포함하지 않는 객체의 집합
// : 객체의 저장 순서를 저장하지 않음 (삽입 순서를 유지하지 X)
// : null 요소 포함 가능

//! Set 컬렉션 종류
// 1. HashSet
// : 가장 많이 사용되는 Set 구현체
// : 가장 빠른 성능을 제공
// : 삽입 순서나 요소의 정렬 상태를 보장하지 X

// 2. LinkedHashSet
// : HashSet에서 순서를 추가한 형태
// : 요소를 삽입 순서대로 유지

// 3. TreeSet
// : 정렬된 순서대로 요소를 유지
// : 요소의 순서가 중요하거나 요소를 정렬된 상태로 유지해야 할 때 사용
// : 자동 정렬

public class E_Set {
	public static void main(String[] args) {
		// add(Element element): 요소 추가
		// remove(Object object): 요소 제거
		// contains(Object object): 요소 포함 여부 확인
		// size(): 셋의 크기 반환
		// isEmpty(): 셋이 비워져있는지 확인
		
		// HashSet 클래스 선언 방법
		// Set<E> set명 = new HashSet<E>();
		Set<String> set = new HashSet<String>();
		
		// 요소 추가
		set.add("JAVA");
		set.add("PYTHON");
		set.add("C++");
		set.add("JAVA"); // 중복되는 값을 넣으면 추가되지 않는다.
		
		// [JAVA, C++, PYTHON]
		// : 요소의 삽입 순서가 유지되지 않음
		System.out.println(set); 
		
		// 요소 삭제
		set.remove("JAVA");
		System.out.println(set); // [C++, PYTHON]
		
		// 요소 크기 확인 
		System.out.println(set.size()); // 2
		
		// 특정 요소 확인
		System.out.println(set.contains("PYTHON")); // true
		System.out.println(set.contains("JAVA")); // false
		
		// 모든 요소 제거
		set.clear();
		System.out.println(set.size()); // 0
		System.out.println(set.isEmpty()); // true
	}
}
