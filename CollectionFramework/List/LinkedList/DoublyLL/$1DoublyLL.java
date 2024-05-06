package CollectionFramework.List.LinkedList.DoublyLL;

public class $1DoublyLL {

    Node head;
    int size = 0;

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

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {

            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void insertAtLast(int data) {
        Node lastNode = head;
        Node newNode = new Node(data);
        if (lastNode == null) {
            head = newNode;
            return;

        }
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        newNode.prev = lastNode;
        lastNode.next = newNode;
        newNode.next = null;
        size++;
    }

    public void insertAtIndex(int data, int index) {
        int currIndex = 1;
        if (index > size) {
            System.out.println("Index out of bound");
            return;
        }

        if (index == 0) {
            insertAtFirst(data);
            return;
        }
        if (index == size) {
            insertAtLast(data);
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            if (currIndex == index) {
                System.out.println("Break" + currIndex);
                break;
            }
            currNode = currNode.next;
            currIndex++;

        }
        Node newNode = new Node(data);
        newNode.next = currNode.next;
        newNode.prev = currNode;
        currNode.next = newNode;
    }

    public void displayDLL() {
        Node newNode = head;

        while (newNode != null) {
            System.out.print(newNode.data + "->");
            newNode = newNode.next;
        }
        System.out.print("NULL");
        System.out.println("");
    }

    public static void main(String[] args) {
        $1DoublyLL lst = new $1DoublyLL();
        lst.insertAtFirst(0);
        lst.insertAtFirst(1);
        lst.insertAtFirst(2);
        lst.insertAtFirst(3);
        lst.insertAtLast(100);
        System.out.println(lst.size);
        lst.insertAtIndex(200, 0);
        lst.insertAtIndex(201, 4);
        lst.insertAtIndex(208, 8);
        lst.displayDLL();
    }
}
