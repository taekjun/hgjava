package com.yedam.interfaces.emp;

import java.util.ArrayList;

public class ArrayListExe {
	public static void main(String[] args) {
		//배열
		Employee[] employeeAry = new Employee[10];
		employeeAry[0] = new Employee(101,"홍길동");	//인덱스에 대입
		employeeAry[1] = new Employee(102,"김민석");
		Employee emp = new Employee(103,"황인만");
		employeeAry[2] = emp;
		//employeeAry[2] = null;	//삭제
		
		for(int i=0; i<employeeAry.length; i++){
			if(employeeAry[i] != null) {
				System.out.println(employeeAry[i].getName());
			}
		}
		
		System.out.println("--------------------------------");
		//컬렉션. 값이 순차적으로 채워짐. null이 없음
		ArrayList<Employee> employeeAryList = new ArrayList<Employee>();
		employeeAryList.add(new Employee(104,"최홍길"));	
		employeeAryList.add(new Employee(105,"이만기"));	
		employeeAryList.add(emp);
		//employeeAryList.remove(2);	//삭제
		for(int i=0; i<employeeAryList.size(); i++) {
			System.out.println(employeeAryList.get(i).getName());
		}
	}
}
