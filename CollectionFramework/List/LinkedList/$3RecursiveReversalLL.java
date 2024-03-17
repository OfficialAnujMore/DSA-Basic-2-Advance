package CollectionFramework.List.LinkedList;

public class $3RecursiveReversalLL {
    private Node head;
    private int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getSize() {
        return size;
    }

    public void insertAtLast(int data) {

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

    public Node reverseList(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseList(head.next);
        // System.out.println(head.data);
        // System.out.println(head.next.next);
        head.next.next = head;
        head.next = null;

        return newHead;

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

        $3RecursiveReversalLL lst = new $3RecursiveReversalLL();
        // List reversal
        lst.insertAtLast(1);
        lst.insertAtLast(2);
        lst.insertAtLast(3);
        lst.insertAtLast(4);
        lst.insertAtLast(5);
        lst.insertAtLast(6);
        lst.insertAtLast(7);
        lst.printLL();
        lst.head = lst.reverseList(lst.head);
        lst.printLL();
    }

}
