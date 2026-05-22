package com.test05.sort;

//병합정렬 : 배열을 나눠 각각 정렬하고 병합하는 작업을 반복
public class Test04_Merge {
	public static void main(String[] args) {
		int[] arr = {6,4,3,7,1,9,8};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("[병합정렬]");
		mergeSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	static int[] buff;
	public static void mergeSort(int[] a) {
		buff = new int[a.length];
		
		mSort(a, 0, a.length-1);
	}
	public static void mSort(int[] a, int left, int right) {
		if(left<right) {
			int center = (left+right)/2;
			int p = 0;
			int j = 0;
			int k = left;
			
			
			//center 가준으로 왼쪽, 오른쪽으로 나눠 mSort() 실행
			mSort(a,left,center);
			mSort(a, center+1, right);
			
			for(int i=left; i<=center; i++) {
				buff[p++] = a[i];
			}
			
			int i = center + 1;
			while(i<=right && j<p) {
				a[k++] = (buff[j]<=a[i]) ? buff[j++] :a[i++];
				//배열의 뒷부분과 buff에 복사해둔 배열의 앞부분과 비교하여 병합
			}
			//
			while(j<p) {
				a[k++] = buff[j++]; //버퍼에 남은 요소를 a에 복사
			}
		}
	}
}
