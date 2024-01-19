package com.yedam.classes.friend;

import java.util.Scanner;

import com.yedam.classes.UserApp;

public class FriendExe {
	public static void main(String[] args) {
		//메뉴 1.등록 2.목록 3.수정 4.삭제 9.종료
		//사용자의 입력,처리 결과 콘솔출력
		FriendApp app = new FriendApp();
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		

		//다른 기능이 필요한 경우 
		//로그인 기능 (id.pw.name)
		UserApp uapp = new UserApp();
		String id = "", pw = "";
		
		while(true) {
			System.out.println("ID를 입력하세요.>>>");
			id = scn.nextLine();
			System.out.println("비밀번호를 입력하세요.>>>");
			pw = scn.nextLine();
			
//			User user = uapp.login(id, pw);
			
			if(uapp.login(id, pw)) {		//uapp.login(id, pw)		//user != null
				System.out.println("로그인 성공");
				
				break;
			}
			System.out.println("ID와 PW를 확인하세요.");
		}

			
		
		String name = "", phone = "";
		int age = 0;
		
		while(run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 9.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: //등록
				System.out.println("이름 입력>>>");
				name = scn.nextLine();
				System.out.println("연락처 입력>>>");
				phone = scn.nextLine();
				System.out.println("나이 입력>>>");
				age = Integer.parseInt(scn.nextLine());
				
				Friend frd = new Friend(name, phone, age);
				
				if(app.add(frd)) {
					System.out.println("입력 성공.");
				}else {
					System.out.println("입력 실패.");
				}
				break;
			case 2: //목록확인
				Friend[] list = app.list();
				for(int i=0; i<list.length; i++) {
					if(list[i] != null) {
						list[i].showInfo();
					}
				}
				System.out.println("목록 조회 완료.");
				break;
				
			case 3: //수정
				System.out.println("연락처>>>");
				phone = scn.nextLine();
				//정상 번호인지 확인
				if(app.get(phone) == null) {
					System.out.println("전화번호를 확인하세요.");
					break;
				}
				
				while(true) {
					System.out.println("변경 나이>>>");
					age = Integer.parseInt(scn.nextLine());
					if(age <0) {
						System.out.println("나이를 확인하세요.");
						continue;
					}			
					break;
				}
				if(app.modify(phone, age)) {
					System.out.println("수정되었습니다.");
				}else{
					System.out.println("잘못된 연락처 입니다.");
				}
				break;
			case 4: //삭제	
				System.out.println("삭제할 친구 연락처>>>");
				phone = scn.nextLine();
				if(app.remove(phone)) {
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("잘못된 연락처 입니다.");
				}
				break;
			case 5: //단건조회
				
			case 9: //종료
				run = false;
				System.out.println("종료합니다.");
			}
		}
		System.out.println("end of prog");
	}
}
