import java.util.Scanner;
public class SelectionSort{
	public static void main(String[] args) {
		for (int i=0; i<5;i++) {
			int size= 1+(int)(Math.random()*20);
			int[] arr= new int[size];
			for (int j=0; j<arr.length; j++) {
				arr[j]= 1+(int)(Math.random()*100);
			}
			System.out.print("Original array-->");printArray(arr);
			selectionSort(arr);
			System.out.print("Sorted array-->");printArray(arr);
			System.out.println("Index--> "+binarySearch(arr));
			System.out.println();
		}
	}
	public static void selectionSort(int[] x){
		for (int i=0; i<x.length; i++) {
			int minIndex= i;
			int min= x[i];
			for (int j=i; j<x.length; j++) {
				if (x[j] < min) {
						min= x[j];
						minIndex=j;
					}
				}
				x[minIndex]=x[i];
				x[i]=min;
			}
		}
	public static void printArray(int[] x){
		for (int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	public static int binarySearch(int[] x){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter in a key: ");
		int key= input.nextInt();
		int n=x.length;
   		int low = 0;
		int high = x.length - 1;
		while (high >= low) {
 			int mid = (low + high) / 2;
 			if (key < x[mid])
				high = mid - 1;
 			else if (key == x[mid])
				return mid;
 			else
				low = mid + 1;
			}
			System.out.print("Not found: ");
			return -1; // Not found
			
 	}
}