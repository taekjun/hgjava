package com.yedam.classes;

public class HighStudentExe {
	public static void main(String[] args) {
		HighStudent hiStd = new HighStudent("T001","홍길동",90,"김쌤");
		
		System.out.println(hiStd.getSno());		//부모의 상속을 받아서 getSno를 사용할 수 있다.
		System.out.println(hiStd.getTeacher());
		hiStd.showInfo();		//부모클래스의 맴버
		
		System.out.println("-----------------------------------------");
		//부모클래스의 참조변수에 자식클래스의 인스턴스를 대입
		Student std = (Student) new HighStudent("T002","박길동",80,"김쌤");
		if(std instanceof HighStudent) {
			HighStudent hstd = (HighStudent) std;	//부모클래스형을 자식클래스의 형으로 강제 형변환하겠습니다.(캐스팅)
			System.out.println(hstd.getTeacher());			
		}
		
		Student std1 = new Student("S003","박석민", 80);	//부모 - 부모 객체타입이기 때문에
		if(std1 instanceof HighStudent) {
			HighStudent hstd1 = (HighStudent) std1;		//std(부모클래스)는 하이스튜던트타입(자식)으로 형변환이 불가능하다.컴파일상 오류는 아니지만 실행하면 오류가 뜬다.
			System.out.println(hstd1.getTeacher());		//그래서 if조건 사용해야한다	
		}
		
		//System.out.println(std.getTeacher());	//getTeacher는 부모클래스에 대입선언을 하지 않았기 때문에 사용할 수 없다.
		
		System.out.println("----------------------------------------");
		Student[] students = new Student[10];
		//HighStudent[] hiStudents = new HighStudent[10];
		students[0] = new Student("S001", "김민석", 90);
		students[1] = hiStd;	//HighStudent	students는 부모이지만 상속으로 인하여 사용가능
		for (int i=0; i < students.length; i++) {
			if(students[i] != null) {
				students[i].showInfo();
			}
		}
		
		long ln1 = (long) 10;	//자동 형변환(promotion) 큰 범위의 변수에는 작은범위의 변수값을 할당할수 있다. 괄호안에 long은 생략가능
		int n1 = (int) ln1;		//강제 형변환(casting)	괄호안에 int 생략 불가능
	}
}
