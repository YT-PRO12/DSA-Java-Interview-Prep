public class ZigZagLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void zigZag(Node head) {

        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node curr = slow.next;
        slow.next = null;

        Node prev = null;

        while (curr != null) {

            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while (left != null && right != null) {

            Node nextLeft = left.next;
            Node nextRight = right.next;

            left.next = right;

            if (nextLeft == null) {
                break;
            }

            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Before zig-zag:");
        printList(head);

        zigZag(head);

        System.out.println("After zig-zag:");
        printList(head);
    }
}
