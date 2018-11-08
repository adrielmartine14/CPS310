import java.util.Scanner;
public class AvgWithLoop{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	    System.out.print("Enter an integer, the input ends if it is 0:");
	    int x= input.nextInt();
	    int positive=0;
	    int negative=0;
	    double total=0;
	    double average=0;
	    int counter=0;
	    while (x !=0) {
	    	total +=x;
	   	if (x>0) {
	   		positive++;
	   	}
	   	else {
	   		negative++;
	   	}
	   	counter++;
	   	x= input.nextInt();
	   }
	   System.out.println("The number of positives is "+ positive);
	   System.out.println("The number of negatives is "+ negative);
	   System.out.println("The total is "+ total);
	   System.out.printf("The average is %.2f%n", total/counter);
	}	
}