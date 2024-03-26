package CollectionFramework.List.LinkedList.SinglyLL;

import java.util.Stack;

public class $10SumOfN {
    private Node head;
    static int summation = 0;
    static int n;

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

    public void result(int n) {
        if (head == null) {
            return;
        }
        Stack<Integer> st = new Stack<>();
        Node currNode = head;
        while (currNode != null) {
            st.push(currNode.data);
            currNode = currNode.next;

        }
        int summation = 0;
        while (n > 0) {
            int val = st.pop();
            n--;
            summation += val;

        }

        System.out.println(summation);
    }

    public void recursiveStackSummation(Node head) {
        if (head == null) {
            return;
        }

        recursiveStackSummation(head.next);

        if (n > 0) {
            summation += head.data;
            n--;

        }
    }

    public static void main(String[] args) {

        $10SumOfN lst = new $10SumOfN();

        for (int i = 1; i <= 10; i++) {
            lst.insertElements(i);

        }
        lst.printLL();
        // lst.result(3);
        n = 3;
        int num = n;
        lst.recursiveStackSummation(lst.head);
        System.out.format("Summation of last %d numbers is %d  ", num, summation);
    }

}
