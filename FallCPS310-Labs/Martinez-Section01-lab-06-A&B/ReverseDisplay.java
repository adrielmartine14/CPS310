import java.util.Scanner;
public class ReverseDisplay{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter an integer to be reversed or hit enter to end program:");
        int n= input.nextInt();
        System.out.print("The reverse of "+n+" is ");
        reverseDisplay(n);
    }
    public static void reverseDisplay(int x){
        if (x<10){
            System.out.print(x);
        }
        else{
            System.out.print(x%10);
            reverseDisplay(x/10);
        }
    }
}