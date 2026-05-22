package com.test05.sort;

//단순선택정렬 : 가장 작은 요소를 선택하고 맨 앞으로 이동
public class Test02_Selection {
	public static void main(String[] args) {
		int[] arr = {6,4,8,5,2,10,7};
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("[선택정렬]");
		
		selectionSort(arr);
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void selectionSort(int[] a) {
		for(int i=0; i<a.length -1; i++) {
			//작은 요소 찾기
			int min = i; //아직 정렬되지 않은 부분에서 가장 작은 요소가 저장된 인덱스 저장
			for(int j=i+1; j<a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			//선택한 최솟값을 제일 앞으로 ...swap
			int tmp = a[i];
			a[i] = a[min];
			a[min] = tmp;
		}
	}
	
}
