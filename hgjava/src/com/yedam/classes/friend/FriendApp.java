package com.yedam.classes.friend;

//등록기능.수정기능.삭제기능.목록확인.단건조회기능

public class FriendApp {
	//필드 선언 : 친구정보를 저장할 수 있는 배열
	private Friend[] friends;
	
	//생성자
	public FriendApp() {
		friends = new Friend[10];
	}
	
	//메소드
	
	 //등록
	public boolean add(Friend frd) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = frd;
				return true;
			}
		}
		return false;
	}
	
	 //목록보기
	public Friend[] list() {
		return friends;
	}
	
	//수정 
	public boolean modify(String phone, int age) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getPhone().equals(phone)) {
				friends[i].setAge(age);
				return true;
			}
		}
		return false;
	}
	
	//삭제
	public boolean remove(String phone) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getPhone().equals(phone)) {
				friends[i] = null;
				return true;
			}
		}
		return false;
	}
	
	//단건조회
	public Friend get(String phone) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getPhone().equals(phone)) {
				return friends[i];
			}
		}
		return null;
	}
}
