package com.yedam.phonebook;

// 연락처 app		상수필드 담고있는 열거형 사용.
public class PhoneBookApp {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.getInstance();
		//사용자 권한 체크
		// UserManager => userCheck(아이디,비번)
		// 3번 연속으로 인증실패시 프로그램 종료
		
		int menu;
		while (true) {
			try {
				MenuViewer.showMenu();
				menu = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();

				if (menu < InitMenu.INPUT || menu > InitMenu.EXIT) {
					throw new MenuChoiceException(menu);	//예외처리가 필요하다. 그래서 while문 안에를 전체 예외처리함
				}

				if (menu == InitMenu.INPUT) { // menu==1 로 해도 상관없음
					manager.inputData();
				} else if (menu == InitMenu.SEARCH) {
					manager.searchData();
				} else if (menu == InitMenu.DELETE) {
					manager.deleteData();
				} else if (menu == InitMenu.EXIT) {
					System.out.println("종료");
					manager.storeToFile();
					break;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				//System.out.println(e.getMessage()); ->생성자에 super값이 출력된다
			}
		}

		System.out.println("end of prog");
	}
}
