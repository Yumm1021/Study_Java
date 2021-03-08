package com.koreait.first.starcraft;

public abstract class Unit {
	protected final int MAX_HP; // final에 값을 밀어넣을려면
	protected int hp;
	private int x; // 위치값
	private int y; // 위치값

	public Unit(int hp) { // (이렇게)값을 밀어넣을 수 있게
		this.MAX_HP = hp;
		this.hp = hp;
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showMyHp() {
		System.out.printf("저의 hp : %d\n", hp);
	}
	
	public void whereIam() {
		System.out.printf("나는 %d, %d에 있다.\n", x, y);
	}
}
