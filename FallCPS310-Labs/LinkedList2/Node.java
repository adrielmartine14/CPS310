import java.util.*;
public class Node
{
    private int data;
    private Node link;
    /**
     * Constructor for objects of class Node2
     */
    public Node()
    {
        link=null;
    }

    public Node(int mdata, Node mlink){
        data= mdata;
        link= mlink;
    }
    
    public void setData(int mdata){
        data= mdata;
    }
    
    public int getData(){
        return data;
    }
    
    public void setLink(Node mlink){
        link= mlink;
    }
    
    public Node getLink(){
        return link;
    }
}