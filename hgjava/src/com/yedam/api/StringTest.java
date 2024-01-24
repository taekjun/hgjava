package com.yedam.api;

import java.text.ParseException;

public class StringTest {
	public static void main(String[] args) throws ParseException {
		// 1번문제 데이터
		String[] jumins = { "970101-1234567"// 남자
				, "970101-2234567"// 여자
				, "9701011234567"// 남자
				, "970101 1234567"// 남자
				, "030101 4234567"// 여자
				, "030101 1234567"// 오류
		};
		for (String ssn : jumins) {
			checkGender(ssn);
		}

		// 2번문제 : 길동이라는 이름이 몇번 나오는지
		String[] names = { "김길동", "홍길동", "이상민", "김민수", "길동이" };
		
		int cnt = 0;
		for(String name:names) {
			if(name.indexOf("길동")>0) {
				
			}
		}
	}

	static void checkGender(String ssn) {
		
		int yy = Integer.parseInt(ssn.substring(0,2));
		boolean before2000 = yy > 23;
		
		char pos = ssn.charAt(ssn.length() - 7);
		String gender = "여자";
		
		if(before2000) {
			if(pos=='1') {
				gender ="남자";
			}else if(pos=='2'){
				gender ="여자";
			}else {
				System.out.println("오류");
			}
		}
		
	}
}
