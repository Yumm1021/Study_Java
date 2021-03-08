package com.koreait.first.card;

//모양shape (spade, heart, clover, diamond)
//번호value (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)
public class Card {

	private final String shapes;
	private final String values;

	public Card(String shapes, String values) {
		this.shapes = shapes;
		this.values = values;
	}

	@Override
	public String toString() {
		return String.format("%s (%s)", shapes, values);
	}
	/*
	 * private String shape; 
	 * private String value;
	 * 
	 * public Card(String shape, String value) {
	 * 
	 * this.shape = shape; 
	 * this.value = value;
	 * 
	 * }
	 * 
	 * public String getValue() { 
	 * return value; 
	 * }
	 * 
	 * public void setValue(String value) { 
	 * this.value = value; 
	 * }
	 * 
	 * public String getShape() { 
	 * return shape; 
	 * }
	 * 
	 * public String getvalue() {
	 *  return value;
	 *   }
	 * 
	 * @Override public String toString() {
	 * 
	 * return this.shape + " (" + this.value + ")"; 
	 * }
	 */

}