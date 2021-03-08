package com.koreait.first.loop;

public class For9 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {

			for (int z = 2; z < 10; z++) {
				System.out.printf("%d X %d = %d\t", z, i, (z * i)); // For8문과 비슷한건데 z와 i 자리를 바꿔주면 된다.
			}

			if (i < 9) {
				System.out.println();
			}

		}

	}
}
