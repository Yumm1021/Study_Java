package com.koreait.first.var;

public class Var4 {
	public static void main(String[] args) {
		int n1 = 10; //리터럴 Literal 값 이라고 함 (10, 20, 10.1) 그 자체의 값
		int n2 = 20;
		int n3 = n1 + n2;
		
		System.out.println(n3);
		
		float f1 = 10.1F; 
		double f2 = 10.1D;
		
		int n4 = (int)f2; //실수형 값은 정수형으로 못 들어가기 때문에 강제 변환 해주는 것임
		System.out.println(n4);
		
		//-------------------------------------
		
		System.out.println("--------------");
		
		int num1 = 10;
		int num2 = 3;
		float result = (float)num1/ num2;
		
		System.out.println(result);
	}
}
