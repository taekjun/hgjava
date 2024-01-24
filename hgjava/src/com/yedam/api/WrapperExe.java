package com.yedam.api;

import java.util.ArrayList;
import java.util.List;

public class WrapperExe {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1)); //기본타입 <-> 래퍼클래스타입 
		
		Double d1 = Double.valueOf("2.3").doubleValue();
		
		System.out.println(Math.abs(-10));	//절대값
		System.out.println(Math.ceil(2.1)); //올림
		System.out.println(Math.round(2.1)); //반올림
	}
}
