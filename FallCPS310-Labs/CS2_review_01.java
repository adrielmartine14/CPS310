import java.util.Scanner;
public class CS2_review_01{
    public static void main(String[] args) {
        int x= standardI();
        standardO(x);
        If(x);
        IfElse(x);
        nestedIfElse(x);
        Switch(x);
        whileLoop(x);
        doLoop(x);
        forLoop(x);
    }
    public static int standardI(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n= input.nextInt();
        return n;
    }
    public static void standardO(int x){
        System.out.println("The standardO method output is "+x);
    }
    public static void If(int x){
        if (x>15) {
            System.out.println(x+" is greater than 15");
        }
    }
    public static void IfElse(int x){
        if (x%2==0) {
            System.out.println(x+"is a even number");
        }
        else {
            System.out.println(x+" is a odd number");
        }
    }
    public static void nestedIfElse(int x){
        if (x%2==1) {
            System.out.println("The square root of x is "+Math.sqrt(x));
            if (x>10) {
                System.out.println(x+" to the second power is "+Math.pow(x,2));
            }
            else {
                System.out.println(x+" to the third power is "+Math.pow(x,3));
            }
        }
        else{
            System.out.println(x+" to the second power is "+Math.pow(x,2));
        }

    }
    public static void Switch(int x){
        switch(x){
            case 1: System.out.println(x+" is a perfect sqaure");
            break;
            case 4: System.out.println(x+" is a perfect sqaure");
            break;
            case 9: System.out.println(x+" is a perfect sqaure");
            break;
            case 16: System.out.println(x+" is a perfect sqaure");
            break;
            default: System.out.println(x+" is not a perfect square");
        }
    }
    public static void whileLoop(int x){
        while(x>16){
            if (x%2==0) {
                System.out.println("The log of "+x+" is "+Math.log(x));
            }
            else {
                System.out.println("The log of "+x+" is "+Math.log(x));
            }
            x--;
        }
    }
    public static void doLoop(int x){
        int total=0;
        do{
            total+=x;
            x++;
        }while(x<22);
        System.out.println("The total of the doLoop method is "+total);
    }
    public static void forLoop(int x){
        int total=0;
        for(int i=0; i<x; i++){
            total+=i*x;
        }
        System.out.println("The total of the forLoop method is "+total);
    }
    }