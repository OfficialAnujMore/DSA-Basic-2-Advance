package CollectionFramework.List.LinkedList;

public class $11SwapNodes {
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

    // public void result() {
    // if (head == null && head.next == null) {
    // return;
    // }

    // Node currNode = head;

    // while (currNode !=null && currNode.next != null) {

    // int temp = currNode.data;
    // currNode.data = currNode.next.data;
    // currNode.next.data = temp;
    // currNode = currNode.next.next;

    // }
    // }

    public void resultRecursive(Node head) {
        if (head != null && head.next != null) {
            int temp = head.data;
            head.data = head.next.data;
            head.next.data = temp;
            resultRecursive(head.next.next);

        }
    }

    public static void main(String[] args) {

        $11SwapNodes lst = new $11SwapNodes();

        for (int i = 1; i <= 10; i++) {
            lst.insertElements(i);

        }
        lst.printLL();
        // lst.result();
        lst.resultRecursive(lst.head);
        lst.printLL();
    }

}
