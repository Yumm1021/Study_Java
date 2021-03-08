package com.koreait.first.loop;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int result = 0; // 시작값 초기화
		int val = 0; // 입력값 초기화

		do {
			System.out.print("숫자를 입력하세요(종료:0): ");
			val = scan.nextInt(); // 숫자 입력
			result += val; // result = result + val
		} while (val != 0); // 조건식 val은 0이 되면 안된다. 0이 되면 종료임

		System.out.println("합계 : " + result); // 이때까지 모두 더해진 값 합계에 출력
		scan.close();

	}

}
