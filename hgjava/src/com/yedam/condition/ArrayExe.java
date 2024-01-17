package com.yedam.condition;

public class ArrayExe {
	public static void main(String[] args) {
		
		int[] intAry = {10, 20, 30}; 
		//intAry[3] = 40;		//배열 3번에 40을 추가한다. 현상태는 3번째 방까지만 있어서 불가능
		
		intAry = new int[] {10, 20, 30, 40, 50};
		intAry = new int[10];
		
		System.out.println(intAry[0] + ", 크기:" + intAry.length);	//new int[10]을 했으므로 기존 값 삭제되고 10개짜리 빈 배열이 생성된 상태라 0이뜸
		intAry[0] = 100;
		
		for(int i=0; i<10; i++) {
			intAry[i] = (int) (Math.random() * 10);
		}
		
		
		// 2,3의 배수의 값을 각각 int sum2, sum3에 저장.
		int sum2,sum3;		
		sum2 = sum3 = 0;
		
		// 2,3의 배수의 합 구하기
		for(int i=0; i<10; i++) {
			System.out.println(intAry[i]);
			if(intAry[i]%2==0) {
				sum2 += intAry[i];
			}
			if(intAry[i]%3==0) {
				sum3 += intAry[i];
			}
		}

		//각각 출력
		System.out.printf("2의 배수의 합은: %d, 3의 배수의 합은: %d\n",sum2,sum3);
		
		
		String[] strAry = {"Hong", "Park", "Kim", "20"};
		for(int i=0; i<strAry.length; i++) {
//			System.out.println(strAry[i]);
		}
		
	}
}
