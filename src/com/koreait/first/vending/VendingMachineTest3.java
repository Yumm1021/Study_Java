package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nmArr = { "콜라", "사이다", "환타", "솔의눈", "데자와" };
		int[] priceArr = { 500, 600, 700, 800, 900 };

		showMenus(nmArr, priceArr); // static 메서드

		// 1~5값만 받고, 0은 종료, 0~5 벗어난 값을 입력하면 "잘못 입력하셨습니다"
		// 0번 입력되면 합계값을 리턴하는 메서드

		int sum = purchase(priceArr, scan);

		System.out.printf("총 금액 : %d\n", sum);

	}

	public static int purchase(int[] priceArr, Scanner scan) {

		int result = 0;
		while (true) {

			System.out.printf("메뉴선택 (0:종료) : ");
			int val = scan.nextInt();

			if (val == 0) {
				break;
			} else if (val < 0) {
				System.out.println("잘못 입력하셨습니다");
			} else if (val <= priceArr.length) {
				result += priceArr[val - 1];
			} else {
				System.out.println("잘못 입력하셨습니다");
			}

		}
		return result;
	}

	/*
	 * public static int purchase(int[] priceArr, Scanner scan) { 
	 * int result = 0;
	 * while(true) { System.out.println("메뉴선택 (0:종료) : ");
	 * int val = scan.nextInt();
	 * if(val == 0) { break; 
	 * } else if(val < 0 || val > priceArr.length) {
	 * System.out.println("잘못 입력하셨습니다"); }
	 * 
	 * result += priceArr[val - 1]; } 
	 * return result; 
	 * }
	 */
	
	public static void showMenus(String[] nm, int[] pri) {

		System.out.println("--메뉴 --");

		for (int i = 0; i < nm.length; i++) {
			System.out.printf("%d. %s : %d원\n", i + 1, nm[i], pri[i]);
		}
	}

}