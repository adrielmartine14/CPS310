import java.util.Scanner;
public class CS2_review_02{
    public static void main(String[] args) {
        int [] x= InputArrays();
        linearSearch(x);
        count(x);
        sum(x);
        max(x);
        copy(x);
        reverse(x);
    }
    public static int[] InputArrays(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter an array size:");
        int x= input.nextInt();
        int[] a= new int[x];
        System.out.print("Enter array elements:");
        for(int i=0; i<a.length; i++){
            a[i]= input.nextInt();
        }
        return a;
    }
    public static int linearSearch(int[] x){  
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a key to search in this array:");
        int key= input.nextInt();
        for(int i= 0; i<x.length;i++){
            if(key == x[i]){
                System.out.println(key+" is found in this array");
                return i;
            }
        }
        System.out.println(key+" is not found in this array");
        return -1;
    }
    public static int count(int[] x){
        int count=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a value to count in this array:");
        int val= input.nextInt();
        for(int i=0; i<x.length; i++){
            if(val == x[i]){
                count++;
            }
        }
        System.out.println("The count for this number is "+count);
        return count;
    }
    public static void sum(int[] x){
        int sum=0;
        for(int i=0; i<x.length; i++){
            sum+=x[i];
        }
        System.out.println("The sum of this array is "+sum);
    }
    public static void max(int[] x){
        int max= x[0];
        for(int i=1; i<x.length; i++){
            if(max < x[i]){
                max= x[i];
            }
        }
        System.out.println("The largest element in this array is "+ max);
    }
    public static void copy(int[] x){
        int[] b= new int[x.length];
        for(int i=0; i<b.length; i++){
            b[i]=x[i];
        }
        System.out.print("The copy array: ");
        for(int j=0; j<b.length; j++){
            System.out.print(b[j]+" ");
        }
        System.out.println();
    }
    public static void reverse(int[] x){
        System.out.print("The reverse array: ");
        for(int i= x.length-1;i>=0; i--){
            System.out.print(x[i]+" ");
        }
    }
}