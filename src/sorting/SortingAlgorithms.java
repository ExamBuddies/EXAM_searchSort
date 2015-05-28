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
		for (int i = 1; i < arr.length-1; i++){ // Det første element i array er undtaget - det ses som det første sorterede element.
			int element = arr[i]; // værdien af det nuværende index
			int j = i;            // j sættes lige den samme værdi som det nuværende index
			while(j > 0 && arr[j-1] > element){  // mens j er større end 0, og værdien af arr[j-1] er er større end den vi prøver at sortere 
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
