package n_Chapter13;

import java.util.ArrayList;
import java.util.LinkedList;

// 이벤트 관리 시스템

// 이벤트 참가자 명단 관리*
// : 사전에 등록, 이벤트 당일에는 추가적인 참자가 등록 X
// ArrayList (목록 추가, 삭제 X / 참가자 조회 O)

// 대기열 관리*
// : 이벤트에는 한정된 좌석이 있어, 좌석이 모두 차면 추가로 도착하는 참가들은
// : 대기열에 등록
// : 위의 이벤트 참가들이 퇴장하는 경우 입장 가능
// LinkedList (목록 추가, 삭제 O / 참가자 조회 X)

// 참가자 조회
// : 이벤트 진행 중에 특정 참가자가 참석했는지 빠르게 확인 점검

class EventManagement {
	// 이벤트 참여자 명단 
	ArrayList<String> participantList = new ArrayList<>();
	// 대기열 명단
	LinkedList<String> waitingQueue = new LinkedList<>();
	
	// 참가자 명단에 참가자 추가
	void addParticipant(String name) {
		participantList.add(name);
	}
	
	// 대기열에 참가자 추가
	void addToWaitingQueue(String name) {
		waitingQueue.add(name);
	}
	
	// 참가자가 이벤트를 떠날 때
	void leaveParticipant(String name) {
		// 대기열의 요소의 수가 0보다 클 때(대기열에 명단이 존재할 때)
		if (waitingQueue.size() > 0) {
			// 대기열 명단에서 >> 참가자 명단에 인원 추가
			String nextParticipant = waitingQueue.remove(0);
			addParticipant(nextParticipant);
		}
	}
	
	// 특정 참가자 조회
	boolean checkParticipant(String name) {
		return participantList.contains(name);
	}
}

public class D_ListPractice {
	public static void main(String[] args) {
		EventManagement event = new EventManagement();
		
		// 참가자 명단에 참가자 추가
		event.addParticipant("LSA");
		event.addParticipant("LDK");
		event.addParticipant("LJH");
		
		// 대기열에 참가자 추가
		event.addToWaitingQueue("SJH");
		event.addToWaitingQueue("KJI");
		
		// 참가자 이벤트를 떠날 때
		event.leaveParticipant("LSA");
		
		// 특정 참가자 조회
		boolean isLDKParticipating = event.checkParticipant("LDK");
		boolean isSJHParticipating = event.checkParticipant("SJH");
		boolean isLSAParticipating = event.checkParticipant("LSA");
		boolean isKJIParticipating = event.checkParticipant("KJI");
		
		System.out.println(isLDKParticipating); // true
		System.out.println(isSJHParticipating); // true
		System.out.println(isLSAParticipating); // true
		System.out.println(isKJIParticipating); // false
	}
}