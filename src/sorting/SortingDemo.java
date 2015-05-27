package sorting;

import java.util.Arrays;

public class SortingDemo {
	public static void main(String[] args){
		int[] arr = {6,2,0,-1,20,1,7,3,4,19,6,5,-2,8,7,11,9,-3,12,17,15,16,13};
		System.out.println("Array before sorting: " + Arrays.toString(arr));
		
		
		// Selection sort
		long millisBefore = System.currentTimeMillis(); // time before sort
		int[] selectionSortArr = SortingAlgorithms.selectionSort(arr);
		long sortTime = System.currentTimeMillis() - millisBefore; // Finder tid det tog at sortere ved at trække nuværende time fra før sortering.
		System.out.println("Array after selection sort: " + Arrays.toString(selectionSortArr) + ". It took " + sortTime + " milliseconds.");
		
		
	}
	
	
	
	
}
