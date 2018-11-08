import java.util.Scanner;
public class AssignGrades{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int s= input.nextInt();
		System.out.print("Enter "+s+" scores: ");
		int[] array= new int[s];
		for (int i=0;i<s;i++) {
			array[i]= input.nextInt();
		}
		//checking for the best score
		int best= array[0]; 
		for (int a=1;a<s;a++) {
			if (array[a]>best) {
				best= array[a];
			}
		}
		//System.out.print(best);
		for (int b=0;b<s;b++) {
			if (array[b]>=best-10) {
				System.out.println("Student "+b+" score is "+array[b]+" and grade is A");
			}
			else if (array[b]>=best-20) {
				System.out.println("Student "+b+" score is "+array[b]+" and grade is B");
			}
			else if (array[b]>=best-30) {
				System.out.println("Student "+b+" score is "+array[b]+" and grade is C");
			}
			else if (array[b]>=best-40) {
				System.out.println("Student "+b+" score is "+array[b]+" and grade is D");
			}
			else {
				System.out.println("Student "+b+" score is "+array[b]+" and grade is F");
			}
		}
	}
}