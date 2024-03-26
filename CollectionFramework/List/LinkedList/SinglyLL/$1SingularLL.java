package CollectionFramework.List.LinkedList.SinglyLL;

public class $1SingularLL {
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

    public void insertAtFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

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

    public void insertAtIndex(int index, String data) {
        int currIndex = 0;
        if (head == null) {
            System.out.println("List is empty");
        }

        if (index > getSize()) {
            System.out.println("Index out of bound");
            return;
        }

        Node currNode = head;
        Node prevNode = null;

        while (currNode != null && currIndex != index) {
            prevNode = currNode;
            currNode = currNode.next;
            currIndex++;

        }

        if (index == 0) {
            insertAtFirst(data);
            return;
        }

        if (index == currIndex) {
            Node dataNode = new Node(data);
            prevNode.next = dataNode;
            dataNode.next = currNode;
            return;
        }

    }

    public void deleteEle(String data) {

        if (head == null) {
            System.out.println("String is empty");
            return;
        }
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return;
        }

        Node currNode = head;
        Node prevNode = null;

        while (currNode != null && !currNode.data.equals(data)) {
            prevNode = currNode;
            currNode = currNode.next;

        }

        if (currNode != null) {
            prevNode.next = currNode.next;
            currNode = null;
            size--;
            return;
        }

        System.out.println("Data not found");
    }

    public void deleteAtIndex(int index) {

        int currIndex = 0;
        Node currNode = head;
        Node prevNode = null;
        if (head == null) {
            System.out.println("String is empty");
            return;
        }

        if (index > getSize()) {
            System.out.println("Index out of bound");
        }

        if (index == 0) {
            head = currNode.next;
            currNode = null;
            return;
        }
        while (currNode != null && index != currIndex) {
            prevNode = currNode;
            currNode = currNode.next;
            currIndex++;
        }

        if (currIndex == index) {
            prevNode.next = currNode.next;
            currNode = null;
            return;
        }

    }

    public void deleteList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = null;
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

        $1SingularLL lst = new $1SingularLL();
        // Insertion and deletetion of elements
        lst.insertAtFirst("B");
        lst.insertAtFirst("A");
        lst.insertAtLast("C");
        // lst.deleteEle("C");
        System.out.println("Size of list is " + lst.getSize());
        lst.printLL();

        //
        lst.printLL();
        // lst.deleteAtIndex(0);
        lst.printLL();
        lst.insertAtIndex(5, "D");

        // Delete the complete list
        // lst.deleteList();
        lst.printLL();

    }

}
