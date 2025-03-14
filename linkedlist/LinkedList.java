package java.linkedlist;

public class LinkedList {
    int data;
    LinkedList next;

    public LinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    LinkedList head=null;

    LinkedList tail=null;

    public void insert(int data) {
        LinkedList newNode = new LinkedList(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // LinkedList temp = head;
            // while (temp.next != null) {
            //     temp = temp.next;
            // }
            // temp.next = newNode;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void Traverse(){
        LinkedList temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }
}

class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.Traverse();
    }
}
