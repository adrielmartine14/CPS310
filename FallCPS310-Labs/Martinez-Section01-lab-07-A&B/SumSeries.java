import java.util.Scanner;
public class SumSeries{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the last positive integer you want m(i) to be calculated for:");
        int n= input.nextInt();
        int i=1;
        do{
            System.out.print("m("+i+") = ");
            System.out.printf("%.2f",series(i));
            System.out.println();
            i++;
        }while(i<=n);
    }
    public static double series(int x){
        if(x==0){
            return 0;
        }
        else
            return (1.0/x+series(x-1));
    }
}