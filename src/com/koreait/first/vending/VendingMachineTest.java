package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest {

	public static void main(String[] args) {

		System.out.println("--메뉴--");
		System.out.println("1. 콜라 - 500원");
		System.out.println("2. 사이다 - 600원");
		System.out.println("3. 환타 - 700원");
		System.out.println("4. 솔의눈 - 800원");

		Scanner scan = new Scanner(System.in);
		int result = 0;

		while (true) {

			int num = 0;

			System.out.printf("메뉴선택 (0:종료) : ");
			int val = scan.nextInt();

			if (val == 0) {
				break;

			}

		}
		System.out.println("총 구매금액 : " + result);
		scan.close();
	}

}
