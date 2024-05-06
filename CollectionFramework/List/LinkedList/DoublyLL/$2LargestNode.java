package CollectionFramework.List.LinkedList.DoublyLL;

public class $2LargestNode {
    private Node head;

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
            return;
        }
        Node currNode = head;
        newNode.next = currNode;
        currNode.prev = newNode;
        head = newNode;

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

    public void result() {

        if (head == null) {
            return;
        }

        int maxEle = Integer.MIN_VALUE;
        Node currNode = head;

        while (currNode != null) {
            if (currNode.data > maxEle) {
                maxEle = currNode.data;
            }
            currNode = currNode.next;

        }

        System.out.println("Max element in given DLL is=> " + maxEle);

    }

    public static void main(String[] args) {
        $2LargestNode lst = new $2LargestNode();
        lst.insert(Integer.MAX_VALUE);
        lst.insert(1221);
        lst.insert(123121323);
        lst.insert(123126);
        lst.insert(Integer.MIN_VALUE);
        lst.insert(-1);
        lst.printDLL();
        lst.result();

    }
}
