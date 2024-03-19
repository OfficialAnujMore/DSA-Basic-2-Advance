package CollectionFramework.List.LinkedList;

public class $6MoveLastToFirst {
    private Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertElements(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;

        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newNode;
    }

    private void printLL() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        System.out.print(currNode.data + "->");
        while (currNode.next != null) {
            currNode = currNode.next;
            System.out.print(currNode.data + "->");

        }

        System.out.print("Null");
        System.out.println("");
    }

    private void result() {
        if (head == null) {
            return;
        }

        Node currNode = head.next;
        Node prevNode = head;

        while (currNode != null) {

            if (currNode.next == null) {
                prevNode.next = head;
                currNode.next = head.next;
                head.next = null;
                head = currNode;
                return;
            }
            prevNode = currNode;
            currNode = currNode.next;

        }
    }

    public static void main(String[] args) {

        $6MoveLastToFirst lst = new $6MoveLastToFirst();

        for (int i = 1; i <= 4; i++) {
            lst.insertElements(i);

        }
        lst.printLL();
        lst.result();
        lst.printLL();
    }

}
