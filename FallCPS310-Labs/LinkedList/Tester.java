public class Tester{
    public static void main(String[] args){
        Node node= new Node(8);
        LinkedList list= new LinkedList();
        list.addFront(14);
        list.addFront(4);
        list.addFront(8);
        list.addFront(10);
        list.addEnd(22);
        list.addEnd(35);
        list.addEnd(21);
        list.delete(10);
        list.printList();
        list.reverse(list);
        System.out.println(); 
        list.printList();
    }
}