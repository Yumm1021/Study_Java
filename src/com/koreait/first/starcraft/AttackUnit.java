package com.koreait.first.starcraft;

public abstract class AttackUnit extends Unit {
	
	protected final int ATTACK_POINT;
	
	public AttackUnit(int hp, int attackPoint) { 
		// AttackUnit 기본생성자
		super(hp);
		this.ATTACK_POINT = attackPoint;
	}

	public void attack(Unit unit) { // 공격대상을 파라미터에 넣어줌
		unit.hp -= ATTACK_POINT;

	}

}