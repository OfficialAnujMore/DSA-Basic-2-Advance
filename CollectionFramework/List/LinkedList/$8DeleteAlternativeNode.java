package CollectionFramework.List.LinkedList;

public class $8DeleteAlternativeNode {
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

    public void result() {
        if (head == null) {
            return;
        }

        Node currNode = head;

        while (currNode != null && currNode.next != null) {
            currNode.next = currNode.next.next;
            currNode = currNode.next;

        }
    }

    public static void main(String[] args) {

        $8DeleteAlternativeNode lst = new $8DeleteAlternativeNode();

        for (int i = 1; i <= 5; i++) {
            lst.insertElements(i);

        }
        lst.printLL();
        lst.result();
        lst.printLL();
    }

}
