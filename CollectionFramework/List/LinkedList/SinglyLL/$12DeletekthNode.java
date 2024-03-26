package CollectionFramework.List.LinkedList.SinglyLL;

public class $12DeletekthNode {
    private Node head;
    static int k;
    static int n = 1;

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

        int n = 1;
        Node prevNode = null;
        Node currNode = head;

        while (currNode != null) {
            System.out.format("%d %d \n", k, n);
            if (k == 1) {
                head = null;
                return;
            } else if (n % k == 0) {

                prevNode.next = currNode.next;
                currNode = currNode.next;
            } else {
                prevNode = currNode;
                currNode = currNode.next;
            }
            n++;

        }
    }

    public static void main(String[] args) {

        $12DeletekthNode lst = new $12DeletekthNode();

        for (int i = 1; i <= 8; i++) {
            lst.insertElements(i);

        }
        k = 3;

        lst.printLL();
        lst.result();

        lst.printLL();
    }

}
