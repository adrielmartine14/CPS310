import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class lab08 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        File file;
        char[] x={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] letterIndex= new int[26]; 

        System.out.print("Enter file name: ");
        String fileLocation= input.next();
        try(Scanner sc= new Scanner(new File(fileLocation))){
            /*file= new File(fileLocation);
            input= new Scanner(file);*/
            do{
                String text= sc.nextLine();
                for (int i=0; i<x.length; i++) {
                    for(int j=0; j<text.length(); j++){
                        if (Character.toUpperCase(text.charAt(j))==x[i]) {
                            letterIndex[i]= letterIndex[i]+1;
                        }
                    }
                }
            }while(sc.hasNextLine());
        }
        catch(FileNotFoundException e){
            System.out.print(e);
            System.exit(-1);
        }
        for(int k=0; k<letterIndex.length; k++){
            System.out.println("The occurrence of "+ x[k]+"'s is "+ letterIndex[k]);
        }
    }
}