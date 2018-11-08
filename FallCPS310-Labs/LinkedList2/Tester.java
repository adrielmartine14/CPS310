public class Tester
{
    public static void main(String[] agrs){
        int N=4;
        Node entry;
        
        Node node1= new Node(5,null);
        
        Node node2= new Node(7,null);
        
        node1.setLink(node2);
        
        Node node3= new Node(3,null);
        
        node2.setLink(node3);
        
        Node node4= new Node(8,null);
        
        node3.setLink(node4);
        
        entry=node1;
        
        System.out.println(entry.getData());
        System.out.println(entry.getLink().getData());
        System.out.println(entry.getLink().getLink().getData());
        System.out.println(entry.getLink().getLink().getLink().getData());
    }
}