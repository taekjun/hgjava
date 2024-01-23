package com.yedam.interfaces;

public class DataExe {
	public static void main(String[] args) {
		// Mysql vs. Oracle
		// MysqlDB mysql = new MysqlDB();
		// OracleDB oracle = new OracleDB();
		DAO dao = new MysqlDB();	//MysqlDB만 OracleDB로 바꿔주기만 하면 기능 그대로 사용가능 
		int menu = 0;

		if (menu == 1) {
			//mysql.insert();
			//oracle.add();
			dao.insert();
		} else if (menu == 2) {
			//mysql.update();
			//oracle.modify();
			dao.update();
		} else if (menu == 3) {
			//mysql.delete();
			//oracle.remove();
			dao.delete();
		}
	}
}
