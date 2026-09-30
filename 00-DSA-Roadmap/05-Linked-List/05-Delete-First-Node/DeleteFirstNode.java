public class DeleteFirstNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteFirst(Node head) {

        if (head == null) {
            return null;
        }

        return head.next;
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

        System.out.println("Before deletion:");
        printList(head);

        head = deleteFirst(head);

        System.out.println("After deleting first node:");
        printList(head);
    }
}
