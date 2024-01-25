package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		List <String> names = new ArrayList<>();
		names.add("홍길동");
		names.add("김민석");
		names.add("김민석");
		names.add(1, "이만수");	//1번위치에 있던 김민석이 2번으로 밀리면서 이만수가 1번위치로 들어간다
		names.add(1, "이만우");
		//names.add(1, "김만우");
		//names.set(1, "김만우");	//1번위치를 김만우로 교체
		names.remove(1);	//1번위치에 있던 김만우가 삭제되면서 뒤에있던 이만우가 1번이 된다. (null이 없도록 진행된다)
		//names.clear();	//전체 삭제
		
		System.out.println(names.size());
		
		//반복문
		for(String name : names) {		//names에 있는 String객체(name)을 하나씩 가져온다
			System.out.println(name);
		}
		
		if(names.size()>2) {
			//System.out.println(names.get(1));	//names라는 list의 1번지의 값을 불러온다(배열과 같이 0번방부터 시작)
		}
		
		List<Member> members = new ArrayList<>();
		members.add(new Member(1, "홍길동"));
		members.add(new Member(2, "김민석"));	
		members.add(new Member(3, "이충희"));
		
		for(int i=0; i<members.size(); i++) {	//2번 김민석을 4번 김길동으로 교체하기
			if(members.get(i).getName().equals("김민석")) {
				members.set(i,  new Member(4, "김길동"));
			}
		}
		
		for(int i=0; i <members.size(); i++) {
			//Member member = members.get(i);	//타입 구분 필수! 
			String name = members.get(i).getName();	
			int id = members.get(i).getMid();	
			//System.out.printf("이름: %s, 아이디: %d\n",name,id);
			System.out.printf("%s\n", members.get(i).toString());
		}
		
		
		
	}
}
