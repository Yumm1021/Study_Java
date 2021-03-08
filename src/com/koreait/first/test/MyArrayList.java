package com.koreait.first.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList {
	private int[] arr = new int[0];

	
	public void add(int val) {
		int[] temp = new int[arr.length + 1];
		temp[arr.length] = val;
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];

		}
		arr = temp;
	}
	
	
	public int[] getArr() {
		return arr;
	}

	public int remove(int idx) {
		// arr[] = {100,330,200}
		int a = arr[idx]; // return 해야 하는 값
		// a = 300;
		int[] temp = new int[arr.length -1]; //기존보다 한칸 줄여야 하기 때문에 -1을 해줌
		//temp []  ={0,0} 
		//			0    1   2  
		// arr[] = {100,330,200}		
		
		// i = 0  ->  temp[] = {100,0}
		// i = 1  > temp[] = [100, ]
		
		for(int i = 0; i < temp.length ; i++) {
			
			if (i < idx) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i+1]; //중간에 하나가 삭제가 되었기 떄문에 +1한 값을 temp에 넣어줄거임
			}
			
			//temp[] = {100,200};
			
		}
		arr = temp;
		return a;
	}

	public void add(int idx, int val) {
		int[] temp = new int[arr.length + 1];
		// [0,0,0,0]

		temp[idx] = val;
		// temp[] = [0,500,0,0]

		// temp[] 배열속에 0값을 arr값을 채우기 위한 for문
		for (int i = 0; i < arr.length; i++) {
			if (i < idx) {
				temp[i] = arr[i];
				// i=0일때 idx=1 0 < 1 이므로 [100,500,0,0];
			} else {
				temp[i + 1] = arr[i];
				// i= 1 일때 [100,500,200,0];
				// i= 2 일때 [100,500,200,300];
				
			}
			// temp[i < val1 ? i : i + 1] = arr[i];
		}
			
		arr = temp;
	}

	
	public int get(int idx) {
		return arr[idx];
	}
	
	@Override
	public String toString() {
/*		String str = "["; //"스트링 빌드" 사용 안한 방법
		for(int i = 0; i < arr.length; i++) {
			str += arr[i] + ( i < arr.length - 1 ? ", " : ""); 
			//맨 마지막 숫자 뒤에 , 없애는 방법
		}
		
		str += "]";
		return str;
*/		
		StringBuilder sb = new StringBuilder("["); //"스트링 빌드" 사용한 방법
			for(int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
				
				if(i<arr.length-1) {
					sb.append(", ");
				}
			}
			sb.append("]");
			return sb.toString();
	}

}