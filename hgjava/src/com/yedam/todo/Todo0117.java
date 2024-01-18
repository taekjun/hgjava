package com.yedam.todo;

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
				
				String[] name= new String[3];
				String[] phone= new String[3];
				
				for(int i=0; i<3; i++) {
					System.out.println("이름을 입력하세요");
					name[i] = scn.nextLine();
					System.out.println("전화번호를 입력하세요");
					phone[i] = scn.nextLine();
					System.out.println("입력 완료");
					
				}
				for(int i=0; i<3; i++) {
					System.out.printf("이름: %s\n",name[i]);
					System.out.printf("연락처: %s\n",phone[i]);
					System.out.printf("=============================\n");							
				}
	}
	
	
	public static void method2() {
		Scanner scn = new Scanner(System.in);
		
		String[] strAry = new String[6];
		int idx = 0;
		for (int i=1; i<=3; i++) {
			System.out.println("이름>>>");
			strAry[idx++] = scn.nextLine();
			System.out.println("연락처>>>");
			strAry[idx++] = scn.nextLine();			
		}
		for(int i=0; i<strAry.length; i++) {
			if(i%2==0) {			// 이름출력.
				System.out.println("이름: "+strAry[i]);
			}else {
				System.out.println("연락처: "+strAry[i]);
				System.out.printf("=============================\n");
			}
		}
	}
}


