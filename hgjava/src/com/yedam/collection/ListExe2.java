package com.yedam.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExe2 {
	public static void main(String[] args) {	//뒤에서부터 붙여나가는건 ArrayList가 빠르지만 앞에서 채워나가는거는 LinkedList가 빠르다.
		List<String> list1 = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("결과1: "+(end-start));

		List<String> list2 = new LinkedList<>();
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("결과2: "+(end-start));
		
	}
}
