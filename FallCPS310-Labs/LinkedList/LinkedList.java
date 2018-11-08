public class LinkedList{
    static Node head= null;
    public void addFront(int data){
        Node newNode= new Node(data);
        newNode.next= head;
        head=newNode;
    }
    public void printList(){
        Node temp= head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
    }
    public void addEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            Node temp= head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=newNode   ;
        }
    }
    public void delete(int key){
        Node temp= head;
        Node prev= null;
        if(temp != null && temp.data == key){
            head= temp.next;
            return;
        }
        while(temp != null && temp.data != key){
            prev= temp;
            temp=temp.next;
        }
        if(temp == null){
            return;
        }
        prev.next= temp.next;
    }
    public LinkedList reverse(LinkedList list){
        Node prev= null;
        Node current= list.head;
        while(current != null){
            Node next= current.next;
            current.next= prev;
            prev= current;
            current= next;
        }
        list.head= prev;
        return list;
    }
}