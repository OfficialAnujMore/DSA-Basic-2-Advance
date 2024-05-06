package CollectionFramework.List.LinkedList.DoublyLL;

public class $3FindingPairs {
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

    public void result(int target) {

        Node first = head;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        // Finding summation

        while (first != last && last.next != first) {
            int summation = first.data + last.data;

            if (summation == target) {
                System.out.println("(" + first.data + ", "
                        + last.data + ")");
                first = first.next;
                last = last.prev;
            } else {
                if (summation > target) {
                    last = last.prev;

                } else {
                    first = first.next;
                }

            }

        }

    }

    public static void main(String[] args) {
        $3FindingPairs lst = new $3FindingPairs();
        lst.insert(9);
        lst.insert(8);
        lst.insert(6);
        lst.insert(5);
        lst.insert(4);
        lst.insert(2);
        lst.insert(1);
        lst.printDLL();
        lst.result(7);

    }
}
