package com.koreait.first.loop;

public class For7 {

	public static void main(String[] args) {
		int star = 6;
		for (int i = 0; i < star; i++) {

			for (int z = star - 1; z > i; z--) {

				System.out.print("_");

			}

			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();

//			for(int i=star; i>0; i--) 6에서부터 시작하여 1까지 하나씩 감소해감 6번째 자리부터 시작
//			if(i > z)  z값이 i값 보다 작을 때 언더바를 표시함
//			System.out.print("_");
//			else 
//			System.out.print("*"); z값이 i값 보다 클 때 *를 표시함
//			System.out.println(); 표시하고는 밑에 줄에 입력
//				
//			for(int i=1; i<=star; i++) i값은 1부터 시작해서 6까지 가면서 하나씩 커짐
//			for(int z=0; z<star; z++) z값은 0부터 시작해서 5까지 가면서 하나씩 커짐
//			if(star - i > z) star값에서 i값을 뺀 값이 z값보다 클 때 (예)star 6 i 1 = 5 z가 0이면 언더바를 표시함
//			System.out.print("_"); 언더바를 표시함
//			else
//			System.out.print("*"); 아닐 때는 *을 표시함
//			System.out.println(); 한줄이 끝나면 다음줄에 표시
		}

	}

}
