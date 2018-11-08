/**
 *  Node class:  Build NODE class which has two data fields: 
 *               (1) node value called "data" (int) and (2) "link" to next node
 *               a constructor Node(int ndata, Node nlink)
 *               and 4 methods to get/read and update/write the above two data fields
 */
public class Node
{
    private int data;
    private Node link;
    /**
     * Constructor for objects of class Node
     */
    public Node(int ndata, Node nlink)
    {
        // initialise instance variables
        data= ndata;
        link= nlink;
    }
   
    public int getData(){
        return data;
    }
    
    public Node getLink(){
        return link;
    }
      
    public void setData(int mydata){
        data= mydata;
    }
    
    public void setLink(Node mylink){
        link= mylink;
    }
}