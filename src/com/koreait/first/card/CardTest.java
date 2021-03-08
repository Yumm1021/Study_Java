package com.koreait.first.card;

public class CardTest {

	public static void main(String[] args) {

		String[] shapes = { "spade", "clover", "heart", "diamond" };
		String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "D", "K" };

		Card[] deck01 = new Card[shapes.length * values.length];

		int count = 0;

		for (String shapes1 : shapes) {
			for (String values1 : values) {
				deck01[count++] = new Card(shapes1, values1);
			}
		}

		for (Card card : deck01) {
			System.out.println(card);
		}
	}
}