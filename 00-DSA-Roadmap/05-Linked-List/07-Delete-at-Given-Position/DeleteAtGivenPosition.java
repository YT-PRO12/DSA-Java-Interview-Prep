public class DeleteAtGivenPosition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteAtPosition(Node head, int position) {

        if (head == null) {
            return null;
        }

        if (position == 1) {
            return head.next;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position");
            return head;
        }

        temp.next = temp.next.next;

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
        head.next.next.next = new Node(40);

        System.out.println("Before deletion:");
        printList(head);

        head = deleteAtPosition(head, 3);

        System.out.println("After deleting position 3:");
        printList(head);
    }
}
