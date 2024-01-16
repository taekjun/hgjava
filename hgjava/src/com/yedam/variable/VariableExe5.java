package com.yedam.variable;

public class VariableExe5 {
	public static void main(String[] args) {
		// char 65536개에 
		
		double d1 = 10.0;
		//double result = d1 + 20;		//20은 int 타입이지만 자동으로 20.0인 double타입으로 변경된다
		double result = d1 + (double) 20.0f;	//float타입을 double타입으로 변경
		
		int sum = 60;
		result = sum / 7.0;		//7.0을 7로 바꿔서 계산해보면 뒤에 소수점 값이 안나온다.
		System.out.println(result);
		
		sum = Integer.parseInt("1") + 3 + 5;
		
		result = Double.parseDouble("1.234") + 2.3;
		
		
		for (int i=0; i<10; i++) {
			int temp = (int) (Math.random()*25)+97;
			System.out.println((char) temp);		//임의의 숫자를 문자로 나열한다
		}
	}
}