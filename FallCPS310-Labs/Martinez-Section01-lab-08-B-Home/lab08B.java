import java.util.Scanner;
import java.io.*;
public class lab08B{
    public static void main(String[] args) {
        //Created arrays for both boys and girls names
        String[][] boyNames= new String[7][1000];
        String[][] girlNames= new String[7][1000];
        //Created file object
        File file;
        try{
         //Files taken in and names put its them in the appropriate array
         for (int i=0;i<6;i++) {
            //Scanner takes in text file(s)
            Scanner kb= new Scanner(new File("Babynamesranking201"+i+".txt"));
            //In the loop, for each iteration of j, it will fill both arrays with the appropriate name from the scanner
            int j=0;
            while (kb.hasNext()) {
                kb.nextInt();
                boyNames[i][j]= kb.next();
                girlNames[i][j]= kb.next();
                j++;
            }
         }
        }
        catch(Exception e){
            //Directs you to where error occured
            e.printStackTrace();
        }
        Scanner input= new Scanner(System.in);
        //User inputs year 
        System.out.print("Enter the year: ");
        int year= input.nextInt();
        //User enters gender
        System.out.print("Enter the gender (M for boys & F for girls): ");
        char gender= input.next().charAt(0);
        //User enters name, whether male or female
        System.out.print("Enter the name: ");
        String name= input.next();
        //Takes first character of name 
        char first= name.charAt(0);
        /** 
         *  If gender is male:
         *  SearchName method will use boyNames array along with the user input's year and name
         *  If returns a number greater than or equal to 1, it displays boy's names with appropriate ranking and year
         */
        if (gender=='M') {
            //Displays boy's names with appropriate ranking and year
            System.out.println("Boy name "+name+" is ranked #"+SearchName(boyNames,year,name)+" in year "+year);
            System.out.println("-------------------------------------------");
            NamePrint(boyNames,year);
            System.out.println("-------------------------------------------");
            SameFirstLetter(boyNames,year,name,first);
        }
        /** 
         *  If gender is female:
         *  SearchName method will use girlsNames array along with the user input's year and name
         *  If returns a number greater than or equal to 1, it displays girl's names with appropriate ranking and year
         */
        if(gender=='F'){
            System.out.println("Girl name "+name+" is ranked #"+SearchName(girlNames,year,name)+" in year "+year);
            System.out.println("-------------------------------------------");
            NamePrint(girlNames,year);
            System.out.println("-------------------------------------------");
            SameFirstLetter(girlNames,year,name,first);
        }
    }
    /**
     * This method will return the index value if the name exists within the string array, if not it will return -1
     */
    public static int SearchName(String[][] names,int year, String name){
        for(int i=0; i<1000; i++){
            if(names[year-2010][i].equals(name)){
                return i+1;
            }
        }
        System.out.println("Name doesn't exists");
        return -1;
    }
    /**
     * This method will print out the top 10 names based on what year the user inputted
     */
    public static void NamePrint(String[][] names,int year){
        System.out.println("Top 10 names for this year ("+year+"):");
        for(int i=0; i<10; i++){
            System.out.println((i+1)+") "+names[year-2010][i]);
        }
    }
    /**
     * This method will print out 10 names that share the same first letter as the inputted name
     */
    public static void SameFirstLetter(String[][] names,int year, String name, char first){
        System.out.println("10 Names that share the same first letter:");
        int counter=0;
        int j=1;
        for(int i=0; i<1000;i++){
            if(names[year-2010][i].charAt(0)==first){
                System.out.println((j)+") "+names[year-2010][i]);
                counter++;
                j++;
            }
            if(counter>=10){
                break;
            }
        }
    }
}