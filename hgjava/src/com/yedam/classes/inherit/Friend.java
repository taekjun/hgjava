package com.yedam.classes.inherit;

import lombok.Data;		//필드만 선언하면 알아서 필요한 요소 자동설정해줌


//이름, 연락처 (Friend)
//이름, 연락처, 학교, 전공 (UnivFriend)
//이름, 연락처, 회사, 부서 (CompFriend)
@Data
public class Friend	{
	private String name;
	private String phone;
	
	public void changeInfo(String info1, String info2) {
		return;
	}
	
	@Override	//매개변수 반환값등 체크해주는 용도
	public String toString() {
		return "이름은 " + name + " ,연락처는" + phone;
	}
	
	
}
