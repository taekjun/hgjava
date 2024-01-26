package com.yedam.thread;

class PrintThread extends Thread{
	private boolean stop;
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		// stop => true로 변경이 될때 프로그램 종료 코드 생성
		while(!stop) {
			System.out.println("실행중...");
		}
		System.out.println("자원정리...");
		System.out.println("실행종료...");
	}
}

public class StopFlagExe {
	public static void main(String[] args) {
		PrintThread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.setStop(true);
	}
}
