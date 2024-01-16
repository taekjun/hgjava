package com.yedam.variable;

import java.util.Scanner;

public class VariableExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//System.out.println("나이를 입력>>>");
		//String result = scn.nextLine(); //입력값을 문자열로 반환.
		//int result = scn.nextInt();
		//System.out.println("당신의 이름은 " + result + "입니다.");
		
		// 이름입력 (=name), 연락처(=phone) : scn.nextLine()
		System.out.println("이름 입력");
		String name = scn.nextLine();
		System.out.println("전화번호 입력");
		String phone = scn.nextLine();
		
		// 영어(=eng), 수학(=mat) => 합계(=sum) : scn.nextInt()
		System.out.println("영어점수 입력");
		int eng = scn.nextInt();
		System.out.println("수학점수 입력");
		int mat = scn.nextInt();
		
		int sum = eng + mat;
		
		System.out.println("이름: " + name + ", 연락처: " + phone);
		System.out.println("영어: " + eng + ", 수학: " + mat + ", 합계:" + sum);
	}	
}
