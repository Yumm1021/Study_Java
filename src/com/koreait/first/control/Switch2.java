package com.koreait.first.control;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요 : ");
		String gender = scan.next();
		
		
		int avgHeight = 0; //맨 위에 가장 크게 변수 선언해주기 , 지역변수
		
		switch(gender) {
		case "남":
		case "남자":
		case "man":
			avgHeight = 166;
			break;
		case "여":
		case "여자":
		case "woman":
			avgHeight = 157;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
		if(avgHeight > 0) {
		
	System.out.print("키를 입력해주세요");
	int height = scan.nextInt();
		
			if(height > avgHeight ) {
				System.out.println("당신은 평균초과입니다");
				
			} else if(height < avgHeight ) {
				System.out.println("당신은 평균미만입니다");
				
			} else {
			
				System.out.println("당신은 평균입니다");
		}
}
}
}


		
		
		
	
	
