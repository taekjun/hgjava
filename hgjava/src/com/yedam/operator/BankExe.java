package com.yedam.operator;

import java.util.Scanner;

// 은행계좌. 일정금액 넘으면 입금불가. 잔액 마이너스 불가
public class BankExe {
	public static void main(String[] args) {
		// 입금, 출금, 잔고, 프로그램 종료 4개의 기능 추가
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("1.입금 2.출금 3.잔고 4.종료");
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
			case 1:
				System.out.println("입금액>> ");
				int val = Integer.parseInt(scn.nextLine());	//총 잔고값을 변수 지정 
				if (balance + val > 100000) {
					System.out.println("입금액 초과!");	
					break;
				}
				balance += val;
				System.out.println("저장성공!");							
				   break;
			case 2:System.out.println("출금액>> ");
				   val = Integer.parseInt(scn.nextLine()); 
				   if (balance < val) {
					   System.out.println("출금액 초과");
					   break;
				   }
				   balance -= val;
				   System.out.println("저장성공!");
				   break;
			case 3:System.out.printf("잔고: %d\n",balance);
				   break;
			case 4:
				run = false;
				
			}
		}
		System.out.println("end of prog");
	}
}
