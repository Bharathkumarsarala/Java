package Learning;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 8, 9, 15, 19, 23, 27 };
		int value = 23;
		int low = 0;
		int high = 8;
		boolean isElementFound = false;
		while (low <= high) {
			int mid = (low + high) / 2; // mid value=9, index 4
			    System.out.println(mid);

			if (arr[mid] == value) {
				System.out.println("element is present" + mid);
				isElementFound = true;
				break;
			} else if (arr[mid] < value) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}
		if (!isElementFound) {
			System.out.println("ELEMENT NOT EXIST");
		}
	}
}