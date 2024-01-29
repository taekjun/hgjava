package com.yedam.phonebook;
//인터페이스에서는 필드역할이 상수
public interface InitMenu {
	int INPUT = 1; // public static final이 자동으로 적용되어 있다
	int SEARCH = 2, DELETE = 3, EXIT = 4;
}
