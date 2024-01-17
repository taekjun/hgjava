package com.yedam.condition;

import java.util.Scanner;

public class LoopExe4 {
	public static void main(String[] args) {
		// j,i => 
		for(int j = 2; j <= 5; j++) {
			for (int i = 1; i < j; i++){
				System.out.print("*");			
			}// end
			System.out.println();
		}
	}
	
	
	
	
	public static void method2() {
		boolean run = false;
		int cnt = 0;
		
		do {
			System.out.println("한번 출력합니다.. cnt: " + cnt);
			run = true;
			if (cnt++ >3) {
				run = false;
			}
		}while (run);
		System.out.println("end of prog");
	
	}
}
