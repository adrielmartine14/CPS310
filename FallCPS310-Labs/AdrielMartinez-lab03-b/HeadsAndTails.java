import java.util.Scanner;
public class HeadsAndTails{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		char[][] matrix= new char[3][3];
		System.out.print("Enter an integer representing the state of the coins:");
		int n= input.nextInt();
		String binary= Integer.toBinaryString(n);
		binary= String.format("%09d",Integer.parseInt(binary));
		n=0;
		for(int a=0; a<3;a++) {
			for(int b=0; b<3;b++) {
				char x= binary.charAt(n);
				if(x=='0') {
					matrix[a][b]='H';
				}
				else {
					matrix[a][b]='T';
				}
				n++;
				if(b==2) {
					System.out.print(matrix[a][b]);
				}
				else {
					System.out.print(matrix[a][b]+" ");
				}
			}
			System.out.println("");
		}
	}
}