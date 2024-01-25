package com.yedam.collection;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("김민석");
		stack.push("최만석");
				
		stack.pop();
		while(!stack.isEmpty()) {
			String result = stack.pop();
			System.out.println(result);		//뒤에서부터 빠지기때문에 김민석이 먼저 출력된다. 그후 홍길동 출력
		}
		
		//home->product->sell->시점
	}
}
