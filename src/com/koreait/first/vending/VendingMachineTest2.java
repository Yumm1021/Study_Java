package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest2 {

	public static void main(String[] args) {
		String[] nmArr = { "콜라", "사이다", "환타", "솔의눈", "데자와" };
		int[] priceArr = { 500, 600, 700, 800, 900 };

		System.out.println("--메뉴 --");

		for (int i = 0; i < nmArr.length; i++) {
			System.out.printf("%d. %s : %d원\n", i + 1, nmArr[i], priceArr[i]);
		}

		// !!!!!!!!!!! **괄호 조심** !!!!!!!!!!!!!
		int result = 0;

		Scanner scan = new Scanner(System.in);

		while (true) {

			int num = 0;

			System.out.printf("메뉴선택 (0:종료) : ");
			int val = scan.nextInt();

			if (val == 0) {
				break;

			}

			result += priceArr[val - 1]; // priceArr이 0부터 시작하니까 -1을 해줘야함

		}
		System.out.printf("총 금액 : %d", result);
		scan.close();
	}
}