package com.yedam.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

// 생성자(초기화), 등록, 검색, 삭제, 종료(파일저장)
public class PhoneBookManager {

	private File dataFile = new File("c:/temp/phonebook.dat");
	
	// 컬렉션 선언
	HashSet<PhoneInfo> storage = new HashSet<>();
	
	// 싱글톤
	private static PhoneBookManager instance; // 초기값=null

	private PhoneBookManager() {
		// 초기화작업
		readFromFile();
	}

	public static PhoneBookManager getInstance() {
		if (instance == null) {
			instance = new PhoneBookManager();
		}
		return instance;
	}
	
	// 메소드1,2,3 (일반,회사,학교) 
	private PhoneInfo getFriendInfo() {
		System.out.println("이름> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처> ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo getCompanyFriendInfo() {
		System.out.println("이름> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처> ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("회사정보> ");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}
	
	private PhoneInfo getUnivFriendInfo() {
		System.out.println("이름> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처> ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("전공> ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.println("학년> ");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine(); //엔터처리
		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	// 추가
	public void inputData() {
		System.out.println("구분");
		System.out.println("1.일반 2.회사 3.학교");
		System.out.print("선택>> ");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine(); //엔터처리도 필요함
		
		PhoneInfo info = null;
		switch(choice) {
		case InputSelect.NORMAL:
			info = getFriendInfo();
			break;
		case InputSelect.COMPANY:
			info = getCompanyFriendInfo();
			break;
		case InputSelect.UNIV:	
			info = getUnivFriendInfo();
		}
		if (storage.add(info)) {
			System.out.println("등록완료");
		} else {
			System.out.println("등록오류");
		}
	}
	
	// 조회
	public void searchData() {
		System.out.println("이름>>");
		String name = MenuViewer.keyboard.nextLine();
		
		Iterator<PhoneInfo> iter = storage.iterator();
		while(iter.hasNext()) {
			PhoneInfo info = iter.next();
			if(info.getName().equals(name)) {
				System.out.println(info);
				System.out.println("=====조회 완료=====");
				return;
			}
		}
		
		/*Iterator<PhoneInfo> iter = storage.iterator();
		while(iter.hasNext()) {
			PhoneInfo info = iter.next();
			System.out.println(info);
		}
		System.out.println("=====조회 완료=====");*/
	}
	
	// 삭제
	public void deleteData() {
		// 이름기준으로 검색해서 같은 이름이 있으면 스토리지에서 삭제
		// HashSet은 인덱스값이 없는걸 인지. 반복자(Iterator)사용 iter.hanNext, iter.next, iter.remove
		System.out.println("이름>>");
		String name = MenuViewer.keyboard.nextLine();
		
		Iterator<PhoneInfo> iter = storage.iterator();
		while(iter.hasNext()) {
			PhoneInfo info = iter.next();
			if(info.getName().equals(name)) {
				iter.remove();
				System.out.println("삭제 완료");
				return;
			}
		}
		System.out.println("삭제할 이름이 없습니다");
	}
	
	// 초기화
	public void readFromFile() {
		if (dataFile.exists() == false) {
			return; // 메소드 종료.
		}

		// 파일이 있으면 파일을 읽어온다
		try {
			FileReader fr = new FileReader(dataFile);
			BufferedReader br = new BufferedReader(fr);
			String str = ""; // 잠시 담아두는 변수 선언
			PhoneInfo info = null;
			while ((str = br.readLine()) != null) {
				String[] record = str.split(",");
				// 컬렉션에 저장
				int type = Integer.parseInt(record[0]);
				switch(type) {
				case InputSelect.NORMAL:
					info = new PhoneInfo(record[1], record[2]);
					break;
				case InputSelect.COMPANY:	
					info = new PhoneCompanyInfo(record[1], record[2], record[3]);
					break;
				case InputSelect.UNIV:
					info = new PhoneUnivInfo(record[1], record[2], record[3], 
							Integer.parseInt(record[4]));
					
				}
				storage.add(info);
			} // end of while
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of readFromFile()
	
	//저장
	public void storeToFile() {
		try {
			FileWriter fr = new FileWriter(dataFile);
			Iterator<PhoneInfo> iter = storage.iterator();
			
			while(iter.hasNext()) {
				PhoneInfo info = iter.next();
				// toString활용
				fr.write(info.toString()+"\n");
			}
			fr.flush();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
} // end of class
