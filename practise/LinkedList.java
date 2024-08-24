package practise;

class Node{
    int data;
    Node next;
}

public class LinkedList {

    Node head;

    public void insertData(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next =  node;
        }
    }

    public void insertAtFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next =  null;
        if(head == null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
    }

    public void insertAtAny(int index , int data){
        Node node = new Node();
        node.data = data;
        node.next =  null;
        if(index == 0){
            insertAtFirst(data);
        }
        if(head == null ){
            head = node;
        }else {
            Node n = head;
            for(int i=0;i<index-1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }else{
            Node n = head;
            Node n1 = null;
            for(int i=0;i<index-1;i++){
                n = n.next;
            }
            n1 = n.next;
            n.next= n1.next;
            n1 = null;
        }

    }
    public void print(){
        Node n = head;
        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }


}
