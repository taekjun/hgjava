package com.yedam.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExe {
	public static void main(String[] args) {		
		Calendar cal = Calendar.getInstance(); // Calendar 객체얻어오기(시스템의 현재날짜와 시간정보)
//		cal.set(2024, 0, 1); // 2024년1월1일
//		System.out.println("year: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("last Date: " + cal.getActualMaximum(Calendar.DATE));
		
//		drawCalendar(2024, 2);
		
		Date date = new Date();	//시작일이1900년
		//2024-10-5
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = sdf.parse("2024-3-3");	//String -> Date			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String result = sdf.format(date);
		drawCalendar(date);		//date 이용해서 달력 그리는것도 실습
		System.out.println(result);
	}
	
	static void drawCalendar(Date date) {		//1900년 시작 염두해서 date값과 똑같은 달력 나오도록.
		
		
	}	
//	static void drawCalendar(int year, int month) {
//
//		Calendar cal = Calendar.getInstance();
//		cal.set(year, month - 1, 1);	//month는 0이 1월이어서 -1
//		
//		int pos = cal.get(Calendar.DAY_OF_WEEK) - 1;
//		int lastDate = cal.getActualMaximum(Calendar.DATE);
//		
//		String[] days = {"Sun","Mon","Tue","Wed","Thr","Fri ","Sat\n"};
//		for (int i = 0; i < days.length; i++) { 
//			System.out.printf("%3s", days[i]);
//		}
//		
//		for (int i = 0; i < pos; i++) { 
//			System.out.printf("%3s", "");
//		}
//		
//		for (int d = 1; d <= lastDate; d++) { 
//			System.out.printf("%3d", d);
//
//			if ((pos + d) % 7 == 0) { 
//				System.out.println("");
//			}
//		}
//	}
}
