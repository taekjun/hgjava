package com.yedam.classes.friend;

//친구이름, 연락처, 나이를 관리
public class Friend {
	private String name;
	private String phone;
	private int age;
	
	public Friend(String name, String phone, int age) {
		this.name = name;
		this.phone = phone;
		this.age = age;
		
	}
	
	void showInfo() {
		System.out.printf("이름은 %s, 연락처는 %s, 나이는 %d 입니다.\n",this.name,this.phone,this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
