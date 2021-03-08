package com.koreait.first.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;

		try { // 예외가 발생할거라고 예상되는 부분에 try로 묶어줌 > 일단 시도해봐
			System.out.println(n1 / n2);
			System.out.println("에러 안났음");
		} catch (Exception e) { // 에러가 발생했다 > catch
			// 에러가 발생했을 떄, 예외가 발생했을 때만 catch문이 출력됨
			e.printStackTrace(); // 에러가 무엇인지 알려줌
			System.out.println("에러 발생 !!");
		} finally { // 예외가 터지는 안터지는 무조건 실행됨 > finally
			System.out.println("Finally !!");
		}
		System.out.println("안녕하세요 !!");

	}

}

//에러가 나도 try는 빠져나오고 에러가 안 나와도 try문은 빠져나옴