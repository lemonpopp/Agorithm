package com.test05.sort;

//단순삽입정렬 : 요소 하나 선택하여 앞쪽의 알맞은 위치에 삽입
public class Test01_Insertion {
	public static void main(String[] args) {
		int[] arr = {6,4,1,7,5,3,9,8};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("[삽입정렬]");
		insertionSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	public static void insertionSort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int j;
			int tmp = a[i]; //선택요소
			for(j=i; j>0 && a[j-1] >tmp; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
}
