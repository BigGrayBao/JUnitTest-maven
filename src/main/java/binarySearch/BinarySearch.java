package binarySearch;

public class BinarySearch {
	
	private BinarySearch() {
		
	}
	
	public static int binarySearch(float[] arr, float find) {
        int min = 0, max = arr.length, mid;

        while (min <= max) {
            mid = (max + min) / 2;
            if (find == arr[mid]) {
                return mid;
            } else if (find < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
}