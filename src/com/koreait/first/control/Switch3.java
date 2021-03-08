package com.koreait.first.control;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력해 주세요 : ");
		String mon = scan.next(); //int 보다는 String 위주로 써주기
		
		
		
		switch(mon) {
		case "3": case "4": case "5": //일렬로 써도 되고 밑으로 써도 됨
			System.out.println("봄");
			break;
		case "6": case "7": case "8":
			System.out.println("여름");
			break;
		case "9": case "10": case " 11":
			System.out.println("가을");
			break;
		case "12": case "1": case "2":
			System.out.println("겨울");
			break;
		default:
				System.out.println("잘못 입력하셨습니다.");
		}
scan.close();
	}

}
