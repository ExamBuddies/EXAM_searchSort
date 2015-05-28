package sorting;

public class SortingAlgorithms {

	// Selection Sort http://www.java2novice.com/java-sorting-algorithms/selection-sort/
	// indtil videre bare med ints.
	// Udvid evt med rekusriv algoritme
	public static int[] selectionSort(int[] arr){

		for (int i = 0; i < arr.length - 1; i++) // outer loop, through all elements
		{
			int index = i; // set index to current position in outer loop
			for (int j = i + 1; j < arr.length; j++) // inner loop through all elements larger than i
				if (arr[j] < arr[index])
				{
					index = j;  // set index to index of lowest value
				}
			int smallerNumber = arr[index];  // smallest value in array
			arr[index] = arr[i];    // swap the current  
			arr[i] = smallerNumber; // and the lowest value
		}
		return arr;
	}

	// Insertion sort
	// https://www.youtube.com/watch?v=DFG-XuyPYUQ <- han er rimelig retard, men brugbar alligevel.
	public static int[] insertionSort(int[] arr){
		for (int i = 1; i < arr.length-1; i++){ // Det f�rste element i array er undtaget - det ses som det f�rste sorterede element.
			int element = arr[i]; // v�rdien af det nuv�rende index
			int j = i;            // j s�ttes lige den samme v�rdi som det nuv�rende index
			while(j > 0 && arr[j-1] > element){  // mens j er st�rre end 0, og v�rdien af arr[j-1] er er st�rre end den vi pr�ver at sortere 
				arr[j] = arr[j-1]; 
				j--;
			}
			arr[j] = element;
		}
		return arr;
	}

	// Bubble sort
	public static int[] bubbleSort(int[] arr){
		int changes = 1; // Det er mit hjemmehack, det her med changes. S�ttes til et s� den k�rer f�rste gang
		while (changes > 0){ // mens der er sket mere end en �ndring sidste gang
			changes = 0; // nulstil �ndringer for hvert l�b igennem
			for (int i = 0; i < arr.length -1; i++){ // for alle elementer i listen, undtagen det sidste
				int element = arr[i]; 
				if(element > arr[i+1]){ // hvis arr[i+1] er st�rre end arr[i], skal de byttes.
					arr[i] = arr[i+1];
					arr[i+1] = element;
					changes++;
				}
			}
		}
		return arr;
	}

	// Merge sort

	// Quick sort

	// EXTRA: Fancy rekursiv selection sort. Fungerer p� generic lists.
	public static <T extends Comparable<? super T>> void recursiveSelectionSort(T[]  list, int j){
		Integer minIndex = j;
		for(int i = j; i <list.length;i++){
			if(list[i].compareTo(list[minIndex]) < 0){
				minIndex = i;
			}
		} 
		swap(list,minIndex,j);
		if(j < list.length - 1){
			recursiveSelectionSort(list,j+1);
		}
	}
	private static void swap(Object[] list, int a, int b) {
		Object temp = list[a];
		list[a] = list[b];
		list[b] = temp;
	}

}
