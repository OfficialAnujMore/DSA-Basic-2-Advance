package CollectionFramework.List.LinkedList;

public class $9AddOne {
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

    public void reverseLL() {

        if (head == null && head.next == null) {
            return;
        }

        Node prevNode = head;
        Node curNode = prevNode.next;

        while (curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;

            prevNode = curNode;
            curNode = nextNode;

        }

        head.next = null;
        head = prevNode;
    }

    public void summation() {
        Node currNode = head;

        while (currNode != null) {
            int carry = 1, sum;
            sum = currNode.data + carry;

            if (sum > 9) {
                carry = 1;
                sum = sum % 10;
                currNode.data = sum;
                currNode = currNode.next;
            } else {
                currNode.data = sum;
                return;
            }

        }
    }

    public void result() {
        if (head == null) {
            return;
        }
        reverseLL();
        summation();
        reverseLL();
    }

    public static void main(String[] args) {

        $9AddOne lst = new $9AddOne();
        lst.insertElements(1);
        lst.insertElements(8);
        lst.insertElements(9);
        lst.insertElements(0);
        lst.printLL();
        lst.result();
        lst.printLL();
    }

}
