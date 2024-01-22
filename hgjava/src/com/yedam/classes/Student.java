package com.yedam.classes;

//학생번호,이름, 점수, 키:		속성
//소개(학생번호, 이름, 점수)		동작(메소드)
public class Student {		//스튜던트라는 객체안에 번호,이름,점수,키라는 필드가 들어간다
	//필드 선언
	private String sno;		//프라이베이트 사용하면 클래스 안에서만 사용 가능함. 외부에서 사용하게 하려면 메소드 추가해야함.
	private String sname;
	private int score;
	private double height;
	private boolean onSchool;
//	String sno;	//초기값 null
//	String sname;
//	int score;	//초기값 0
//	double height;	//초기값 0.0

	
	//생성자: 기본생성자. new Friend()	생성자는 반드시 필요함. 객체 생성시 초기화 역할
	public Student(){
		
	}
	public Student(String no, String name) {		//실행파일쪽에 s2	//퍼블릭이 없을경우 다른 패키지에서 사용이 불가능해진다.
		sno = no;
		sname = name;
	}
	public Student(String no, String name,int score) {		//실행파일 s3
		this(no, name);
		this.score = score;
	}
	
	
	public Student(String sno, String sname, int score, double height) {	//마우스오른쪽-소스-밑에서3번째 유징필드 하면 자동생성
		this.sno = sno;			//this(sno,sname,score);로 세개는 묶을수 있다.
		this.sname = sname;
		this.score = score;
		this.height = height;	//height는 여기서 정의하고 있기 때문에 묶을 수 없다.
	}
	//메소드
	public void showInfo() {		//void는 반환되는 타입이 없습니다 라는 의미. 그래서 return이 따로 안들어감
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d입니다.\n",this.sno, this.sname, this.score);	//변수 헷갈리는게 없으면 this. 안붙여도 됨
	}								
	
	String showInfoStr() {		//값을 반드시 반환해 줘야함 return
		return "번호는 " + sno;
	}
	
	//프라이베이트를 외부에서 사용하기 위한 메소드, getter/setter라고 한다
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isOnSchool() {
		return onSchool;
	}
	public void setOnSchool(boolean onSchool) {
		this.onSchool = onSchool;
	}
	
	
}
