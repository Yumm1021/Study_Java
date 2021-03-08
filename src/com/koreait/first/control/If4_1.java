package com.koreait.first.control;

import java.util.Scanner;

public class If4_1 { //방법 2

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요(남/여) : ");
		String gender = scan.next();
		System.out.print("키를 입력해 주세요 : ");
		int height = scan.nextInt();
		
		
		
		if ("남".equals(gender) || "남자".equals(gender) || "man".equals(gender)) { //165
			int avgHeight = 165; //선언해주기, 이렇게 해주면 나중에 수정이 쉬움 방법2
			
			if(height > avgHeight ) {
				System.out.println("당신은 평균초과입니다");
			} else if(height < avgHeight ) {
				System.out.println("당신은 평균미만입니다");
			} else {
				System.out.println("당신은 평균입니다");
			}
			
		} else if("여".equals(gender) || "여자".equals(gender) || "woman".equals(gender)) { //157
			int avgHeight = 157; //선언 해주기, 이렇게 해주면 나중에 수정이 쉬움
			
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