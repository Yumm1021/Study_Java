package com.koreait.first.control;

import java.util.Scanner;

public class If4 { //방법 1

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요(남/여) : ");
		String gender = scan.next();
		System.out.print("키를 입력해 주세요 : ");
		int height = scan.nextInt();
		
		
	
		
		if ("남".equals(gender) || "남자".equals(gender) || "man".equals(gender) ) {  //세가지 모두 입력하기 위해서 여기에 추가해주면 됨
			
			if(height > 165 ) {
				System.out.println("당신은 평균초과입니다");
			} else if(height < 165 ) {
				System.out.println("당신은 평균미만입니다");
			} else {
				System.out.println("당신은 평균입니다");
			}
			
		} else if("여".equals(gender) || "여자".equals(gender) || "woman".equals(gender)) { 
			if(height > 157) {
				System.out.println("당신은 평균초과입니다");
			} else if(height < 157) {
				System.out.println("당신은 평균미만입니다");
			} else {
				System.out.println("당신은 평균입니다");
			}
		}

		
	}

}
