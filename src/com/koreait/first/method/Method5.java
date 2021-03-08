package com.koreait.first.method;

public class Method5 {

	public static void main(String[] args) {
		gugudan(2,7);


	}
	
	public static void gugudan(int n1, int n2) {
		for(int i = n1; i <= n2; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, (i*j));
			}
			
			System.out.println("---------");
		}
		
		
	}

		public static void gugudan(int n) {
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", n, i , n*i);
			}
		}
}
