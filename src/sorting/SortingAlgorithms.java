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
	
	// Merge sort
	
	// Quick sort
	
	
}
