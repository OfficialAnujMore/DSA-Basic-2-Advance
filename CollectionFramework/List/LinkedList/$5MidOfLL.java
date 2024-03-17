package CollectionFramework.List.LinkedList;

public class $5MidOfLL {
    private Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void insertEle(int data) {
        Node newNode = new Node(data);

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
        System.out.print("Null");
        System.out.println("");
    }

    public void findMid() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {

            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

        }

        System.out.println("Element at mid is " + slowPtr.data);

    }

    public static void main(String[] args) {
        $5MidOfLL lst = new $5MidOfLL();
        lst.insertEle(1);
        // lst.insertEle(2);
        // lst.insertEle(2);
        lst.printLL();
        lst.findMid();
    }

}
