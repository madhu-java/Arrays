import java.util.Scanner;

public class BubbleSort {

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
		for(int i: ar) {
			System.out.print(i+" ");
		}
		//bubblesort
		
	    for(int i=0;i<ar.length;i++) {
	    	for(int j=0;j<ar.length-1;j++) {
	    		if(ar[j]>ar[j+1]) {
	    			int temp =ar[j];
	    			ar[j]=ar[j+1];
	    			ar[j+1]=temp;
	    			
	    		}
	    	}
	    }
	    System.out.println();
	    System.out.println("Given array after performing Bubble sort:");
		for(int i: ar) {
			System.out.print(i+" ");
		}

	}

}
