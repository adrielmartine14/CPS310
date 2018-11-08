import java.util.Scanner;
public class AverageDisplay{
    public static void main(String[] args){
        int average;
        average= NumberEnter();
        Display(average);
    }
    public static int NumberEnter(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter in the amount of integers:");
        int num= input.nextInt();
        int sum=0;
        for(int i=1; i<num+1;i++){
            sum=sum+input.nextInt();
        }
        return (sum/num);
    }
    public static void Display(int x){
        String s;
        switch(x){
            case 0: s = "0"; break;
            case 1: s = "1"; break;
            default: s = "not 0 or 1"; break;
        }
        System.out.print("The average is "+s);
    }
}