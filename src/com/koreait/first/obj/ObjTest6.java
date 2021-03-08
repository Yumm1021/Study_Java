package com.koreait.first.obj;

public class ObjTest6 {

	public static void main(String[] args) {
		NumberBox2 nbx = new NumberBox2();
		nbx.a = 11;
		nbx.b = 22;

		NumberBox2 nbx2 = copyObj(nbx); // return 값을 nbx2에 받음
										//copy할 때마다 새로운 객체가 만들어짐

		System.out.println(nbx.sum()); // 결국 nbx와 nbx2는 같은 값을 가리킴
		System.out.println(nbx2.sum());
// ==============================================
		nbx2.a = 15;
		nbx2.b = 34;

		System.out.println(nbx.sum());
		System.out.println(nbx2.sum()); // nbx2는 값을 새로 지정해줬기 때문에 nbx2의 sum은 달라짐
	}

	public static NumberBox2 copyObj(NumberBox2 nbx) { // 비보이드문에는 무조건 return이 있어야함
		NumberBox2 result = new NumberBox2();
		result.a = nbx.a; // nbx.a값을 참조하여 result.a에 넣어줌
		result.b = nbx.b; // nbx.b값을 참조하여 result.b에 넣어줌

		return result; // 결과값을 반환해준다
	}

}
