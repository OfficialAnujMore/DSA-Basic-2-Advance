package CollectionFramework.List.LinkedList.SinglyLL;

public class $4IdenticalLL {

    private Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    public void insertEle(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {

            System.out.print(currNode.data + "->");
            currNode = currNode.next;

        }
        System.out.print("NULL");
        System.out.println("");
    }

    public boolean checkIdentical(Node headA, Node headB) {

        if (headA == null && headB == null) {
            System.out.println("1");
            return true;
        }
        Node currNodeA = headA;
        Node currNodeB = headB;

        while (currNodeA != null && currNodeB != null) {

            if (currNodeA.data != currNodeB.data) {
                return false;
            }
            currNodeA = currNodeA.next;
            currNodeB = currNodeB.next;

        }
        return (currNodeA == null && currNodeB == null);
    }

    public static void main(String[] args) {
        $4IdenticalLL listA = new $4IdenticalLL();
        $4IdenticalLL listB = new $4IdenticalLL();

        listA.insertEle(0);
        listA.insertEle(1);
        listA.insertEle(2);
        listA.insertEle(3);

        listB.insertEle(0);
        listB.insertEle(1);
        listB.insertEle(2);
        listB.insertEle(3);

        listA.printLL();
        listB.printLL();

        System.out.println(
                listA.checkIdentical(listA.head, listB.head) ? "List A and B are  identical"
                        : "List A and B are not identical");
    }

}
