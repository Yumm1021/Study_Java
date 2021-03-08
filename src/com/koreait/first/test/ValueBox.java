package com.koreait.first.test;

public class ValueBox {
	private int value;
	
	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public ValueBox() {
		
	}
	
	public ValueBox(int value) {
		this.value = value;
	}
	
  
	
	 

	@Override // 부모것을 새롭게 재창조 하는 것 > 부모의 선언부를 **그대로** 따라줘야함 !!!!!!!!!!
	public boolean equals(Object obj) {
		ValueBox vb = (ValueBox) obj; // 강제 형변환 obj는 value 가지고 있지 않기 때문에 강제형변환 해줘야함
		return this.value == vb.getValue(); // 이상이 있는지 없는지 ==으로 주소값 비교

	}
}
