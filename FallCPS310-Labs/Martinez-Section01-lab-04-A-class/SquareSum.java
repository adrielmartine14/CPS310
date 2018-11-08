import java.util.Scanner;
public class SquareSum{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter in a integer value: ");
        int n= input.nextInt();
        System.out.println(SquareSum(n));
    }
    public static int SquareSum(int x){
        if(x==1){
            return 1;
        }
        else{
            return (x*x+SquareSum(x-1));
        }
    }
}