package search;

public class SequentialSearch {

	public static void main(String[] args){

		int[] arr = {1, 27, 0, -6, 123};
		int value = 0;

		System.out.println(sequentialSearch(arr, value));
	}

	public static int sequentialSearch(int[] arr, int value) {

		for (int i = 0; i < arr.length; i++) {

			if(arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

} 
