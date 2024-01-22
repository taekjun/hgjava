package com.yedam;

import com.yedam.classes.Student;

public class StudentExe {
	public static void main(String[] args) {
		
		Student std = new Student("S001","홍길동");	//다른 패키지에서 public으로 설정하지 않으면 여기서 사용할 수 없다. 디폴트는(아무것도 안쓰여 있으면) 사용불가
		std.setScore(80);
		
		std.showInfo();	//타 패키지에서 접근을 default로 설정해 놓으면 사용할 수가 없다.
		
	}
}
