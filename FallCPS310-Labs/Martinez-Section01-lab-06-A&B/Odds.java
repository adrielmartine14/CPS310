import java.util.Scanner;
public class Odds{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter in size: ");
        int n= input.nextInt();
        System.out.print("Enter in an array: ");
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]= input.nextInt();
        }
        System.out.print(productOfOdds(a,n));
    }
    public static int productOfOdds(int[] x, int n){
        if(x.length==1){
            if (x[n-1]%2==1) {
            return x[0];
            }
           else
            return 1;
        }
        if(n==0){
            return 1;
        }
        else if(x[n-1]%2==1){
            return x[n-1]*productOfOdds(x,n-1);
        }
        else{
            return productOfOdds(x,n-1);
        }
    }   
}