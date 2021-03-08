package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest4 {

	public static void main(String[] args) {

		VendingMachine vm = new VendingMachine();
		vm.showMenus();
		vm.purchase();
//		showMenus(vm.getCanArr());
//		purchase(vm.getCanArr());

	}
	/*
	 * public static void showMenus(Can[] canArr) { 
	 * System.out.println("--메뉴 --");
	 * 
	 * for (int i = 0; i < canArr.length; i++) { 
	 * System.out.printf("%d. %s : %d원\n",i + 1, canArr[i].getNm(), canArr[i].getPrice()); 
	 * } 
	
	 * public static void purchase(Can[] canArr) { 
	 * int val = 0; 
	 * int sum = 0; 
	 * Scanner scan = new Scanner(System.in); 
	 * while (true) {
	 * System.out.printf("메뉴선택 (0:종료) : "); 
	 * val = scan.nextInt(); 
	 * if (val == 0) {
	 * break; 
	 * } else if (val < 0) { 
	 * System.out.println("잘못 입력하셨습니다"); 
	 * } else if (val <= canArr.length) { 
	 * sum += canArr[val - 1].getPrice(); 
	 * } else {
	 * System.out.println("잘못 입력하셨습니다"); }
	 * 
	 * } System.out.printf("총 금액 : %d", sum);
	 * 
	 * scan.close(); 
	 * }
	 */
}
