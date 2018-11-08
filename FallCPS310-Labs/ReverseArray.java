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
        System.out.println(reverse(x));
    }
    public static boolean isReverse (int[] a, int[] b) {
        int k;
        for (k = 0; k < a.length && a[k] == b[a.length-1-k]; k++);
        return (k == a.length);
    }
    public static int[] reverse(int a[]) {
            int temp;
            int n = a.length;
             for (int k = 0; k < a.length / 2; k++) {
               temp = a[k];
               a[k] = a[n - k - 1];
               a[n - k - 1] = temp;
            }
            for(int j=0; j<a.length; j++){
                System.out.print(a[j]+" ");
            }
            return a;
    }
}