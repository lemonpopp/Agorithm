package com.test05.sort;

//퀵정렬 : 가장 빠른 정렬 알고리즘 중 하나
public class Test03_Quick {
	public static void main(String[] args) {
		int[] arr = {5,8,4,2,6,1,3,9,7};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		System.out.println("[퀵정렬]");
		
		quickSort(arr,0,arr.length-1);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
	}
	
	public static void quickSort(int[] a, int left, int right) {
		int lc = left;			//왼쪽 커서
		int rc = right;			//오른쪽 커서
		int x = a[(lc+rc)/2];	//피벗(가운데)
		
		do {
			while(a[lc]<x) {lc++;}	//피벗보다 적으면 lc를 ++ 시킨다. 큰 값을 찾으면 스탑
			while(a[rc]>x) {rc--;}	//피벗보다 크면 rc를 -- 시킨다
			//두개의 while문 종료
			// => 피벗 기준으로 왼쪽에서 피벗보다 작은 값 찾았다.
			// => 피벗 기준으로 오른족에서 피벗보다 큰 값 찾았다.
			
			if(lc<=rc) {
				int tmp = a[lc];
				a[lc] = a[rc];
				a[rc] = tmp;
				lc++;
				rc--;
			}
			
		}while(lc<=rc);
		
		if(left<rc) {
			quickSort(a,left,rc);
		}
		if(right>lc) {
			quickSort(a,lc,right);
		}
		
	}
}
