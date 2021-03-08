package com.koreait.first.obj2;

public class Animal2 {
	private String name; // 멤버필드 앞에 private를 붙여야함
	private int age; // private > 접근 지시어

	//*******개중요******** 무조건 써야함 꼭 기억 !!!!!!!!!!!!!!!!!!!!!
	//넣고 빼고는 무조건 !!!!메소드 !!!! >  ** getter setter > 생성자  **
	//값 넣는 건 setter, 빼는 건 getter !!
	//넣는 건 두가지 방법이 있지만 빼는 건 한가지 방법 뿐
	//값을 넣는 건 초기화**
	
	//변수 하나당 getter 메소드 하나, setter 메소드 하나
	//setter은 뺄 수도 있음 > 특정 상황이긴 함
	
	//네이밍 규칙 있음 *set*
	public void setName(String name) { //name의 setter 
		this.name = name; //setter은 외부에서 멤버필드 값을 주기 위한 통로
		//이상한 값이 주입되지 않도록 막는 역할도 함 > 문지기 역할
		//입력 값을 확인할 수 있는 길
		//값이 들어갔는지 안 들어갔는지 굳이 확인 안함 setter은
		//들어왔으면 체크 해서 이상 없으면 그냥 둠
		//그래서 void고 !!"타입이 같아야함 *기억*"!!
		
	}
	
	// *getter*
	public String getName() { //setter과 getter 그리고 변수명 (첫 글자는 대문자)
		return this.name;
		//외부한테 주는게 getter
		//return타입이 String임, return으로 name에게 값을 줌
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void crying() {
		System.out.printf("%d살의 %s가 운다.\n", age, name);
		// 이렇게 줬다면 age와 name은 같은 클래스 안에서만 쓸 수 있음
	}

}