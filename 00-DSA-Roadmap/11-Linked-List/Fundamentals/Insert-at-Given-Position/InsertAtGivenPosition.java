public class InsertAtGivenPosition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertAtPosition(Node head, int data, int position) {

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before insertion:");
        printList(head);

        head = insertAtPosition(head, 15, 2);

        System.out.println("After insertion at position 2:");
        printList(head);
    }
}
