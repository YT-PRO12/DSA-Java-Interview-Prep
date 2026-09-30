public class RemoveNthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeNthFromEnd(Node head, int n) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        for (int i = 0; i <= n; i++) {

            if (fast == null) {
                return head;
            }

            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Before removal:");
        printList(head);

        head = removeNthFromEnd(head, 2);

        System.out.println("After removing 2nd node from end:");
        printList(head);
    }
}
