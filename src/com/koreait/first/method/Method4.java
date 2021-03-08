package com.koreait.first.method;

public class Method4 {

	public static void main(String[] args) {
		printStarReverseTri(6); // method 호출

	}

	public static void printStarReverseTri(int n1) {
		for(int i = n1-1; i >=0; i--) { //i값은 호출값에서 하나씩 뺀 값, 하나씩 감소하기
			printShape(i, " "); // 모양은 띄우기
			printStar(n1 - i); // 호출값에서 i값을 뺀 값에는 *를 표시
			System.out.println();
		}
	}

	public static void printShape(int n1, String shape) {
		for (int i = 0; i < n1; i++) {
			System.out.print(shape);
		}
	}

	public static void printStar(int n1) {
		printShape(n1, "*"); 
	}

	public static void printStarSqure(int n1) {
		for (int i = 0; i < n1; i++) {
			printStar(n1);
			System.out.println();
		}
	}

	public static void printStarTri(int n1) {
		for (int i = 1; i <= n1; i++) {
			printStar(i);
			System.out.println("");
		}
	}

}
