import java.io.*;
import java.util.Scanner;
public class Greeting{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		File file = new File("greeting");
		PrintWriter output = new PrintWriter(file);
		output.println("Hello, World!");
		output.close();
	}
}