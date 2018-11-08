import java.util.Scanner;
public class DecimalToHex{
    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);
        while (String.valueOf(num).length() > 0) {
            System.out.print("Enter an integer to be converted to hex or hit enter to end program:");
            num = input.nextInt();
            System.out.println("The hex equivalent of " + num + " is " + dec2Hex(num));
        }
    }
    public static String dec2Hex(int value){
        char[] x = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (value <= 0) {
            return "";
        }
        return dec2Hex(value/16) + x[value%16];
    }
}