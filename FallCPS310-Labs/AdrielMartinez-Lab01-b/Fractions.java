import java.util.Scanner;
public class Fractions{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a numerator: ");
        int n= input.nextInt();
        System.out.print("Enter a denominator: ");
        int d= input.nextInt();
        //calculations
        int a = n/d;
        int b= n%d;
        if(n%d ==0){
                int s= n/d;
                System.out.println(n+" / "+ d+" is a improper fraction and it can be reduced to "+ s);     
        }
        else if(n>d){
                System.out.println(n+" / "+ d+" is an improper fraction and its mixed fraction is "+ a +" + "+ b+ " / "+ d);
        }
        else {      
                System.out.println(n+" / "+ d+" is a proper fraction");
        }
    }
}