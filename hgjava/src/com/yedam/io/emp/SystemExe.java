package com.yedam.io.emp;

import java.io.IOException;

public class SystemExe {
	public static void main(String[] args) {
		while (true) {
			System.out.println("입력>> ");
			int input;
			try {
				input = System.in.read();
				if (input == 57) {	//9를 입력하면 종료
					break;
				}
				System.in.read();
				System.in.read();
				System.out.println(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}
}
