package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachine { // 멤버필드는 특수한 경우가 아니고는 선언만 사용함
	private Scanner scan = new Scanner(System.in);
	private Can[] canArr; // Can의 배열
	private int sum; // Can의 변수

	public Can[] getCanArr() {
		return canArr;
	}

	public VendingMachine() { // 기본생성자 만들어주기
		init();
	}

	private void init() { // private이기 때문에 외부에서 호출 불가 , private는 내부용
		String[] nmArr = { "콜라", "사이다", "환타", "솔의눈", "데자와" };
		int[] priceArr = { 500, 600, 700, 800, 900 };

		scan = new Scanner(System.in); // 메서드에서 값을 넣는 방법

		canArr = new Can[nmArr.length]; // 배열의 크기는 5개 , 5칸 짜리 Can 배열을 만드는 것
										// > 각 방의 배열값 null 값을 들어있음
		// int float doule은 거의 0이 들어가있고 네퍼런스는 null값이 들어있음

		// null인 값을 가지고 방을 돌면서 **주소값을 넣는 것임**
		// 각 방의 들어가는 주소값은 다 다름 > 구조는 다 같지만 주소값은 다 다름
		for (int i = 0; i < canArr.length; i++) {
			canArr[i] = new Can(nmArr[i], priceArr[i]);
		}

	}

	public void showMenus() {
		System.out.println("--메뉴 --");

		for (int i = 0; i < canArr.length; i++) {
			System.out.printf("%d. %s : %d원\n", i + 1, canArr[i].getNm(), canArr[i].getPrice());
		} // canArr의 이름을 빼내기 위해 .getNm() 사용
			// canArr의 값을 getter 사용하는 것임
	}

	public void purchase() {
		int val = 0;

		while (true) {
			System.out.printf("메뉴선택 (0:종료) : ");
			val = scan.nextInt();
			if (val == 0) {
				break;
			} else if (val < 0) {
				System.out.println("잘못 입력하셨습니다");
			} else if (val <= canArr.length) {
				sum += canArr[val - 1].getPrice();
			} else {
				System.out.println("잘못 입력하셨습니다");
			}

			/*
			 * if(val ==0) { break; }else if(val <0 || val > canArr.length) {
			 * System.out.println("잘 못 입력하셨습니다.");
			 * 
			 * } Can can = canArr[val -1]; sum += can.getPrice();
			 */
		}

		System.out.printf("총 금액 : %d\n", sum);

		scan.close();

	}

}