package com.yedam.variable;

import java.util.Scanner;

public class VariableExe4 {
	public static void main(String[] args) {
		// true/ false.
		boolean isTrue = true; //10 > 20;
		
		isTrue = update(10);
		
		if(isTrue) {
			System.out.println("참값");
		}else {
			System.out.println("거짓값");
		}
		
		Member m1 = new Member();	//Member에는 문자와 숫자가 다 들어가 있어서 숫자나 문자 둘중 하나 입력해보면 선언이 안될거임. m1 = 20 은 선언불가
		m1.name = "홍길동";			
		m1.age = 20;
		m1.height = 167.8;
		
		Member m2 = new Member();
		m2.name = "홍길동";
		m2.age = 20;
		m2.height = 167.8;
		
		isTrue = m1.height > m2.height;
		isTrue = m1.age == m2.age;
		isTrue = m1 == m2;
		
		System.out.println(isTrue);		//m1과m2의 주소값이 서로 달라서 false가 나온다
		System.out.println(m1);				
		System.out.println(m2);			//m1과m2의 주소값이 다른걸 확인할 수 있다
		
		byte a = 10;
		int b = (int) a;	//(int)는 생략가능. 작은타입은 큰타입으로 자동변환 (허용범위가 맞아야한다)
		
	} // end of main.
	
	public static boolean update(int arg) {
		return arg % 2 == 0;	// update 값이 10으로 들어가서 참값
	} // end of update.
} // end of class.