package com.yedam.reference;

public class RefExe1 {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 100;
		System.out.println(n1==n2);
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		System.out.println(str1==str2);		//주소값이 달라서 false
		System.out.println(str1.equals(str2));		//실제 값 자체를 비교했기 때문에 true
		
		int[] intAry = new int[10];
		intAry = null;						//NullPointerException이 뜨게됨
		System.out.println(intAry[0]);		//(intAry) -> 주소값이 출력됨. (intAry[0]) -> 배열첫번째에 들어있는 값이 출력됨
		
	}
}
