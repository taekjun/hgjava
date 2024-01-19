package com.yedam.classes;

import java.util.Scanner;

public class MainExe {

	static Scanner scn = new Scanner(System.in);
	static String sno = "", sname = "";
	static int score = 0;
	static double height = 0;
	static StudentApp app = new StudentApp();
	
	//등록메서드	
	public static void insert() {
		System.out.println("학생번호>>>");
		sno = scn.nextLine();
		System.out.println("학생이름>>>");
		sname = scn.nextLine();
		System.out.println("학생점수>>>");
		score = Integer.parseInt(scn.nextLine());
		System.out.println("학생키>>>");
		height =Double.parseDouble(scn.nextLine());
		
		//매개값으로 사용
		Student std = new Student(sno, sname, score, height);
		
		if(StudentApp.add(std)) {
			System.out.println("입력성공!!");
		}else {
			System.out.println("입력실패");
		}
	}//end of insert()
	
	public static void list() {
		Student[] list = StudentApp.list();
		for(int i=0; i<list.length; i++) {
			if(list[i] != null) {
				list[i].showInfo();
			}
		}
		System.out.println("조회완료!!");		
	}//end of list()
	
	public static void update() {
		System.out.println("학생번호>>>");
		sno = scn.nextLine();
		//정상적인 학번이 맞는지 확인
		if(StudentApp.get(sno) == null) {
			System.out.println("학생번호를 확인하세요.");
			return;
		}
		//점수가 정상적인지 확인
		while (true) {
			System.out.println("학생점수>>>");
			score = Integer.parseInt(scn.nextLine());
			if(score <0) {
				System.out.println("점수를 확인하세요.");
				continue;
			}			
			break;
		}
		
		if(StudentApp.modify(sno, score)) {
			System.out.println("수정완료!!");
		}else {
			System.out.println("잘못된 학번입니다.");
		}
		
	}//end of update()
	
	public static void delete() {
		System.out.println("삭제할 학생번호>>>");
		sno = scn.nextLine();
		if(StudentApp.remove(sno)) {
			System.out.println("삭제완료!!");
		} else {
			System.out.println("잘못된 학번입니다.");
		}		
	}//end of delete()
	
	public static void search() {
		System.out.println("조회할 학생번호>>>");
		sno = scn.nextLine();
		
		Student s1 = StudentApp.get(sno);
		if (s1 != null) {
			s1.showInfo();
		}else {
			System.out.println("학생 번호가 존재하지 않습니다.");
		}
	}//end of search()

	
	public static void main(String[] args) {
//		StudentApp app = new StudentApp();		//인스턴스
		//정적타입으로 바꾸면서 app.get()과 같은 방식이 StudentApp.get()으로 바뀌게 된다.
		boolean run = true;
		while(run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 5.단건조회 9.종료");
			int menu = Integer.parseInt(scn.nextLine());		
			switch(menu){
			case 1: //등록기능
				insert();break;				
			case 2: //목록출력	
				list();break;				
			case 3: //수정
				update();break;				
			case 4: //삭제	
				delete();break;			
			case 5: //단건조회
				search();break;				
			case 9: //종료
				run = false;
				System.out.println("종료합니다");
			}
		}
		System.out.println("end of prog");
	}//end of main
}
