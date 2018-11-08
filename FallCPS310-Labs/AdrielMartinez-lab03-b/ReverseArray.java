import java.util.Scanner;
public class ReverseArray{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a first array:");
		int[] x= new int[5];
		for (int i=0; i<x.length; i++) {
			x[i]= input.nextInt();
		}
		System.out.println("Enter a second array:");
		int[] y= new int[5];
		for(int j=0; j<y.length; j++){
			y[j]= input.nextInt();
		}
		System.out.println(isReverse(x,y));

       }
	public static boolean isReverse (int[] a, int[] b) {
	int k;
    	for (k = 0; k < a.length && a[k] == b[a.length-1-k]; k++);
    	return (k == a.length);
       }

}