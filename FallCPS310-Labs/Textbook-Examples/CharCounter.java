import java.util.Scanner;
public class CharCounter{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a string:");
		String s= input.nextLine();
		System.out.print(" Enter a character:");
		char a= input.next().charAt(0);
		System.out.println(" "+a+" occurs "+ count(s,a)+" times in the string");
	}
	public static int count(String str, char a){
		int count=0;
		for(int i=0; i<str.length();i++){
			if(str.charAt(i) == a){
				count++;
			}
		}		
		return count;
	}
}
	