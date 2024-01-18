package com.yedam.reference;

import java.util.Scanner;

//친구의 정보를 저장하고 변경하고 관리
//Create, Read, update, Delete
public class FriendExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Friend[] friends = new Friend[5];
		
		int score = 0;
		double weight = 0;
		while(run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 5.점수조회 6.분석 9.종료");
									//5.점수조회는 입력한 점수 이상인 친구들만 출력, 6.평균점수:,최고점수: 구분해서 출력
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
			case 1: //등록			이름 안넣고 앤터치면 오류 안나게 수정하기
				System.out.println("이름>>> ");
				String name = scn.nextLine();
				System.out.println("몸무게>>> ");
				weight = Double.parseDouble(scn.nextLine());
				System.out.println("점수>>> ");
				score = Integer.parseInt(scn.nextLine());
				
				Friend friend = new Friend();
				friend.name = name;
				friend.weight = weight;
				friend.score = score;
				
				//비어있는 위치를 찾아서 정보 입력하면 브레이크 걸리게 추가
				for(int i=0; i<friends.length; i++) {
					if(friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
				System.out.println("정상 입력.");
				break;
				
			case 2: //조회 (전체목록. 이름:,몸무게:,점수:)
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null) {
						System.out.printf("이름: %s, 몸무게: %.1f, 점수: %d\n",friends[i].name,friends[i].weight,friends[i].score);
					}
				}
				break;
			case 3: //수정  이름검색->몸무게 입력->점수입력
//				weight=-1;
//				score=-1;
				System.out.println("수정할 사람의 이름을 입력하세요");
				name = scn.nextLine();
						
				//존재여부 체크
				boolean isExist = false;			
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null && friends[i].name.equals(name)) {
						
						System.out.println("수정 몸무게>>> ");
						String sweight = scn.nextLine();			
						if(!sweight.equals("")) {					//공백이 아닐때
							weight = Double.parseDouble(sweight);	//weight에 입력값을 넣는다.
						}
						System.out.println("수정 점수>>> ");
						String sscore = scn.nextLine();
						if(!sscore.equals("")) {					//공백이 아닐떄
							score = Integer.parseInt(sscore);		//score에 입력값을 넣는다.					
						}
						friends[i].score = (score != 0) ? score : friends[i].score;
						friends[i].weight = (weight != 0) ? weight : friends[i].weight;
						isExist = true;
					}
				}
				if(isExist) {
					System.out.println("수정완료.");								
				}else {
					System.out.println("수정불가.존재하지 않는 이름입니다.");	
				}			
				break;
			case 4: //삭제	
				System.out.println("삭제할 사람의 이름을 입력하세요.");	
				name = scn.nextLine();
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null && friends[i].name.equals(name)) {
						friends[i] = null;
						break;
					}
				}
				System.out.println("삭제완료.");
				break;
			case 5: //점수조회
				System.out.println("기준 점수를 입력하세요.");			
//				for(int i=0; i<friends.length; i++) {
//					if(){
//					}
//				}
//				System.out.println("asdf");	
//				break;
			case 6:	//분석(평균점수,최고점수 구분해서 출력)
				double avg = 0;
				double sum = 0;
				int max = 0;
				int cnt = 0;
				for(int i=0; i<friends.length; i++) {
					if(friends[i]!=null) {
						if(max < friends[i].score) {
							max = friends[i].score;						
						}
						sum += friends[i].score;
						cnt++;
					}
				}
				avg = sum / cnt;
//				System.out.printf("평균:%.1f, 최고점수:%.1f",avg,max);
			case 9: //종료	
				run = false;
				System.out.println("종료합니다.");
			}//end of switch
		}// end of while
		System.out.println("end of prog");
	}//end of main
}//class
