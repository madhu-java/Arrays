import java.util.Scanner;

public class Mergesrt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array to be sorted:");
		int size = scanner.nextInt();
		int[] ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Please enter array element:");
			ar[i] = scanner.nextInt();
		}
		System.out.println("Given array:");
		printArray(ar);

		mergesort(ar, ar.length);

		System.out.println("Given array after performing Mrge sort:");
		printArray(ar);
	}

	public static void printArray(int a[]) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// mergesort
	public static void mergesort(int[] a, int n) {
		if (n < 2) {
			return;
		}

		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];
		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		mergesort(l, mid);
		mergesort(r, n - mid);
		merge(a, l, r, mid, n - mid);

	}

	public static void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] < r[j]) {
				a[k] = l[i];
				i++;
			} else {
				a[k] = r[j];
				j++;
			}
			k++;
		}
		// copying the left over elements to merged array
		while (i < left) {
			a[k] = l[i];
			i++;
			k++;
		}
		while (j < right) {
			a[k] = r[j];
			j++;
			k++;
		}
	}
}
