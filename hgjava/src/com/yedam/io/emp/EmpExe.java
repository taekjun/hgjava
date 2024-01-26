package com.yedam.io.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class EmpExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		EmpApp app = new EmpApp();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		while (run) {
			System.out.println("1.등록 2.목록 9.종료");
			System.out.println("선택>> ");

			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:// 번호 이름 입사일자 급여
				//Employee emp = new Employee(0, "", new Date(), 0);

				System.out.println("사원번호 이름 입사일자(yy-MM-dd) 급여>> ");
				String[] strAry = scn.nextLine().split(" ");

				Employee newEmp = null;
				try {
					newEmp = new Employee(Integer.parseInt(strAry[0]), // 사원번호
							strAry[1], // 이름
							sdf.parse(strAry[2]), // 입사일
							Integer.parseInt(strAry[3])); //급여
				} catch (ParseException e) {
					System.out.println("날짜 양식이 잘못되었습니다.");
				}// 급여

				if (app.add(newEmp)) {
					System.out.println("===등록완료===");
				} else {
					System.out.println("!!!등록실패!!!");
				}
				break;
			case 2:
				List<Employee> list = app.list();
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}
				System.out.println("===목록 출력 완료===");
				break;
			case 9:
				System.out.println("===프로그램 종료===");
				app.save();
				run = false;
			}
		}
		System.out.println("end of prog");
		scn.close();
	}

}
