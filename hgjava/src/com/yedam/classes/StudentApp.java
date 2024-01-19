package com.yedam.classes;  

//학생의 정보를 관리하는 기능
public class StudentApp {
	//필드
	private static Student[] students;		//null
	
	//생성자
	public StudentApp() {
		students = new Student[10];
	}
	
	//students = 메모리할당
	static {
		students = new Student[10];
	}
	
	//메소드		리턴값 받아야하는거 항상 신경쓸것
	
	//등록
	public static boolean add(Student std) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
			   students[i] = std;
				return true;
			}
		}
		return false;			//반드시 true나 false값이 반환되어야 함
//		System.out.println("입력성공");
	}
	
	//목록
	public static Student[] list() {
		return students;
	}
	
	//수정(학생번호를 이용해서 점수 수정)
	public static boolean modify(String sno, int score) {
		for(int i=0; i<students.length; i++) {
			if(students[i] != null && students[i].getSno().equals(sno)) {
				students[i].setScore(score);
				return true;
			}
		}
		return false;
	}
	
	//삭제(학생번호 이용해서 삭제)
	public static boolean remove(String sno) {
		for(int i=0; i<students.length; i++) {
			if(students[i] != null && students[i].getSno().equals(sno)) {
				 students[i] = null;
				 return true;
			}
		}
		return false;
	}
	
	//단건조회(학생번호 넣으면 해당 정보 반환)
	public static Student get(String sno) {
		for(int i=0; i<students.length; i++) {
			if(students[i] != null && students[i].getSno().equals(sno)) {
				 return students[i];
			}
		}
		return null;
	}
	
	
	
}
