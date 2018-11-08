import java.util.Scanner;
public class Decimal_Binary{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int n= input.nextInt();
		String binary= Integer.toBinaryString(n);
		System.out.println("Binary representation of "+n+" is "+String.format("%09d",Integer.parseInt(binary)));
		System.out.println();
	}
}