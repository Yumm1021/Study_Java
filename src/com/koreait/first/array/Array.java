package com.koreait.first.array; //메소드 > 기능 

public class Array {

	public static void main(String[] args) {
		int[] intArr = new int[10]; // 정수형 배열 <정수타입만 저장>

		System.out.println("intArr.length : " + intArr.length);
		intArr[0] = 100; // 호실 0번 부터 시작함 인덱스 값은 99가지 있음

		int n1 = 100;

		System.out.println(n1);
		System.out.println(intArr[0]); // 배열 호실 값 까지 적어주면 그 안에 들어가 있는 값을 빼낼 수 있음
		System.out.println(intArr[1]);

		float[] floatArr = new float[10]; // 실수형 배열 <실수타입만 저장>
		System.out.println("floatArr.length : " + floatArr.length);
		floatArr[0] = 10.1f;
		System.out.println(floatArr[0]);
		System.out.println(floatArr[1]);

		String[] strArr = new String[10];
		System.out.println("strArr.length : " + strArr.length);
		System.out.println(strArr[0]); // 대문자로 시작하는 친구들은 주소값이 아직 안 들어가있기 때문에 null이 출력된다

		String str = "안녕"; // str에는 객체의 주소값이 들어가있음 > 객체라는 건 기능이 있다.

	}

}
