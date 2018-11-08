import java.util.Scanner;
public class ArraySorted{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter list: ");
        int size= input.nextInt();
        int[] arr= new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]= input.nextInt();
        }
        //checking if array is sorted
        int notSorted=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]> arr[i+1]){
                notSorted++;
            }
        }
        if(notSorted>0){
            System.out.println("This list is not sorted");
        }
        else{
            System.out.println("This list is already sorted");
        }
    }
}