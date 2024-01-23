package com.yedam.imp1;

public class FlyerExe {
	public static void main(String[] args) {
		Flyer flyer = new Airplane();
		//flyer.takeOff();
		
		flyer = new Helocopter();
		//flyer.takeOff();
		
		flyer = new Seaplane();
		
		//똑같은 코드이지만 어떤 인스턴스가 담겨져 있는지에 따라 결과가 달라진다
		Driver driver = new Driver();
		driver.drive(flyer);
	}
}
