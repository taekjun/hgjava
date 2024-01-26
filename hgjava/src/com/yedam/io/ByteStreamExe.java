package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamExe {
	public static void main(String[] args) {
		// 입력출력 => 복사
		try {
			FileInputStream fis = new FileInputStream("c:/temp/npp.exe");
			FileOutputStream fos = new FileOutputStream("c:/temp/copy2.exe");
			//byte[] byteAry = new byte[100];	//배열을 활용한 속도향상
			
			//보조스트림 Buffered
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				int buf = bis.read();	//int buf = fis.read(byteAry);
				if(buf == -1) {
					break;
				}
				bos.write(buf);	//fos.write(byteAry);
			}
			bos.flush(); //fos.flush(); 
			bos.close(); //fos.close();
			bis.close(); //fis.close();
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of file");
	}

	static void write() {
		// 바이트 출력 스트림
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/sample.dat");
			fos.write(10);
			fos.write(20);
			fos.write(30);
			fos.flush();
			fos.close(); // 자원환원
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void read() {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/sample.dat");
			while (true) {
				int bytes = fis.read(); // end of file이 되면 -1을 반환해준다
				if (bytes == -1) {
					break;
				}
				System.out.println(bytes);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
