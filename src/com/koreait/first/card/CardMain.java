package com.koreait.first.card;

import java.util.Scanner;

import com.koreait.first.obj2.Animal;
import com.koreait.first.vending.Can;

public class CardMain {

	public static void main(String[] args) {
		// 52개의 카드 객체를 담을 수 있는 배열 생성
		// 52개의 서로 다른 값을 가지고 있는 카드 객체를 모두 담아주세요
		String[] shapes = {"diamond", "heart", "clover", "spade"};
		String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "D", "K"};
		
		Card[] deck01 = new Card[shapes.length * values.length];
		
		int count = 0;
		
		for(String shapes1: shapes) {
			for(String values1:  values) {
				deck01[count++] = new Card(shapes1, values1);
			}
		}
		
		for(Card card: deck01) {
			System.out.println(card);
		}
}
}