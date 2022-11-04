import java.util.Arrays;
import java.util.Scanner;

public class QuickSrt {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the size of array to be sorted:");
		int size = scanner.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Please enter array element:");
			ar[i]= scanner.nextInt();
		}
		System.out.println("Given array:");
		System.out.println(Arrays.toString(ar));

		quickSort(ar,0, ar.length-1);

		System.out.println("Given array after performing Quick sort:");
		System.out.println(Arrays.toString(ar));

	}
	public static void quickSort(int[] a, int low, int high) {
		if(low<high) {
			int partitionIndex = partition(a,low,high);
			quickSort(a, low, partitionIndex-1);
			quickSort(a, partitionIndex+1, high);
		}
	}
	static int partition(int array[], int low, int high) {
	    
	    // choose the rightmost element as pivot
	    int pivot = array[high];
	    
	    // pointer for greater element
	    int i = (low - 1);

	    // traverse through all elements
	    // compare each element with pivot
	    for (int j = low; j < high; j++) {
	      if (array[j] <= pivot) {

	        // if element smaller than pivot is found
	        // swap it with the greater element pointed by i
	        i++;

	        // swapping element at i with element at j
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	      }

	    }

	    // swapt the pivot element with the greater element specified by i
	    int temp = array[i + 1];
	    array[i + 1] = array[high];
	    array[high] = temp;

	    // return the position from where partition is done
	    return (i + 1);
	  }

}
