package com.koreait.first.method;

public class Method1 {

	public static void main(String[] args) {
		//void - return type/ main - method name / String[] args - parameter
		
		sum("값", 1, 2);
		sum(1, 2, "값");
//		System.out.println("값: " + sum("값", 1, 2)); 이렇게도 쓸 수 있음
	}
	
	//오버로딩 - 구분하기(parameter만 연관성 있다)
	public static void sum(String str, int n1, int n2) {
		System.out.printf("%s : %d + %d = %d\n", str, n1, n2, n1+n2);
	}
	
	public static void sum(int n1, int n2, String str) {
		sum(str, n1, n2);
	
		
	}

}
