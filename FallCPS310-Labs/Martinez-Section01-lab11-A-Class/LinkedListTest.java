import java.util.Random;
import java.util.Scanner;
import java.io.*;
/**
 *  LINKED LIST  : Create a List Randomly and Automatically
 *                 Put PRINT/SUM/MAX in separate methods
 */
public class LinkedListTest
{
    // let the user enter N (the number of nodes)
    // generate a linked list of N nodes where data are random integers 
    public static Node ListGenerator()
    {
        // Generate RANDOM List
        int j,size;
        
        
        
        Scanner input= new Scanner(System.in);
        System.out.print("Enter size of the list: ");
        size= input.nextInt();
        System.out.println("Random List of "+size+" nodes");
        
        Node ncurrent= null;
        for (j = 0; j <size; j++)
        {   
            Node nNode = new Node((int)(Math.random()*100), ncurrent);
            ncurrent = nNode;
            System.out.println("Inserted: "+ncurrent.getData());
        }
        return ncurrent;
    }
    // print data of all nodes in the list (entry) 
    public static void ListPrint(Node entry)
    {
        //Standard method to PRINT/visit ALL NODES 
        Node ncurrent;
        ncurrent= entry;
        if(entry != null){
            System.out.println("Lists contents: ");
            while(ncurrent != null){
                System.out.print(ncurrent.getData());
                System.out.print("-->");
                ncurrent = ncurrent.getLink();
            }
            System.out.print("null");
            System.out.println();
        }
    }
    // find the largest data of all nodes in the list (entry), return it 
    public static int FindListMAX(Node entry)
    {
        int max=0;
        Node ncurrent;
        ncurrent= entry;
        if(ncurrent.getLink() != null){
            max= entry.getData();
            while(ncurrent.getLink() != null){
                if(ncurrent.getData() > max){
                    max= ncurrent.getData();
                }
                ncurrent= ncurrent.getLink();
                if(ncurrent.getLink() ==null){
                    if(ncurrent.getData() > max){
                        max= ncurrent.getData();
                    }
                }
            }
        }
        else{
            max= entry.getData();
        }
        return max;
    }    

    // find the SUM of all nodes in the list (entry), return it     
    public static int FindListSUM(Node entry)
    {
        int sum=0;
        Node ncurrent;
        ncurrent= entry;
        if(entry.getLink() != null){
            while(ncurrent != null){
                sum+= ncurrent.getData();
                ncurrent= ncurrent.getLink();
            }
        }
        else{
            sum= entry.getData();
        }
        return sum;
    }
    public static void main(String[] args)
    {
        // ...
        Node entry;
        // Generate RANDOM List
        entry=ListGenerator();        
        System.out.println();
        //Standard method to PRINT/visit ALL NODES
        ListPrint(entry);
        System.out.println();
        //Calculate the SUM of ALL NODES
        int sum= FindListSUM(entry);
        System.out.println("SUM = "+ sum);
        System.out.println();
        //find MAX in a LINKED LIST
        int max= FindListMAX(entry);
        System.out.println("MAX = "+ max);       
    }
}