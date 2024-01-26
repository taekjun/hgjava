package com.yedam.io;

public class Student {
	private int sno; //학생번호
	private String name; //이름
	private int score; //점수
	
	public Student(int sno, String name, int score) {
		super();
		this.sno = sno;
		this.name = name;
		this.score = score;
	}
	
	

	public int getSno() {
		return sno;
	}



	public String getName() {
		return name;
	}



	public int getScore() {
		return score;
	}



	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", score=" + score + "]";
	}
	
	
}
