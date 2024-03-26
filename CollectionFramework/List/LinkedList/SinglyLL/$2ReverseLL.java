package CollectionFramework.List.LinkedList.SinglyLL;

public class $2ReverseLL {
    private Node head;
    private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getSize() {
        return size;
    }

    public void insertAtLast(String data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    public void reverseList() {

        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;

    }

    public void printLL() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");

        System.out.println("");

    }

    public static void main(String args[]) {

        $2ReverseLL lst = new $2ReverseLL();
        // List reversal
        lst.insertAtLast("A");
        lst.insertAtLast("B");
        lst.insertAtLast("C");
        lst.insertAtLast("D");
        lst.insertAtLast("E");
        lst.insertAtLast("F");
        lst.insertAtLast("G");
        lst.printLL();
        lst.reverseList();
        lst.printLL();
    }

}
