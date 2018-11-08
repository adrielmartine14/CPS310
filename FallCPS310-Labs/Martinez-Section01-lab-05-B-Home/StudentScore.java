import java.util.Scanner;
public class StudentScore{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size= input.nextInt();
        int[] scores= new int[size];
        String[] names= new String[size];
        for (int i=0; i<size; i++) {
            System.out.print("Enter a student name: ");
            names[i]= input.next();
            System.out.print("Enter a student score: ");
            scores[i]= input.nextInt();
        }
        
      
        //checking scores 
        for (int i=0; i<size; i++) {
            for (int j=i; j<size; j++) {
                int maxIndex= j;
                int max= scores[j];
                //checking for max
                for (int k=j+1; k<size; k++) {
                    if (scores[k] > max) {
                        max= scores[k];
                        maxIndex= k;
                    }
                }
                if (max != j) {
                      //swap scores
                    int temp= scores[j];
                    scores[j]= scores[maxIndex];
                    scores[maxIndex]= temp;
                    // swap string
                    String temps= names[j];
                    names[j]= names[maxIndex];
                    names[maxIndex]= temps;
                }
            }
            System.out.printf("%-6s  %4d\n",names[i],scores[i]);
        }        
    }
}