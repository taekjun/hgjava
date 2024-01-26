package com.yedam.io.emp;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// 초기화(데이터 활용해서 켈렉션 생성)
// 추가
// 목록
// 종료(컬렉션 내용들을 파일에 저장)
public class EmpApp {
	List<Employee> storage = new ArrayList<Employee>(); //

	public EmpApp() {
		init();
	}

	public void init() {
		try {

			File file = new File("c:/temp/emp.dat");
			if (!file.exists()) {
				file.createNewFile();
			} else {
				//file.delete();
				System.out.println(file.lastModified());
				// val/1000/60/60/24/365
			}

			FileInputStream fis = new FileInputStream("c:/temp/emp.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			storage = (List<Employee>) ois.readObject(); // 바이트정보를 읽어서 객체로 생성(역직렬화). 형변환
			ois.close();
			fis.close();
		} catch (EOFException e) {
			// 파일 읽을게 없을경우 예외
		} catch (FileNotFoundException fe) {
			System.out.println("파일이 없습니다");
		} catch (Exception ee) {
			System.out.println("알수없는 오류 발생");
		}
	}

	// 등록
	public boolean add(Employee emp) {
		return storage.add(emp);
	}

	// 목록
	public List<Employee> list() {
		return storage;
	}

	// 종료
	public void save() {
		// 기본스트림 -> 보조스트림 -> 저장 했었는데 이번에는 보조스트림대신 object
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/emp.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(storage); // 객체파일에 쓰기

			oos.flush();
			fos.flush();
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
