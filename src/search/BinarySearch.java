public class BinarySearch {

	public static void main(String[] args){

		int arr[] = {1,2,3,4,53,536,900};
		int value = 536;

		System.out.println(search(arr, value));
		System.out.println(search2(arr, value));

	}


	public static int search(int[] arr, int value) {

		int start = 0;
		int end = arr.length;

		while (start <= end) {

			int mid = (start + end) / 2;

			if(value < arr[mid]) { 
				end = mid - 1;
			}

			else if (value > arr[mid]) { 
				start = mid + 1;
			}
			else return mid;
		}
		return -1;
	}

	public static int search2(int[] arr, int value) {

		int start = 0;
		int end = arr.length;
		

		while (start <= end) {
			int mid = (start+end) / 2;

			if (arr[mid] == value) {
				return mid;
			}

			// 0	1	2	3	4	5	   6
			// 1	2	3	4	53	536   900
			
			
			else if (value < arr[mid]) {
				end = mid - 1;
			}
			else { 		// (value > arr[mid]
				start = mid + 1;
			}

		}
		return -1;


	}

}

