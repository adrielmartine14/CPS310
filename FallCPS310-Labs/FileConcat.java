import java.io.*;
import java.util.Scanner;
public class FileConcat{
	public static void main(String[] args) throws Exception{
		Scanner kb= new Scannner(System.in);

		String file1= null;
		String file2= null;
		String output= null;

		String file3= file1+"-"+file2;
		Scanner input1= new Scanner(file1);
		Scanner input2= new Scanner(file2);

		File file3= new File(File3);
		PrintWriter output = new PrintWriter(file3);
		while(input1.hasNextLine()){
   			output.println(input1.nextLine());
   			output.println(input2.nextLine());
		}
		output.close();
		output.close();

	}
}
