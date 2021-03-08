package com.koreait.first.exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		div(10, 0);
	}

	public static int div(int n1, int n2) {
		try {
			return n1 / n2; // true일 때 return을 받았기 때문에 종료됨
			// 만약 에러가 나게 되면 catch문이 실행됨
		} catch (Exception e) {
			e.printStackTrace(); // 에러가 무엇인지 알려줌
		} finally {
			System.out.println("완료 !"); // 그치만 finally이기 때문에 얘는 무조건 실행됨
		}
		System.out.println("--종료--"); // true일 때 그래서 얘가 실행이 안됨
		// 에러가 나게되면 catch문이 실행되서 종료가 출력됨
		return 0;
	}
}

//finally > 무조건 실행되는 것 !!!
//try catch는 무조건 나와야함 , finally는 옵션임