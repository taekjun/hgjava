package com.yedam.interfaces.emp;

import java.util.Scanner;

import com.yedam.classes.singleton.Employee;

//배열 Employee[]
public class EmployeeArray implements EmployeeList {
	// 싱글턴
	private static EmployeeArray instance = new EmployeeArray();
	Employee[] list;
	int empNum;
	Scanner scn = new Scanner(System.in);

	private EmployeeArray() {

	}

	public static EmployeeArray getInstance() {
		return instance;
	}

	@Override
	public void init() {
		System.out.println("사원수>>");
		int num = scn.nextInt();
		list = new Employee[num];
		empNum = 0; // 초기화
	}

	@Override
	public void input() {
		if (empNum == list.length) {
			System.out.println("입력초과");
			return;
		}
		System.out.printf("%d 사번", empNum);
		int no = scn.nextInt();

		System.out.println("이름>> ");
		String name = scn.next();

		System.out.println("급여>> ");
		int sal = scn.nextInt();

		list[empNum++] = new Employee(no, name, sal);
	}

	@Override
	public String search(int empId) {
		// 해당사번이 있으면 이름 반환, 없으면 ""
		for (int i = 0; i < empNum; i++) {
			if (list[i].getEmployeeId() == empId) {
				return list[i].getName();
			}
		}
		return "";
	}

	@Override
	public void print() {
		// 사원번호, 이름, 급여 출력
		for (int i = 0; i < empNum; i++) {
			System.out.printf("%4d %10s %7d\n", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
		}
	}

	@Override
	public int sum() {
		int total = 0;
		for (int i = 0; i < empNum; i++) {
			total += list[i].getSalary();
		}
		return total;
	}

}
