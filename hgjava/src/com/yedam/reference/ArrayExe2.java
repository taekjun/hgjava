package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
//		System.out.println("친구입력>>>");
//		String name = scn.nextLine();
		
		//이름 검색하면 그사람의 몸무게와 점수를 출력
		String[] friends = {"홍길동", "김민수", "박석민", "최홍만", "김길동"};
		double[] db1Ary = {67.3, 72.5, 88.3, 79.3, 90.4};
		int[] scores = new int[5];
		scores[0] = 78;
		scores[1] = 92;
		scores[2] = 95;
		scores[3] = 90;
		scores[4] = 91;
		
		//점수가 제일 높은 학생의 이름과 몸무게 출력
		int max = 0;
		String name = "";
		double weight = 0;
		for(int i=0; i<scores.length; i++) {
			if(max<scores[i]) {
				max = scores[i];
				name = friends[i];
				weight = db1Ary[i];
			}
		}
		System.out.printf("최고점수 이름: %s, 몸무게: %.1fkg\n",name,weight);
		
			
		//값을 입력해서 해당 값이 몇번째에 위치하고 있는지 확인
		//김민수는 2번째 위치에 있습니다.
		//등록되지 않은 이름이면 찾는이름이 없다고 출력
		boolean isExist = false;
		for(int i=0; i<friends.length; i++) {
			if(friends[i].equals(name)) {
//				System.out.println((i+1)+"번째 입니다.");
				System.out.printf("%s은 %.1fkg, %d점 입니다.",friends[i],db1Ary[i],scores[i]);
				isExist = true;
			}
		}
		if(!isExist) {								//isExist값이 false가 되어야 실행된다. !isExist여서 결국 true가 됨
			System.out.println("찾는 이름이 없습니다.");			
		}
		
		
		System.out.println("\nend of prog");
	}
	
	
	
	
	
	
	
//==========================================================================================	
	public static void method1() {
		int[] scores = new int[10];
		
		scores[3] = 40;
		scores = new int[5];	//크기5짜리 배열을 다시 선언했기때문에 위에 정의한 4번방값 40은 초기화되어 0이 되어버림.
		scores[4] = 50;
		
		scores = new int[5];
		scores[0] = 78;
		scores[1] = 82;
		scores[2] = 77;
		scores[3] = 91;
		scores[4] = 85;
		
		//80점 이상인 학생은 3명입니다.
		//90점 이상인 학생은 ?명 입니다.
		//90점 이상 학생이 없으면 없다는 문구 출력
		int cnt = 0;
		for(int i=0; i < scores.length; i++) {
//			System.out.println("scores[" + i + "]=> " + scores[i]);
			if(scores[i] > 90) {
				cnt++;
			}	
		}
		if(cnt>0) {
			System.out.printf("90점 이상인 학생: %d명 입니다.",cnt);
		}else {
			System.out.printf("90점 이상인 학생은 없습니다");
		}	
		System.out.println("\nend of prog.");
	}
	
//=========================================================================================	
	public static void method2() {
		double[] db1Ary = {67.3, 72.5, 88.3, 79.3, 90.4};
		// 배열의 최대값 찾아서 출력
		double max = 0;
		for(int i=0; i<db1Ary.length; i++) {			
			if(max < db1Ary[i]) {
				max = db1Ary[i];
			}
		}
		System.out.println("제일 무거운 몸무게는: " + max);
				
		double avg = 0;
		double sum = 0;
		//평균 몸무게 구하기
		for(int i=0; i<db1Ary.length; i++) {
			sum += db1Ary[i];
		}
		avg = sum / db1Ary.length;
//		System.out.println("평균 몸무게는" + avg + "입니다.");
//		System.out.printf("평균 몸무게는: %.2f입니다.",avg);
//		System.out.println(sum/db1Ary.length);
		System.out.println("\nend of prog");
	}
//=================================================================================================	
}
