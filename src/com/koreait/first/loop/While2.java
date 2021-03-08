package com.koreait.first.loop;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int result = 0; // 초기값 0부터 시작
		System.out.print("숫자를 입력하세요(종료:0): ");
		int val = scan.nextInt(); // 숫자 입력

		while (val != 0) { // 0이 나오면 종료이기 때문에 0이 되면 안된다.
			result += val; // result = result + val > 전에 입력한 값과 새로 입력한 값 더하기

			System.out.print("숫자를 입력하세요(종료:0): ");
			val = scan.nextInt(); // 숫자 입력
		} // 숫자 0이 입력되기 전까지 반복되는 것임

		System.out.println("합계 : " + result); // 이때까지 모두 더해진 값 합계에 출력
		scan.close();

	}

}
