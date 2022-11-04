import java.util.Scanner;

//selection sort
public class SelectionSrt {

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
		//selection sort
		for(int i=0;i<ar.length;i++) {
			int smallValueIndex =i;
			for (int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[smallValueIndex]) {
					smallValueIndex =j;
				}
			}
		
			int temp = ar[smallValueIndex];
			ar[smallValueIndex]=ar[i];
			ar[i]=temp;
		}
		System.out.println();
		System.out.println(" Given Array after performing Selection sort:");
		for(int i: ar) {
			System.out.print(i+" ");
		}

	}

}
