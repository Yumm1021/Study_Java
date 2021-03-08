package com.koreait.first.loop;

public class For6 {

	public static void main(String[] args) {
		int star = 6;
		for (int i = 0; i < star; i++) {

			for (int z = 0; z <= i; z++) { // B 구역에 Z옆에는 계속 변화하는 값이 들어와야함 > 
				                          //여기서는 i가 계속 변화하기 때문에 z<=i 가 들어와야 한다.
				System.out.print("*");

			}
			System.out.println("");
		}

	}

}
