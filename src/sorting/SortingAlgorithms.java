package sorting;

public class SortingAlgorithms {
	
	// Selection Sort http://www.java2novice.com/java-sorting-algorithms/selection-sort/
	// indtil videre bare med ints.
	public static int[] selectionSort(int[] arr){
        
		for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
	
	// Insertion sort
	
	// Bubble sort
	
	// Merge sort
	
	// Quick sort
	
	
}
