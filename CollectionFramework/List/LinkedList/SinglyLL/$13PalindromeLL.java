package CollectionFramework.List.LinkedList.SinglyLL;

import java.util.Stack;

public class $13PalindromeLL {
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

    public boolean result() {
        if (head == null || head.next == null) {
            return false;
        }

        Stack<Integer> st = new Stack<>();
        int midIndex = 0;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            st.push(slow.data);
            fast = fast.next.next;
            slow = slow.next;
            midIndex++;
        }

        System.out.println(st);
        System.out.println(slow.data);
        while (st.size() > 0) {

            if (midIndex % 2 != 0) {
                // if (st.peek() != slow.data) {
                // return false;
                // }
                st.pop();
                break;
            }

            int data = st.pop();
            System.out.println("inside" + data);
            System.out.println("daa=>" + data + "==" + slow.data);
            if (slow.data != data) {
                return false;
            }

            slow = slow.next;

        }

        return true;
    }

    public static void main(String[] args) {

        $13PalindromeLL lst = new $13PalindromeLL();

        // for (int i = 1; i <= 10; i++) {
        // lst.insertElements(i);

        // }
        lst.insertElements(1);
        // lst.insertElements(0);
        lst.insertElements(2 );
        // lst.insertElements(1);
        // lst.printLL();
        System.out.println(lst.result());
        lst.printLL();
    }

}
