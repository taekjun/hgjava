package com.yedam.todo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Todo0117 {
	public static void main(String[] args) {
		// 친구3명의 이름과 연락처를 입력하도록 메세지 출력
				// 입력완료.
				
				// 이름: 홍길동
				// 연락처: 010-1111-2222
				// ===================
				// 이름: 김길동
				// 연락처: 010-2222-3333
				// ===================
				// 이름: 박길동
				// 연락처: 010-3333-4444
				// ===================
				
				Scanner scn = new Scanner(System.in);
				String name = "";
				String phone = "";
				
				for(int i=1; i<=3; i++) {
					System.out.println("이름을 입력하세요");
					name = scn.nextLine();

					
//					System.out.println("전화번호를 입력하세요");
//					phone = scn.nextLine();
					
				}
				System.out.printf("이름: %s\n연락처: %s\n",name,phone);
				System.out.printf("=============================\n");
	}
}
