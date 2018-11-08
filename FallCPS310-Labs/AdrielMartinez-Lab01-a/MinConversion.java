import java.util.Scanner;
public class MinConversion{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int min= input.nextInt();
        int days= min/(60*24);
        int years= days/365;
        int rem= days%365;//rem is remaining days
        System.out.println(min+" minutes is approximately "+years+" years and "+ rem+" days");
    }
}