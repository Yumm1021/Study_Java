package com.koreait.first.obj2;

public class InteriTest3 {

	public static void main(String[] args) {
		ClassD cD = new ClassD("조용필", 30); //new ClassD에 있는 메소드를 물어보고 없다면 위로 올라감
		
		cD.print(); //print 메소드 호출
		
		
	}

}
//다양성의 명제 3가지만 알고 있으면 됨
/*
1. 부모타입은 자식객체의 주소값을 가질 수 있다
ClassA cA = new ClassB();

 2. Class cB = new ClassA();
	자식타입은 부모객체의 주소값 가질 수 없다.

3. ClassC cA = new ClassD("김남길", 20);
cA.print(); 했을 땐 D가 뜸
왼쪽은 메소드를 호출 할 수 있는지 없는지만 확인함 자기가 아는 것만 호출함
ClassD cD = (ClassD)cA;
cD.ddd();로 호출하면 가능함.
*/