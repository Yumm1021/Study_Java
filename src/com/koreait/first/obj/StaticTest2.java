package com.koreait.first.obj;

public class StaticTest2 {

	public static void main(String[] args) {
		// n1 = 22, n2 = 55;
		InstCalc nbx = new InstCalc();
		nbx.n1 = 22;
		nbx.n2 = 55;

		System.out.println("nbx : " + nbx.sum());

		// static 메소드를 활용하여 계산
		System.out.println("sum : " + StatCalc.sum(22, 55));
		// > static가 붙었기 때문에 InstCalc처럼 객체화가 필요가 없음 , 객체화 안해도 이미 알고 있음
		// 클래스명 .메소드명
		
	//	static이 없었다면 이렇게 객체화 해서 호출해야함
//		StatCalc sc = new StatCalc();
//		System.out.println("sum : " + sc.sum(22, 55));
	}

}

class StatCalc {
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}

class InstCalc {
	int n1;
	int n2;

	int sum() {
		return n1 + n2;
	}
}