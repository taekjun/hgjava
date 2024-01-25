package com.yedam.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe {
	public static void main(String[] args) {
		// 키:값
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "홍길동");
		map.put(2, "김길동");
		map.put(3, "박길동");
		map.put(4, "홍길동");
		map.put(3, "최길동"); // 마지막에 들어온 키값으로 변경된다. 박길동->최길동으로 변경
		map.remove(3, "최길동");

		System.out.println("크기: " + map.size());

		// 키 값만 set
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> iter = keyset.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			String val = map.get(key); // key의 값을 반환
			System.out.printf("키: %d, 값: %s\n", key, val);
		}

		// 키,값 => set
		Set<Entry<Integer, String>> entry = map.entrySet(); // key와value 한번에 담고싶다 -> entry
		Iterator<Entry<Integer, String>> eiter = entry.iterator();
		while (eiter.hasNext()) {
			Entry<Integer, String> ent = eiter.next();
			System.out.printf("키: %d, 값: %s\n", ent.getKey(), ent.getValue());
		}
	}
}
