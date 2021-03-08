package com.koreait.first.loop;

//2단부터 9단까지 나타내는 for문 작성

public class For8 {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) { // 단 숫자 2단부터 시작하고 9단까지 출력 해야해서 2 초기화 10 조건식

			for (int z = 1; z < 10; z++) { // 곱해지는 숫자 1부터 시작해서 9까지 곱해져야 하니까 1 초기화 10 조건식
				System.out.printf("%d X %d = %d\n", i, z, (i * z)); // 출력값
			}

			// System.out.println("---------"); 한 단이 끝날 때 마다 언더바 표시

			if (i < 9) {
				// if(i != 9) 또 다른 표현 방식
				System.out.println("------------"); // 8단 까지만 언더바 표시
			}
		}

	}

}
