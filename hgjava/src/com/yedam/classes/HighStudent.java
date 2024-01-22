package com.yedam.classes;

//담임선생님
public class HighStudent extends Student {
	private String teacher;
	
//	public HightStudent() {		//하이스튜던트라는 자식의 기본생성자 필요
//		super();
//	}
	public HighStudent(String sno, String name) {
		super(sno, name);	//super는 부모
	}
	
	public HighStudent(String sno, String name, int score, String teacher) {
		super(sno, name, score);
		this.teacher = teacher;
	}
	
	//getter,setter
	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	//부모클래스의 메소드를 재정의(overriding)
	public void showInfo() {
		//자식 클래스에 있는 teacher추가 출력		부모의 것을 이미 물려받은 상태이기 때문에 this.getSno()로 사용해도 된다.
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d, 선생님은 %s입니다.\n", this.getSno(), getSname(), getScore(), teacher);
	}
	
	
}
