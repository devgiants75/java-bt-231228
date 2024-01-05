
public class Git {

	public static void main(String[] args) {
		// Git
		// : 소프트웨어 버전 관리 소프트웨어(시스템)
		// : 변경 사항 추적, 백업 및 보안, 협업 용이성
		
		// =========================================== //
		// Git의 구조
		// - (개인)작업 디렉토리:
		// : 작업 디렉토리는 현재 프로젝트의 파일들이 위치한 곳
		
		// - 변경 사항 스테이징:
		// : 변경된 파일을 git add 명령어로 스테이징 영역에 추가
		
		// - local repository
		// : 개인 PC에 저장되는 저장소(push)
		
		// - (원격)remote repository
		// : 다른 개발자와 공유하는 저장소(pull)

		// =========================================== //
		// GitHub
		// : Git을 사용하는 프로젝트를 지원하는 웹 호스팅 서비스
		
		
		// - git push와 git pull 명령어를 사용하여 
		// 	 : 로컬 리포지토리와 원격 리포지토리 간의 동기화
		
		// =========================================== //
		
		// Git 설치
		// : Git 공식 웹사이트 - 운영체제에 맞는 버전을 다운로드
		
		// =========================================== //
		// 사용자 이름 및 이메일 설정
		// : 커밋에 사용자 정보를 기록하는 데 사용
		
		// - Windows 자격 증명 관리자 
			// >> Windows 자격 증명 
			// >> 일반 자격 증명(git, sourcetree이 타인의 것 - 삭제)
		
		// - 브라우저에서 github 로그인 상태 확인
		
		// MacOS(터미널), Windows(윈도우키 + cmd)
//		git config --global user.name 깃허브아이디
//		git config --global user.email 깃허브이메일
		
//		git config --global user.name devgiants75
//		git config --global user.email devgiants75@naver.com
		
		// - 등록 확인
		// git config --global user.name
		// git config --global user.email
		
		// =========================================== //
		// 리포지토리 초기화 및 기본 운영
		// a. 리포지토리 초기화(init)
		// : 새로운 Git 리포지토리 생성
		// : git init 명령어 사용
		// : 새로운 Git 리포지토리를 초기화하고 .git 디렉토리를 생성
		
		// b. 상태 확인 (status)
		// : 리포지토리의 현재 상태 확인
		// : 업로드(push)하지 않은 파일이 있는지 확인
		// : git status 명령어 사용
		
		// c. 파일 추가 (add)
		// : git add .
		// : 마침표는 전체 변경 사항을 모두 업로드
		
		// d. 커밋 (commit)
		// : 변경 사항을 리포지토리에 기록하기 위한 명령어
		// : git commit -m "커밋 메시지-코드에 대한 설명"
		
		// e. 코드 푸시 (push)
		// : 로컬 리포지토리에서 변경사항을 원격 리포지토리에 저장
		// : git push origin main
		
		// =========================================== //
		// 원격 리포지토리(깃허브) 연결
		// >> 연동 전 해당 리포지토리의 파일을 받아올 폴더에
		// : 리포지토리 초기화(init) 실시: git init
		
		// >> branch 변경(main)
		// : git branch -M main

		// >> 로컬 Git 리포지토리에서 원격 리포지토리를 연결
		// : GitHub에서 제공하는 URL 사용
		// : git remote add origin 원격리포지토리URL
		
		// >> 원격 리포지토리에서 파일 당겨오기
		// git pull origin main
		
		

	}

}
