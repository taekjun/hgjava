package com.yedam.phonebook;

// 사용자메뉴를 비정상적으로 처리했을때 사용되는 예외
public class MenuChoiceException extends Exception{	//가독성. 사용통일성을 위해 Exception상속
	int wrongChoice;
	
	public MenuChoiceException(int wrongChoice) {
		super("없는 메뉴번호입니다");	//catch부분에서 System.out.println(e.getMessage());를 사용할경우 출력된다.
		this.wrongChoice = wrongChoice;
	}
	
	public void showWrongChoice() {
		System.out.println(wrongChoice + "는 없는 메뉴번호입니다");
	}
	
}
