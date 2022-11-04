import java.util.Arrays;
import java.util.Scanner;

//Find duplicates elements in the array
public class DuplicateElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size od the array:");
		int size = scanner.nextInt();
		int[] ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			System.out.println("plese enter a array element:");
			ar[i] = scanner.nextInt();
		}
		System.out.println("Given array:");
		for (int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println();

		Arrays.parallelSort(ar);
		boolean duplicatesFound = false;
		for (int i = 0; i < ar.length - 1; i++) {
			int count = 1;

			while (ar[i] == ar[i + 1]) {
				count++;

				i += 1;
				if (i >= ar.length - 1)
					break;

			}
			if (count > 1) {
				duplicatesFound = true;
				System.out.println(ar[i] + " presented " + count + " times in the given array");
			}
		}
		if (!duplicatesFound) {
			System.out.println("No duplicates found in the the given array");
		}
	}

}
