package com.yedam.condition;

import java.util.Scanner;

public class WhileLoopExe2 {
	public static void main(String[] args) {
		method2();
		// 구구단 출력
		for(int j=2; j<=9; j++) {
			int num = j;	// 단 정보.
			for(int i=1; i<=9; i++) {
				// 3 * 1 = 3  이런 모양으로 출력
				System.out.printf("%d * %d = %d\n", num, i, (num*i));			
			}
			System.out.println();	
		}
		// 끝.
	}	
		
		public static void method2() {
			for(int j=1; j<=9; j++) {
				
				for(int i=2; i<=9; i++) {
					System.out.printf("%2d * %d = %2d\t", i, j, (j*i));
				}
				System.out.println();	
			}
		}
	
}