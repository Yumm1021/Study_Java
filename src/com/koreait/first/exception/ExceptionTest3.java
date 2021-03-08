package com.koreait.first.exception;

public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
			div(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("수학적인 에러가 발생하였습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다");
		} catch (Exception e) { // 이것은 Ari랑 ClassNot 이것보다 밑에 있어야 함 항상 !!!
			e.printStackTrace();
		}
		System.out.println("안녕");
	}

	// 에러가 발생될 것 같으면 메서드 옆에 throws Exception 표시를 해놓음
	public static void div(int n1, int n2) throws ArithmeticException, ClassNotFoundException {
		System.out.println(n1 / n2);
	}

}

//throws Exception을 하면 무조건 try catch문을 해야함

//exception도 종류가 많음 
//throws ArithmeticException, ClassNotFoundException