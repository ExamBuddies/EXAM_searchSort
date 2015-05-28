package sorting;

import java.util.Arrays;
import java.util.Collections;

public class SortingDemo {
	public static void main(String[] args){
		int[] shortArr = {6,2,0,-1,20,1,7,3,4,19,6,5,-2,8,7,11};
		int[] longArr = new int[2000];
		for(int i = 0; i < 2000; i++){
			longArr[i] = (int) (Math.random() * 100);
		}
		System.out.println("Array before sorting: " + Arrays.toString(shortArr));		
		
		// Selection sort
//		long millisBefore = System.currentTimeMillis(); // time before sort
//		longArr = SortingAlgorithms.selectionSort(longArr);
//		long sortTime = System.currentTimeMillis() - millisBefore; // Finder tid det tog at sortere ved at trække nuværende time fra før sortering.
//		
//		int[] selectionSortArr = SortingAlgorithms.selectionSort(shortArr);
//		System.out.println("Array after selection sort: " + Arrays.toString(selectionSortArr) + ".\nSorting 2000 elements took " + sortTime + " milliseconds.");
		
		
		// Insertion sort
//		long millisBefore = System.currentTimeMillis(); // time before sort
//		longArr = SortingAlgorithms.insertionSort(longArr);
//		long sortTime = System.currentTimeMillis() - millisBefore; // Finder tid det tog at sortere ved at trække nuværende time fra før sortering.
//		
//		int[] insertionSortArr = SortingAlgorithms.insertionSort(shortArr);
//		System.out.println("Array after insertion sort: " + Arrays.toString(insertionSortArr) + ".\nSorting 2000 elements took " + sortTime + " milliseconds.");
		
		// Bubble sort
		long millisBefore = System.currentTimeMillis(); // time before sort
		longArr = SortingAlgorithms.bubbleSort(longArr);
		long sortTime = System.currentTimeMillis() - millisBefore; // Finder tid det tog at sortere ved at trække nuværende time fra før sortering.
		
		int[] bubbleSortArr = SortingAlgorithms.bubbleSort(shortArr);
		System.out.println("Array after insertion sort: " + Arrays.toString(bubbleSortArr) + ".\nSorting 2000 elements took " + sortTime + " milliseconds.");

	}
	
	
	
	
}
