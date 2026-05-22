package com.test05.sort;

//버블 정렬: 인접한 두 요소를 바교하여 정렬하는 알고리즘
public class Test05_Bubble {
	public static void main(String[] args) {
		int[] arr = {1,5,3,7,2,9,8};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("[버블정렬]");
		
		bubbleSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("[버블정렬2]");
		
		bubbleSort2(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			int cnt = 0;
			for(int j=a.length-1; j>i; j--) {
				if(a[j-1] > a[j]) {
					//swap
					int tmp = a[j-1];
					a[j-1] = a[j];
					a[j] = tmp;
					cnt++;
				}
			}
			if(cnt == 0) {break;}	//조기 종료 조건
		}
	}
	
	public static void bubbleSort2(int[] a) {
		//앞에서부터 인접한 요소 두 개를 비교해가며 정렬
		//가장 큰 값을 우측으로 밀어 정렬
		for(int i=0; i<a.length-1; i++) {
			int cnt = 0;
			for(int j=i; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int tmp = a[j+1];
					a[j+1] = a[j];
					a[j] = tmp;
					cnt++;
				}
			}
			if(cnt == 0) { break; }
			
		}
	}
}
