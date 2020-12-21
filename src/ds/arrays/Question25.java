package ds.arrays;

import org.junit.Test;

public class Question25 {

	/* Sort Colors */
	
		@Test
		public void example1() {
			int arr[] = { 2, 0, 2, 1, 1, 0 };
			sortColor(arr);
		}

		// Method 1 Bubble Sort(Time complexity O[N^2])
//		private void sortColor(int arr[]) {
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = 0; j < arr.length; j++) {
//					if(arr[i]<arr[j]) {
//						int temp = arr[i];
//						arr[i] = arr[j];
//						arr[j] = temp;
//					}
//				}
//			}
//			
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i]);
//			}
//		}

		// Method 2 Merge Sort
//		private void sortColor(int arr[]) {
//			sort(arr, 0, arr.length - 1);
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i]);
//			}
//		}
	//
//		private void sort(int arr[], int l, int r) {
//			if (l < r) {
//				int m = (l + r) / 2;
//				sort(arr, l, m);
//				sort(arr, m + 1, r);
//				merge(arr, l, m, r);
//			}
//		}
	//
//		private void merge(int arr[], int l, int m, int r) {
//			int n1 = m - l + 1;
//			int n2 = r - m;
	//
//			int L[] = new int[n1];
//			int R[] = new int[n2];
	//
//			for (int i = 0; i < n1; i++) {
//				L[i] = arr[l+i];
//			}
	//
//			for (int i = 0; i < n2; i++) {
//				R[i] = arr[m+1+i];
//			}
	//
//			int i = 0;
//			int j = 0;
//			int k = l;
//			while (i < n1 && j < n2) {
//				if (L[i] <= R[j]) {
//					arr[k] = L[i];
//					i++;
	//
//				} else {
//					arr[k] = R[j];
//					j++;
//				}
//				k++;
//			}
	//
//			while (i < n1) {
//				arr[k] = L[i];
//				i++;
//				k++;
//			}
	//
//			while (j < n2) {
//				arr[k] = R[j];
//				j++;
//				k++;
	//
//			}
//		}
		
		private void sortColor(int arr[]) {
			
		}
	}

