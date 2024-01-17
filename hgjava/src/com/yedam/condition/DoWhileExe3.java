package com.yedam.condition;

import java.util.Scanner;

public class DoWhileExe3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 어떤 조건일 동안 반복.
		int random = (int)(Math.random() * 100) + 1;
		while(true) {
			System.out.println("값 입력>> ");
			int input = scn.nextInt();			//scn.nextInt()를 변수로 생성 안하면 계속 새로운 값으로 인식되어 버린다.
			if(random == input) {				//크거나 작은 조건 추가해서 100까지의 숫자 맞추기
				System.out.printf("정답! 임의값 %d\n", random);
				break;
			}else if(random > input){	
				System.out.println("틀렸습니다.입력값 보다 큽니다\n");
				continue;
			}//else {													//else안쓰고 continue 사용해도 됨
//				System.out.println("틀렸습니다.입력값 보다 작습니다\n");
//			}
//			System.out.println("틀린값입니다.");
		}
		System.out.println("end of prog");
	}
}
