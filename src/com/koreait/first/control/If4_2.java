package com.koreait.first.control;

import java.util.Scanner;

public class If4_2 { //방법 3

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요(남/여) : ");
		String gender = scan.next();
		System.out.print("키를 입력해 주세요 : ");
		int height = scan.nextInt();
		
		int avgHeight = 0; //맨 위에 가장 크게 변수 선언해주기 , 지역변수
		
		if ("남".equals(gender) || "남자".equals(gender) || "man".equals(gender)) { //165
			avgHeight = 165; //값 
			
		} else if("여".equals(gender) || "여자".equals(gender) || "woman".equals(gender)) { //157
				avgHeight = 157; //값
		}
		
				if(height > avgHeight ) {
					System.out.println("당신은 평균초과입니다");
					
				} else if(height < avgHeight ) {
					System.out.println("당신은 평균미만입니다");
					
				} else {
					System.out.println("당신은 평균입니다");
			}
				
		}

		
	}

