public class SortLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node sortList(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node right = slow.next;
        slow.next = null;

        Node left = sortList(head);
        right = sortList(right);

        return merge(left, right);
    }

    public static Node merge(Node a, Node b) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (a != null && b != null) {

            if (a.data <= b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }

            temp = temp.next;
        }

        temp.next = (a != null) ? a : b;

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

        Node head = new Node(40);
        head.next = new Node(10);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);

        System.out.println("Before sorting:");
        printList(head);

        head = sortList(head);

        System.out.println("After sorting:");
        printList(head);
    }
}
