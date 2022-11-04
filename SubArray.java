import java.util.Scanner;
// check if a given sub array is a subset of given main array
public class SubArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the main array size:");
		int len1 = scanner.nextInt();
		int[] ar1 = new int[len1];
		for (int i = 0; i < ar1.length; i++) {
			System.out.println("Enter  main array elemet:");
			ar1[i] = scanner.nextInt();
		}
		System.out.println("Please enter the sub array size:");
		int len2 = scanner.nextInt();
		int[] ar2 = new int[len2];
		for (int i = 0; i < ar2.length; i++) {
			System.out.println("Enter  sub array elemet:");
			ar2[i] = scanner.nextInt();
		}
		System.out.println("Main array:");
		for (int i : ar1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("sub array:");
		for (int i : ar2) {
			System.out.print(i + " ");
		}
		System.out.println();
		// compare the sub with main array
		boolean isNotSub = true;
		for (int i = 0; i < ar2.length; i++) {
			boolean elementFound = false;
			for (int j = 0; j < ar1.length; j++) {
				if (ar2[i] == ar1[j]) {
					elementFound = true;
					continue;
				}
			}
			if (!elementFound) {
				isNotSub = false;
				break;
			}
		}
		if (isNotSub) {
			System.out.println("sub array is a subset of main array");

		} else {
			System.out.println("sub array is not a subset of main array");
		}

	}

}
