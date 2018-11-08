import java.util.Scanner;
public class ReverseDisplay2{
    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        do{ 
            System.out.print("Enter an integer to be reversed or hit enter to end program:");
            n= input.nextInt();
            System.out.print("The reverse of "+n+" is ");
            reverseDisplay(n);
            System.out.println();
        }while(input.hasNextLine());
        System.out.println("Enter an integer to be reversed or hit enter to end program:");
    }
    public static void reverseDisplay(int x){
        if(x/10 == 0){
            System.out.print(x);
        }
        else{
            System.out.print(x%10);
            reverseDisplay(x/10);
        }
    }
}