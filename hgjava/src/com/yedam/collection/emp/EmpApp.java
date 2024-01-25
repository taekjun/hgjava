package com.yedam.collection.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		List<Employee> storage = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");	

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.println("1.등록 2.조회(입사일자) 9.종료");
			System.out.println("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
			case 1:
				System.out.println("사번 이름 입사일(yy-MM-dd) 급여>>");
				String[] valAry = scn.nextLine().split(" ");
				
				try {
					Employee newEmp = new Employee(Integer.parseInt(valAry[0]), //사원번호
							valAry[1], //이름
							sdf.parse(valAry[2]), //입사일 
							Integer.parseInt(valAry[3])); //급여
					storage.add(newEmp);
					System.out.println("추가 완료");
				} catch (Exception e) {
					System.out.println("오류(양식 확인)");
				}
				break;
			case 2:
				Date searchCondition;
				while(true) {
					System.out.println("조회할 입사일 입력");
					try {
						searchCondition = sdf.parse(scn.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("입사일이 부정확합니다");
					}
				}
				for (int i=0;i<storage.size(); i++) {
					if(storage.get(i).getHireDate().after(searchCondition) 
							|| storage.get(i).getHireDate().equals(searchCondition)){
						System.out.println(storage.get(i).toString());
					}
				}
				break;
			case 9:
				run = false;
			}
		}
		System.out.println("end of prog");
	}

	void method() {
		// "101 홍길동 23-05-08 100"
		String val = "101 홍길동 23-05-08 100";
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		String[] valAry = val.split(" "); // 빈칸으로 구분한다
		for (String value : valAry) {
			System.out.println(value);
		}
		try {
			new Employee(Integer.parseInt(valAry[0]), valAry[1], sdf.parse(valAry[2]), Integer.parseInt(valAry[3]));
		} catch (Exception e) {

		}
		
		// "23-03-01" 문자값을 Date로 바꿔줘야함
		// 입사일 입력하면 입사일 기준으로 그 이후에 입사한사람 목록을 조회한다
	}
}
