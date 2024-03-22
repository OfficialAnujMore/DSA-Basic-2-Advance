package CollectionFramework.List.LinkedList;

public class $9AddOneRecursive {
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

    public int result(Node head) {

        if (head == null) {
            return 1;
        }

        int carry = result(head.next);
        int sum = head.data + carry;
        head.data = sum % 10;
        return sum / 10;

    }

    public static void main(String[] args) {

        $9AddOneRecursive lst = new $9AddOneRecursive();
        lst.insertElements(5);
        lst.insertElements(7);
        lst.insertElements(9);
        lst.insertElements(9);
        lst.printLL();
        lst.result(lst.head);
        lst.printLL();
    }

}
