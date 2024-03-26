package CollectionFramework.List.LinkedList.SinglyLL;

public class $7MakeMiddleHead {
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

        Node tempNode = null;
        Node prevNode = head;
        Node currNode = head.next;

        // Finding middle element using two pointer approach
        while (currNode != null && currNode.next != null) {

            tempNode = prevNode;
            currNode = currNode.next.next;
            prevNode = prevNode.next;

        }
        tempNode.next = prevNode.next;
        prevNode.next = head;
        head = prevNode;
        System.out.println(prevNode.data);
        System.out.println(tempNode.data);

    }

    public static void main(String[] args) {

        $7MakeMiddleHead lst = new $7MakeMiddleHead();

        for (int i = 1; i <= 10; i++) {
            lst.insertElements(i);

        }
        lst.printLL();
        lst.result();
        lst.printLL();
    }

}
