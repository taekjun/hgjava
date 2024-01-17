package com.yedam.condition;

public class CalendarExe {
	public static void main(String[] args) {
		int month = 2;		//1~4월 입력하면 그에따라 달력 바뀌게 수정				
		int pos = 1;		// 변수: 월의 1이 오는 위치.	
		int lastDate = 31;	// 변수 : 월의 마지막 날짜.
		
		switch(month) {
		case 1: pos = 1; 
				lastDate = 31; break;
		case 2: pos = 4; 
				lastDate = 29; break;			
		case 3: pos = 5; 
				lastDate = 31; break; 
		case 4: pos = 1; 
				lastDate = 30; break;		
		}
		
		// 1 ~ 31까지 반복.
		System.out.printf("SunMonTueWedThrFriSat\n");	//문자열 배열로 생성해서 진행해도 됨
		for(int i=0; i<pos; i++) {			//1일의 시작자리를 지정해줌
			System.out.printf("%3s", "");			
		}
		
		for(int d=1; d<=lastDate; d++) {	//월마다 31일까지 있는건 아니다 - 1월31일, 2월29일, 3월31일, 4월30일
			System.out.printf("%3d",d);	
			
			if((pos + d) % 7 == 0) {		//빈칸pos와 날짜d를 합했을때 7로 나눈몫이 떨어지면 한줄에 7개의 수가 들어가는 꼴이 된다.
				System.out.println("");			
												
						
			}
		}
		//System.out.println("======end of prog======");
	}
}
