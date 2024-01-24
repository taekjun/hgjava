package com.yedam.exceptions;

public class ThrowExe {
	public static void main(String[] args) {
		try {
			method();
		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다");
		} catch(Exception ee) {
			System.out.println("알수없는 예외");
		}
	}
	
	static void method() throws ClassNotFoundException, Exception {
		
		Class.forName("java.lang.String");	//throws 하지않으면 세개다 각각 try/catch 해야한다
		Class.forName("java.lang.String");
		Class.forName("java.lang.String");
		
	}
}
