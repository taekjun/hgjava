package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe3 {
	public static void main(String[] args) {
		Friend f1 = new Friend(); //초기화
		f1.name = "홍길동";
		f1.weight = 67.8;
		f1.score = 80;
		
		Friend f2 = new Friend();
		f2.name = "김길동";
		f2.weight = 77.8;
		f2.score = 86;
		
		Friend f3 = new Friend();
		f3.name = "김민석";
		f3.weight = 79.8;
		f3.score = 88;
		
		//새로운 친구
		String name = "김말숙";
		double weight = 55.5;
		int score = 88;
		
		Friend f4 = new Friend();
		f4.name = "김말숙";
		f4.weight = 55.5;
		f4.score = 88;
			
		Friend[] friends = { f1,f2,f3 };
		friends = new Friend[5];		//{null,null,null,null,null}
		friends[0] = f1; 				//배열 크기를 키우고 기존에 들어있던 값 다시 넣는방법
		friends[1] = f2;
		friends[2] = f3;				//{f1,f2,f3,null,null}
		friends[3] = f4;				//{f1,f2,f3,f4,null}
		
		//직접 친구이름 검색해서 점수변경
		Scanner scn = new Scanner(System.in);
		System.out.println("찾을 친구>>>");
		String fname = scn.nextLine();
		System.out.println("변경점수입력>>>");
		int fscore = Integer.parseInt(scn.nextLine());
		
		
		
		//김말숙 => 스코어88점->90점으로 수정		
		for(int i=0; i<friends.length; i++) {
			if(friends[i] !=null && friends[i].name.equals(fname)) {		//null조건은 무조건 앞에서 있어야함
				friends[i].score = fscore;
			}
			
			//목록 출력
			if(friends[i] !=null) {		//null조건은 무조건 앞에서 있어야함
				System.out.printf("%s의 몸무게는 %.1fkg 점수는 %d\n",friends[i].name,friends[i].weight,friends[i].score);
			}
		}
	}
}
