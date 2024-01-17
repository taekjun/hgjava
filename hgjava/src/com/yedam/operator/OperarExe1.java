package com.yedam.operator;

import java.util.Scanner;

public class OperarExe1 {
	public static void main(String[] args) {
		int result = 0;
		Scanner scn = new Scanner(System.in);
		
		//사용자 값을 입력: 정수입력.					
		while(true) {
			System.out.println("정수를 입력하세요>>>");
			String input = scn.nextLine();		//우선 문자열로 숫자입력하고 뒤에서 문자열을 숫자열로 타입을 변환시켜준다.
			if (input.equals("quit")) {
				break;
			}
			try {										//try catch 명령은 잘못된 값 입력시 작업되는 내용
				result += Integer.parseInt(input);		//문자열로 받은 숫자들을 숫자열로 타입 변환하는 작업			
			} catch (Exception e) {
				System.out.println("잘못된 값이 입력되었습니다.");
			}
		}
		
		// 누적값은 15 입니다.(입력했던 정수들의 합)		
		System.out.printf("누적값: %d\n", result);
		System.out.println("end of prog.");
	}
	
	public static void method1() {
		int sum = (1 + 2)* 3;
		sum = sum + 5;
		sum += 5;
		
		String str = "";
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력하세요>>>");
			String input = scn.nextLine();
			if(input.equals("quit")) {
				break;
			}
			str += input + " ";
		}
		System.out.printf("누적내용: %s\n", str);
	}
}
