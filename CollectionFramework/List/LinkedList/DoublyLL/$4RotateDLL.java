package CollectionFramework.List.LinkedList.DoublyLL;

public class $4RotateDLL {
    private Node head;
    private int size;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insert(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node currNode = head;
        newNode.next = currNode;
        currNode.prev = newNode;
        head = newNode;
        size++;

    }

    public void printDLL() {
        if (head == null) {
            System.out.println("DLL is empty");
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void result(int k) {
        if (k == 0) {
            return;
        }

        int count = 1;
        Node currNode = head;
        while (count < k && currNode != null) {
            currNode = currNode.next;
            count++;
        }

        if (currNode == null) {
            return;
        }

        Node nthNode = currNode;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = head;
        head.prev = currNode;
        head = nthNode.next;
        head.prev = null;
        nthNode.next = null;

    }

    public static void main(String[] args) {
        $4RotateDLL lst = new $4RotateDLL();
        for (int i = 6; i > 0; i--) {
            lst.insert(i);

        }
        lst.printDLL();
        lst.result(3);
        lst.printDLL();

    }
}
